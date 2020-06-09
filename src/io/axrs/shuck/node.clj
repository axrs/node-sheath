(ns io.axrs.shuck.node
  (:require
    [io.axrs.shuck.core :as shuck]))

(defn run
  "Runs Node with provided args"
  [& args]
  (apply shuck/sh "node" args))

(defn version []
  (run "--version"))

