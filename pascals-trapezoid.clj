(ns pascals-trapezoid)

(defn get-value-or-0
  [v-seq v-index]
  (if (contains? v-seq v-index) (nth v-seq v-index) 0))

(defn calc-value
  [v-seq v-index]
  (+'
    (get-value-or-0 v-seq (dec v-index))
    (get-value-or-0 v-seq v-index)))

(defn next-trapezoid
  [v-prev]
  (apply vector (->> (range (inc (count v-prev))) (map #(calc-value v-prev %)))))

(defn trapezoid
  [v-seq]
  (lazy-seq (cons v-seq (trapezoid (next-trapezoid v-seq)))))
