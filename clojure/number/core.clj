(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (println "hello numbers!")
  (def x 5)
  (def y 5.25)
  (println (type x))
  (println (type y))
)


