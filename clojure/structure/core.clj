(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (defstruct Employee :EmployeeName :Employeeid)

  (println "Initialize with struct")
  (def emp (struct Employee "John" 1))
  (println emp)

  (println "Initialize with struct-map")
  (def emp2 (struct-map Employee :EmployeeName "Chris" :Employeeid 2))
  (println emp2)


  (println "Print variables from the instance")
  (println (:Employeeid emp))
  (println (:EmployeeName emp))

  (println "copy a new struct with name Mark")
  (def newemp (assoc emp :EmployeeName "Mark"))
  (println newemp)

  (println "copy a new struct with a rank A")
  (def newemp2 (assoc emp :EmployeeRank "A"))
  (println newemp2)

)


