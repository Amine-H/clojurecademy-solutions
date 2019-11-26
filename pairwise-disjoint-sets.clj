(ns pairwise-disjoint-sets)

(defn disjoint-sets
  [v-sets]
  (apply distinct? (mapcat seq v-sets))
  )