(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (def counter (agent 0))
  (println counter)
  (println @counter)

)


