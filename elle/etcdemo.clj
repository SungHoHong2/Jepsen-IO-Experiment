; namespace and the included external APIs
(ns jepsen.etcdemo
    ; jepsen.cli creates the workers
    (:require [jepsen.cli :as cli]
              ; jepsen.tests contains a noop-test that runs by the workers
              [jepsen.tests :as tests]))


; main function
(defn -main
  "Handles command line arguments. Can either run a test, or a web server for
  browsing results."
  [& args]
  (
    (println "Elle Experiment BEGIN")


    (println "Elle Experiment END")

  )
)