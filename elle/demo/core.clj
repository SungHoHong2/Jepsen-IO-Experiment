(ns jepsen.redis.core
    "Top-level test runner, integration point for various workloads and nemeses."
    (:require [clojure.tools.logging :refer [info warn]]
              [clojure [pprint :refer [pprint]]
               [string :as str]]
              [elle.list-append :as a]
              [jepsen [cli :as cli]
               [checker :as checker]
               [control :as c]
               [generator :as gen]
               [tests :as tests]
               [util :as util :refer [parse-long]]]
              [jepsen.os.debian :as debian]
              [jepsen.redis [append :as append]
               [db     :as rdb]
               [nemesis :as nemesis]]))


(defn -main
  [& args]

  (println "BEGIN Elle")



  (println "END Elle")

  )
