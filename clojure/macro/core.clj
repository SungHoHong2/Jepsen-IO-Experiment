(ns tutorial.core
  (:gen-class)) ; namespace



(defn -main [& args]

  (defmacro Simple [] (println "Hello"))
  (macroexpand '(Simple))
  (Simple())

  (defmacro my-first-macro []
    (list reverse "Hello World"))
  (macroexpand '(my-first-macro))



)


