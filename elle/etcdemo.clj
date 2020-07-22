; namespace and the included external APIs
(ns jepsen.etcdemo
    (:require [clojure [test :refer :all]
               [edn :as edn]]
              [clojure.java.io :as io]
              [dom-top.core :refer [real-pmap]]
              [elle [core :refer :all]
               [graph :as g]]
              [jepsen.txn :as txn]
              [knossos [history :as history]
               [op :as op]]
              [slingshot.slingshot :refer [try+ throw+]])
    (:import (java.io PushbackReader)))


; main function
(defn -main [& args]
    (println "Elle Experiment BEGIN")




    (println "Elle Experiment END")
)