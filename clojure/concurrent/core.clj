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

  (def var1 (ref 10))
  (def var2 (ref 20))
  (println @var1 @var2)

  (defn change-value [var1 var2 newvalue]
    (dosync
     (alter var1 - newvalue)
     (alter var2 + newvalue)))


  (change-value var1 var2 20)
  (println @var1 @var2)

)