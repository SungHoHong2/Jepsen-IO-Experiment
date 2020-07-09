(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (defstruct Employee :EmployeeName :Employeeid)
  (def emp (struct Employee "John" 1))
  (println emp)

  (def emp2 (struct-map Employee :EmployeeName "Chris" :Employeeid 2))
  (println emp2)

  (println (:Employeeid emp))
  (println (:EmployeeName emp))

)


