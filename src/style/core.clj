(ns style.core
  (:gen-class)
  (:require [clojure.string :as str]))


(defn count-word
  [word sentence]
  (count (re-seq (re-pattern word) (str/lower-case sentence))))

(defn map-words-and-count
  [unique-words sentence]
  (map #(assoc {} :word %1 :count (count-word %1 sentence)) unique-words))

(defn lower-case-words
  [sentence]
  (str/split (str/lower-case sentence) #" "))

(defn unique-words
  [sentence]
  (set sentence))

(defn format
  [mapped-sentence]
  (map #(str (:word %1) " - " (:count %1) "\n") mapped-sentence))

(defn frequency-task [sentence]
  (let [words (lower-case-words sentence)
        unique-words (unique-words words)
        mapped-sentence (map-words-and-count unique-words sentence)]
    mapped-sentence))


