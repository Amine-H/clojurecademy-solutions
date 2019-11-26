(ns pascals-triangle)

(defn calc-val
  [v-prev-row v-col]
  (+ (nth v-prev-row (dec v-col)) (nth v-prev-row v-col))
  )

(defn pascals-triangle
  [v-row]
  (cond
    (= v-row 1) [1]
    (= v-row 2) [1 1]
    :else (concat [1] (->> (range 1 (dec v-row)) (map #(calc-val (pascals-triangle (dec v-row)) %))) [1])
    )
  )