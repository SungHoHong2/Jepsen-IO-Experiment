(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  ; declare a variable x
  (def x (atom 1))

  ; loop until x is larger than five
  (while ( < @x 5 )
         ( do
           (println @x)
           (swap! x inc)
         )
  )

  ; for-each statement
  (doseq [n [0 1 2]]
    (println n)
  )

  (dotimes [n 5]
    (println n)
  )


  ; loop
  (println "Looping")
  (loop [x 10]
    (when (> x 1)
        (println x)
        (recur (- x 2))
    )
  )

)


