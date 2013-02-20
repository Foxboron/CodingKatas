(ns kata.core)

(defn parse-int [s]
  (println s)
  (let [st (flatten (map #(clojure.string/split (str %) #"\D+") s))]
    (map #(Integer/parseInt %) st)))

(defn add
  "Add items together"
  [args]
  (let [nums (parse-int args)]
   (reduce + nums)))

(defn -main
  "I don't do a whole lot."
  ([] nil)
  ([& args] (add args)))
