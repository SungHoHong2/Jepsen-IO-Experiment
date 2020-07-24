(ns tutorial.core
  (:gen-class)) ; namespace

(defmacro Simple [] (println "Hello"))

(defn -main [& args]
  (macroexpand '(Simple))
)