(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct Employee "John" 1))
  (println emp)

  )


