(ns drop-every-nth-item)

(defn drop-every-nth [v-seq v-index]
  (def v-seq-count (count v-seq))
  (def v-from 1)
  (def v-to (inc v-seq-count))
  (def v-index-seq (range v-from v-to))
  (->>
    (map vector v-seq v-index-seq)
    (filter (fn [v-el] (not= 0 (mod (nth v-el 1) v-index))))
    (map first)
    )
  )