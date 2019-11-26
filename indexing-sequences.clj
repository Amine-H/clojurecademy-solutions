(ns indexing-sequences)

(defn index-seq
  [v-seq]
  (def v-count (count v-seq))
  (map vector v-seq (range v-count))
  )