(defproject io.axrs/node-shuck "0.0.0-SNAPSHOT"
  :description "Node and NPM Shell Executor for Clojure"
  :min-lein-version "2.8.1"
  :dependencies [[io.axrs/shuck "0.0.0-SNAPSHOT" :scope "provided"]]
  :clean-targets ["target"]
  :source-paths ["src"]
  :test-paths ["test"]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]]}})
