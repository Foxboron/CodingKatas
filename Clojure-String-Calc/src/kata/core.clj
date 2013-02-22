(ns kata.core
  (:require [clojure.string :refer (split)]))

(defn parse-int
  [s]
  (let [delim (re-find #"[^/\s\d]+" (apply str s))
        pat (re-pattern (str "[\\D" delim "]"))
        st (flatten (map #(split (str %) pat) s))]
    (map #(Integer/parseInt %) (remove empty? st))))

(defn add
  "Add items together"
  [args]
  (let [nums (parse-int args)]
   (reduce + nums)))

(defn -main
  "I don't do a whole lot."
  ([] nil)
  ([& args] (add args)))
