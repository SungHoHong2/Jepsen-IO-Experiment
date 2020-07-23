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

  ; append 1 from the list
  (print "Append: ") (println (list* 1 [2,3]))

  ; return the first element of the list
  (print "First element: ") (println (first (list 1 2,3)))




)


