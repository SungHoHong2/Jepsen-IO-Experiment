; namespace and the included external APIs
(ns jepsen.etcdemo
    (:require [jepsen.cli :as cli]
              [jepsen.tests :as tests]
              [clojure [test :refer :all]
               [edn :as edn]]
              [clojure.java.io :as io]
              [dom-top.core :refer [real-pmap]]
              [jepsen.hello :as hi]
              [jepsen.elle.core :refer :all]
              [jepsen.elle.graph :as g]
              [jepsen.txn :as txn]
              [knossos [history :as history]
               [op :as op]]
              [slingshot.slingshot :refer [try+ throw+]])
    (:import (java.io PushbackReader)))


(defn -main [& args]
    (println "Elle Experiment BEGIN")

    (hi/greet "Sungho")

    (deftest process-graph-test
      (let [o1 {:index 0 :process 1 :type :ok}
            o2 {:index 1 :process 2 :type :ok}
            o3 {:index 2 :process 2 :type :ok}
            o4 {:index 3 :process 1 :type :ok}
            history [o1 o2 o3 o4]]
        (is (= {o1 #{o4}, o2 #{o3}, o3 #{}, o4 #{}}
               (g/->clj (:graph (process-graph history)))))))









    (println "Elle Experiment END")
)