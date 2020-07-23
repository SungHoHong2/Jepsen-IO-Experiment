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

  (def newemp (assoc emp :EmployeeName "Mark"))
  (println newemp)

  (def newemp2 (assoc emp :EmployeeRank "A"))
  (println newemp2)

  (def my-vector [1 2 3 4])
  (let [[a b c d] my-vector] (println a b c d))
  (let [[a b & the-rest] my-vector] (println a b the-rest))

  (def my-map {"a" 1 "b" 2})
  (let [{a "a" b "b"} my-map] (println a b))




)


