(ns dot-product)

(defn dot-product
  [v-seq-1 v-seq-2]
  (defn mul-seq [v-seq] (reduce * v-seq))
  (def v-zipped (map vector v-seq-1 v-seq-2))
  
  (->> v-zipped (map mul-seq) (reduce +))
  )