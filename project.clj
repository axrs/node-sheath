(defproject io.axrs/node-shuck "0.0.0-SNAPSHOT"
  :description "Node and NPM Shell Executor for Clojure"
  :min-lein-version "2.8.1"
  :url "https://github.com/axrs/node-shuck"
  :license {:name         "Eclipse Public License - v 2.0"
            :url          "https://www.eclipse.org/legal/epl-v20.html"
            :distribution :repo}
  :dependencies [[io.axrs/shuck "0.0.0-SNAPSHOT" :scope "provided"]]
  :clean-targets ["target"]
  :source-paths ["src"]
  :test-paths ["test"]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]]}})
