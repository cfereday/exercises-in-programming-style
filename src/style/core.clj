(ns style.core
  (:gen-class))

(defn frequency-task [sentence]
  (let [sentence-to-lower-case (.toLowerCase sentence)]
    sentence-to-lower-case))
