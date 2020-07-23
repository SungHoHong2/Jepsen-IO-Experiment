(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  ; print out the types
  (def x 5)
  (def y 5.25)
  (println (type x))
  (println (type y))
)


