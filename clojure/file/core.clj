(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (def string1 (slurp "Example.txt"))
  (println string1)


)


