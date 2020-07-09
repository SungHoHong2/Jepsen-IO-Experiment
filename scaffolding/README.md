### Test scaffolding

1. write a test for etcd: a distributed consensus system.
```bash
$ lein new jepsen.etcdemo
$ cd jepsen.etcdemo
$ ls
```

2. editing `project.clj`, which specifies the project's dependencies and other metadata
  - add a :main namespace, which is how we'll run the test from the command line
  - pull in the Jepsen library, and Verschlimmbesserung
    - a library for talking to etcd
```clj
(defproject jepsen.etcdemo "0.1.0-SNAPSHOT"
  :description "A Jepsen test for etcd"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main jepsen.etcdemo
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [jepsen "0.1.13"]
                 [verschlimmbesserung "0.1.3"]])
```

3. edit `src/jepsen/etcdemo.clj`
```clj
(ns jepsen.etcdemo)
(defn -main
  "Handles command line arguments. Can either run a test, or a web server for
  browsing results."
  [& args]
  (prn "Hello, world!" args))
```

4. test `lein run hi there`
```bash
$ lein run hi there
"Hello, world!" ("hi" "there")
```
