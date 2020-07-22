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
              )
    )

(defn -main [& args]
    (println "Elle Experiment BEGIN")

    (hi/greet "Sungho")





    (println "Elle Experiment END")
)