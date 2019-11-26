(ns split-a-sequence)

(defn split-seq [v-split-index v-seq]
  (def v-first-half (range 0 v-split-index))
  (def v-second-half (range v-split-index (count v-seq)))
  (defn get-nth [n] (nth v-seq n))
  [
    (->> v-first-half (map get-nth))
    (->> v-second-half (map get-nth))
    ]
  )