(ns style.core-test
  (:require [clojure.test :refer :all]
            [style.core :refer :all]))

(deftest style-test
  (testing "A sentence will be normalized have no capitalization"
    (let [sentence "I knew you Were trouble When you Walked In"
          result (frequency-task sentence)
          expected-result "i knew you were trouble when you walked in"]
      (is (= result expected-result))))
  (testing "Given a "))
