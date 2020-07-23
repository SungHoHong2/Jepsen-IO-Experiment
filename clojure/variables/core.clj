(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  ; print out the number types
  (def x 5)
  (def y 5.25)
  (println (type x))
  (println (type y))


  (println (list 1 2 3 4))

  (println (list 'a 'b 'c 'd))
  (println (list* 1 [2,3]))
  (println (first (list 1 2,3)))




)


