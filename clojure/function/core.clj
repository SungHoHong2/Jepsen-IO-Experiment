(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  ; basic functions

  (def x 1)
  (def y 1.25)
  (def str1 "Hello")
  (println x)
  (println y)
  (println str1)

  ; anonymous function

  ((fn [x] (println(* 2 x))) 2)

  ;



)


