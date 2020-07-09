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


  (defn demo1 [] (println(* 2 2)))
  (defn demo2 [x] (println(* 2 x)))
  (defn demo3 [x y] (println(* 2 x y)))

  (demo1)
  (demo2 1)
  (demo3 2 3)



)


