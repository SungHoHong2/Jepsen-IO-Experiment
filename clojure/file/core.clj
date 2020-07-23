(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]


  (spit "example.txt"
        "This is a string")

  (with-open [w (clojure.java.io/writer "example.txt" :append true)]
    (.write w (str "hello" "world")))

  (def string1 (slurp "example.txt"))
  (println string1)



)


