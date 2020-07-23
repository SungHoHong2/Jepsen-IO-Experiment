(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (def string1 (slurp "example.txt"))
  (println string1)


)


