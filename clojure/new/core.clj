(ns tutorial.core
  (:gen-class)) ; namespace

(defn -main [& args]

  (println "assoc")
  (def test1 {})
  (assoc test1 :key1 "value" :key2 "another value")
  (println test1)


  (def test2 {:account-no 12345678 :lname "Jones" :fnam "Fred"})
  (assoc test2 :fnam "Sue")
  (println test2)


)