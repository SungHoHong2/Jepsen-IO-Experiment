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

  ; Anonymous function

  ((fn [x] (println(* 2 x))) 2)

  ; Clojure functions

  (defn demo1 [] (* 2 2))
  (defn demo2 [x] (* 2 x))
  (defn demo3 [x y] (* 2 x y))

  (println(demo1))
  (println(demo2 1))
  (println(demo3 2 3))

  ; Variadic Functions
  (defn demo
    [message & others]
    (
      str message (clojure.string/join " " others)
    )
  )
  (println(demo "Hello" "This" "is" "the" "message"))


  ; Higher Order Functions
  (println(filter even? (range 0 10)))









)


