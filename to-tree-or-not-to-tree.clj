(ns to-tree-or-not-to-tree)

(defn tree?
  [v-seq]
  
  (or
    (nil? v-seq)
    (and (coll? v-seq) (= (count v-seq) 3) (tree? (nth v-seq 1)) (tree? (nth v-seq 2)))
    )
  )