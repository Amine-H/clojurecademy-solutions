(ns re-implement-iterate)

(defn my-iterate
  [v-func v-val]
  (lazy-seq (cons v-val (my-iterate v-func (v-func v-val))))
  )