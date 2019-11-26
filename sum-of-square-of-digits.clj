(ns sum-of-square-of-digits)

(defn square
  [v-number]
  (* v-number v-number))

(defn number-digits
  [v-number]
  (loop
    [v-number v-number
     v-acc '()
     ]
    (cond
      (< v-number 10) (conj v-acc v-number)
      :else (recur (quot v-number 10) (conj v-acc (rem v-number 10)))
      )))

(defn square-dig-number
  [v-number]
  (->> (number-digits v-number) (map square) (reduce +)))

(defn zip-seq
  [v-seq-1 v-seq-2]
  (map vector v-seq-1 v-seq-2)
  )

(defn square-dig
  [v-seq]
  (def v-seq-squared-digits (->> v-seq (map square-dig-number)))
  (def v-pairs (zip-seq v-seq v-seq-squared-digits))
  (count (filter (fn [v-pair] (< (first v-pair) (second v-pair))) v-pairs))
  )