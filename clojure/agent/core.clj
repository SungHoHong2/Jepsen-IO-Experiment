(ns tutorial.core
  (:gen-class)) ; namespace



(defn -main [& args]

  (def counter (agent 0))
  (println counter)
  (println @counter)

  (send counter + 100)
  (println "Incrementing Counter")
  (println @counter)

  (send-off counter + 100)
  (println @counter)
  (println @counter)

  (println (await-for 200 counter))
  (println @counter)

  (send-off counter + 100)
  (await counter)
  (println @counter)

  (def x (atom 0))
  (add-watch x :watcher
             (fn [key atom old-state new-state]
               (println "The value of the atom has been changed")
               (println "old-state" old-state)
               (println "new-state" new-state)))
  (reset! x 2)

  (shutdown-agents)

)


