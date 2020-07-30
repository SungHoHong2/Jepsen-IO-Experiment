(ns jepsen.redis.core
    "Top-level test runner, integration point for various workloads and nemeses."
    (:require [elle.list-append :as a]
              [clojure [pprint :refer [pprint]]
               [string :as str]]))


(defn -main
  [& args]

  (println "BEGIN Elle")

  (def h [{:type :ok, :value [[:append :x 1] [:r :y [1]]]}
          {:type :ok, :value [[:append :x 2] [:append :y 1]]}
          {:type :ok, :value [[:r :x [1 2]]]}])

  (pprint (a/check {:consistency-models [:serializable], :directory "out"} h))

  (println "END Elle")

  )
