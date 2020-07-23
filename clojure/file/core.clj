(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (def string1 (slurp "example.txt"))
  (println string1)

  (with-open [rdr (clojure.java.io/reader "example.txt")]
    (reduce conj [] ( def string2 (line-seq rdr))))




)


