(ns hamkok.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [hamkok.core-test]))

(doo-tests 'hamkok.core-test)

