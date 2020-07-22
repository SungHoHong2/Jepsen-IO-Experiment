; namespace and the included external APIs
(ns jepsen.etcdemo
    (:require [jepsen.cli :as cli]
              [jepsen.tests :as tests]
              [clojure [test :refer :all]
               [edn :as edn]]
              [clojure.java.io :as io]
              [dom-top.core :refer [real-pmap]]
              )
    (:load "elle/test.clj")
    )



; main function
(defn -main [& args]
    (println "Elle Experiment BEGIN")




    (println "Elle Experiment END")
)