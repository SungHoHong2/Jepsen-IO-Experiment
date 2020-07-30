;(ns jepsen.redis.core
;    "Top-level test runner, integration point for various workloads and nemeses."
;    (:require [elle.list-append :as a]
;              [clojure [pprint :refer [pprint]]
;               [string :as str]]))

(ns jepsen.redis.core
    (:refer-clojure :exclude [test])
    (:require [clojure [pprint :refer [pprint]]
               [test :refer :all]]
              [elle [core :as elle]
               [core-test :refer [read-history]]
               [list-append :refer :all]
               [graph :as g]
               [util :refer [map-vals]]]
              [jepsen.txn :as txn]
              [knossos [history :as history]
               [op :as op]]
              [slingshot.slingshot :refer [try+ throw+]]))



(defn -main
  [& args]

  (println "BEGIN Elle")

  ; G0: Write Cycles


  ; G1a: Aborted Read

  ; G1b: Intermediate Reads

  ; G1c: Circular Information Flow
;  (def h [{:type :ok, :value [[:append :x 1] [:r :y [1]]]}
;          {:type :ok, :value [[:append :x 2] [:append :y 1]]}
;          {:type :ok, :value [[:r :x [1 2]]]}])
;
;  (pprint (a/check {:consistency-models [:serializable], :directory "out"} h))


  ; G2: Anti-dependency Cycles






  ; Dirty Read

  ; Dirty Write

  ; Fuzzy Read

  ; Lost Update





  (println "END Elle")

  )
