(ns style.core-test
  (:require [clojure.test :refer :all]
            [style.core :refer :all]
            [clojure.string :as str]))

(deftest style-test
  (testing "Given a sentence the return will be map of the individual words decapitalised & in a vector"
    (let [sentence "I knew you Were trouble When you Walked In"
          result (frequency-task sentence)
          expected-result ["i" "knew" "you" "were" "trouble" "when" "you" "walked" "in"]]
      (is (= result expected-result)))
    ))
