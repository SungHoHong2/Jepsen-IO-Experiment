(ns tutorial.core
  (:gen-class)) ; namespace


(defmacro Simple [] (println "Hello"))

(defn -main [& args]

  (macroexpand '(Simple))

  (defmacro my-first-macro []
    (list reverse "Hello World"))
  (macroexpand '(my-first-macro))



)


