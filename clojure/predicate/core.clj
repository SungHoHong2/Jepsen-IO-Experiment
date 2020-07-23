(ns tutorial.core
    (:require [clojure.set :as set])
    (:gen-class)) ; namespace


(defn -main [& args]

  (def x (even? 0))
  (println x)

  (def x (neg? 2))
  (println x)

  (def x (odd? 3))
  (println x)

  (def x (pos? 3))
  (println x)

)


