(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (println "Hello, Sungho!")
  (println (+ 1 2))
  (println (str "Hello World"))
  (println (+ 1 2 3))
  (println [+ 1 2 3])

  ;; The below code declares a integer variable
  (def x 1)
  ;; The below code declares a float variable
  (def y 1.25)
  ;; The below code declares a string variable
  (def str1 "Hello")
  (println x)
  (println y)
  (println str1)

  ;; The below code declares a Boolean variable with the name of status
  (def status true)

  ;; The below code declares a Boolean variable with the name of STATUS
  (def STATUS false)

  ;; The below code declares a variable with an underscore character.
  (def _num1 2)
)


