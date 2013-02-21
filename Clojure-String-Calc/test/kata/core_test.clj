(ns kata.core-test
  (:use clojure.test
        kata.core))

(deftest add-test
  (testing "Testing the add function."
    (is (= (-main) nil))
    (is (= (-main "1") 1))
    (is (= (-main "1 2") 3))
    (is (= (-main "1\n2 3") 6))
    (is (= (-main "//;\n1;2") 3))))
