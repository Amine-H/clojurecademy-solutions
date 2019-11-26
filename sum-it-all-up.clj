(ns sum-it-all-up)

(defn sum [n-vector]
  (->> (vec n-vector) (reduce +)))
