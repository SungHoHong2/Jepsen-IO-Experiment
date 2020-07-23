(ns tutorial.core
  (:gen-class)) ; namespace


(defn -main [& args]

  (println "Numbers")
  (def x 5)
  (def y 5.25)
  (println (type x))
  (println (type y))

  (println "\nList")
  (print "Append: ") (println (list 1 2 3 4))

  (println (list 'a 'b 'c 'd))
  (print "Append: ") (println (list* 1 [2,3]))
  (print "Append: ") (println (cons 0 (list 1 2,3)))
  (print "Append Multiple: ") (println (conj (list 1 2,3) 4 5))

  (print "First element: ") (println (first (list 1 2,3)))
  (print "Third element: ") (println (nth (list 1 2,3) 2))

  (println "\nSet")
  (println (set '(1 1 2 2)))
  (println (sorted-set 3 2 1))
  (print "Get: ") (println (get (set '(3 2 1)) 2))
  (print "Get: ") (println (get (set '(3 2 1)) 3))

  (println "\nVector")
  (println (vector 1 2 3))

  (println "\nHashmap")
  (def hashMap (hash-map "z" "1" "b" "2" "a" "3"))
  (println hashMap)
  (def sortedMap (sorted-map "z" "1" "b" "2" "a" "3"))
  (println sortedMap)

  (println "\nAtom")
  (def myatom (atom 1))
  (println @myatom)

  (println "\nMeta")
  (def my-map (with-meta [1 2 3] {:prop "values"}))
  (println (meta my-map))

  (def m ^:hi [1 2 3])
  (meta (with-meta m {:bye true}))

  (println (m))


)


