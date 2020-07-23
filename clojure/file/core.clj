(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]


  (spit "example.txt"
        "This is a string"))

  (def string1 (slurp "example.txt"))
  (println string1)

  (with-open [rdr (clojure.java.io/reader "example.txt")]
    (reduce conj [] ( line-seq rdr)))





)


