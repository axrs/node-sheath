(ns io.axrs.shuck.npm
  (:require
    [io.axrs.shuck.core :as shuck]))

(defn run
  "Runs NPM with provided args"
  [& args]
  (apply shuck/sh "npm" args))

(defn install
  "Installs NPM package or dependencies"
  [& args]
  (apply run "install" args))

(defn ci
  "Install a project with a clean slate"
  []
  (run "install"))

(defn outdated
  "Finds and prints all out-dated top level (depth=0) dependencies"
  []
  (run "outdated" "--depth=0"))

(defn version []
  (run "--version"))

