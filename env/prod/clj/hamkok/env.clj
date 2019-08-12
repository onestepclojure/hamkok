(ns hamkok.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[hamkok started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[hamkok has shut down successfully]=-"))
   :middleware identity})
