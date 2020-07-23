(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (defmacro Simple []
    (println "Hello"))
  (macroexpand '(Simple))




)


