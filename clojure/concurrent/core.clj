(ns tutorial.core
  (:gen-class)) ; namespace

(defn -main [& args]


  (def names (ref []))

  (defn change [newname]
    (dosync
     (alter names conj newname)))

  (change "John")
  (change "Mark")
  (println @names)




)