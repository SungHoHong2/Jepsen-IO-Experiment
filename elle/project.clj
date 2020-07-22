; project.clj specifies how to build and run the code
(defproject jepsen.etcdemo "0.1.0-SNAPSHOT"
  :description "A Jepsen test for etcd"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ; the main function that will be invoked first
  :main jepsen.etcdemo
  ; specifies the 3rd party libraries
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [jepsen "0.1.13"]
                 ; a library for talking to etcd
                 [slingshot "0.12.2"]
                 [dom-top "1.0.5"]
                 [knossos "0.3.7"
                  :exclusions [org.slf4j/slf4j-log4j12]]
                 [org.clojure/tools.logging "0.6.0"]
                 [rhizome "0.2.9"]
                 [jepsen.txn "0.1.2"]
                 [io.lacuna/bifurcan "0.1.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]
                                  [spootnik/unilog "0.7.24"]]}}
  :jvm-opts ["-server"
             "-XX:+PrintGC"]
  :repl-options {:init-ns elle.core}
                 )