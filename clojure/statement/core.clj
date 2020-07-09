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


)


