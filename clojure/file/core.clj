(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]


  (spit "example.txt"
        "This is a string")

  (def string1 (slurp "example.txt"))
  (println string1)



)


