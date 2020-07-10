(ns jepsen.etcdemo
    (:require [clojure.tools.logging :refer :all]
              [clojure.string :as str]
              [jepsen [cli :as cli]
               [control :as c]
               [db :as db]
               [tests :as tests]]
              [jepsen.control.util :as cu]
              [jepsen.os.debian :as debian]))

(def dir "/opt/etcd")
(def binary "etcd")
(def logfile (str dir "/etcd.log"))
(def pidfile (str dir "/etcd.pid"))


(defn db
  "Etcd DB for a particular version."
  [version]
  (reify db/DB
         (setup! [_ test node]
                 (info node "installing etcd" version)
                 (c/su
                  (let [url (str "https://storage.googleapis.com/etcd/" version
                                 "/etcd-" version "-linux-amd64.tar.gz")]
                    (cu/install-archive! url dir))))

         (teardown! [_ test node]
                    (info node "tearing down etcd"))))

(defn node-url
  "An HTTP url for connecting to a node on a particular port."
  [node port]
  (str "http://" (name node) ":" port))

(defn peer-url
  "The HTTP url for other peers to talk to a node."
  [node]
  (node-url node 2380))

(defn client-url
  "The HTTP url clients use to talk to a node."
  [node]
  (node-url node 2379))

(defn initial-cluster
  "Constructs an initial cluster string for a test, like
  \"foo=foo:2380,bar=bar:2380,...\""
  [test]
  (->> (:nodes test)
       (map (fn [node]
              (str node "=" (peer-url node))))
       (str/join ",")))

(defn etcd-test
  "Given an options map from the command line runner (e.g. :nodes, :ssh,
  :concurrency ...), constructs a test map."
  [opts]
  (merge tests/noop-test
         opts
         {:name "etcd"
          :os   debian/os
          :db   (db "v3.1.5")}))

(defn -main
  "Handles command line arguments. Can either run a test, or a web server for
  browsing results."
  [& args]
  (cli/run! (cli/single-test-cmd {:test-fn etcd-test})
            args))