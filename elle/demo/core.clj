(ns jepsen.redis.core
    "Top-level test runner, integration point for various workloads and nemeses."
    (:require [elle.list-append :as a]
              [clojure [pprint :refer [pprint]]
               [string :as str]]))

(defn -main
  [& args]

    ; G0: A write cycle == (P0) Dirty Write
    ;
    ; T1: W(x1)                   W(y1) c
    ; T2:       W(x2)   W(y2) c
    ; -----------------------------------
    ; T3: R(x1)(y2)  R(x2)(y1)

    (def G0 [
              ; transaction 1
              {:type :ok, :value [[:append :x 1] [:append :y 1]]}
              ; transaction 2
              {:type :ok, :value [[:append :x 2] [:append :y 2]]}
              ; transaction 3: reads updated x and y from both T1 and T2
              {:type :ok, :value [[:r :x [1 2]] [:r :y [2 1]]]}])

    ; assuming that the database is serializable and returns the anomaly to directory out
    (pprint (a/check {:consistency-models [:serializable], :directory "out"} G0))


    ; G1a: Aborted Read: T2 sees T1's failed write


    (def G1a [
              ; transaction 1
              {:type :fail, :value [[:append :x 1]]}
              ; transaction 2: reads the aborted x from T1
              {:type :ok, :value [[:r :x [1]]]}])

    (pprint (a/check {:consistency-models [:serializable], :directory "out"} G1a))


  ; G1b: Intermediate Reads

  ; G1c: Circular Information Flow



  ; G2: Anti-dependency Cycles

  ; Dirty Read

  ; Dirty Write

  ; Fuzzy Read

  ; Lost Update






  )
