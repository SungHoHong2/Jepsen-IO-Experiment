(ns tutorial.core
  (:gen-class)) ; namespace

(defn -main [& args]

  (println "assoc BEGIN")
  (def test1 {})
  (assoc test1 :key1 "value" :key2 "another value")
  (println "assoc empty hashmap: " test1)

  (def test2 {:account-no 12345678 :lname "Jones" :fnam "Fred"})
  (def modified (assoc test2 :fnam "Sue"))
  (println "before assoc" test2)
  (println "after assoc" modified)
  (println "assoc END")


  (for [x [0 1 2 3 4 5]
        :let [y (* x 3)]
        :when (even? y)]
    y)

  (def animals ["pig" "cow" "goat" "cat" "dog" "rabbit"])

  (defn pluralise
    "Pluralise a given string value"
    [animal]
    (str animal "s"))



;  (def animals ["pig" "cow" "goat" "cat" "dog" "rabbit"])
;  (println animals)
;  (map pluralise animals)
;  (println animals)



)