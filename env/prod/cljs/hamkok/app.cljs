(ns hamkok.app
  (:require [hamkok.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init! false)
