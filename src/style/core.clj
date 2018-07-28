(ns style.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn frequency-task [sentence]
  (str/split (str/lower-case sentence) #" "))
