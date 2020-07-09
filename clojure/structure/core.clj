(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct Employee "John" 1))
  (println emp)

  (def emp2 (struct-map Employee :EmployeeName "John" :Employeeid 1))
  (println emp2)



)


