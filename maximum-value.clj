(ns maximum-value)

(defn get-max [a b]
  (if (> a b) a b))

(defn my-max [& args]
  (->> args (reduce get-max))
  )