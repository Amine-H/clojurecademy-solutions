(ns re-implement-map)

(defn my-map
  [v-func v-seq]
  (cond
    (empty? v-seq) []
    :else (lazy-seq (cons (v-func (first v-seq)) (my-map v-func (rest v-seq))))
    )
  )