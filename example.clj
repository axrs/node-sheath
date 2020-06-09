#!/usr/bin/env cljog
(deps '[[io.axrs/shuck "0.0.0-SNAPSHOT"]
        [io.axrs/node-shuck "0.0.0-SNAPSHOT"]])

(require
  '[io.axrs.shuck.core :as shuck]
  '[io.axrs.shuck.npm :as npm]
  '[io.axrs.shuck.node :as node])

(shuck/with-print-out
  (node/version)
  (npm/version)
  (shuck/done))
