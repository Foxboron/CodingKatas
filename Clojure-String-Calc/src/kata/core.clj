(ns kata.core)

(defn parse-int
  [s]
  (let [delim (re-find #"[^/\d]" (apply str s))
        pat (re-pattern (re-pattern (str "[\\D" delim "]")))
        st (flatten (map #(clojure.string/split (str %) pat) s))]
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
