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


  (defn demo1 [] (* 2 2))
  (defn demo2 [x] (* 2 x))
  (defn demo3 [x y] (* 2 x y))

  (println demo1)



)


