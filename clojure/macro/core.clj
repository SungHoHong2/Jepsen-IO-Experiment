(ns tutorial.core
  (:gen-class)) ; namespace



(defn -main [& args]

  (defmacro Simple [] (println "Hello"))
  (macroexpand '(Simple))

  (defmacro my-first-macro []
    (list reverse "Hello World"))
  (macroexpand '(my-first-macro))

  (defmacro infix
    "Use this macro when you pine for the notation of your childhood"
    [infixed]
    (list (second infixed) (first infixed) (last infixed)))

  (macroexpand '(infix (1 + 1)))


)


