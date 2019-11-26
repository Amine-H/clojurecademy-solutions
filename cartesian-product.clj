(ns cartesian-product)

(defn cartesian
  [v-set-1 v-set-2]
  (defn multiply-with-set-2 [v-el] (->> v-set-2 (map #(vec [v-el %]))))
  (set (mapcat identity (->> v-set-1 (map multiply-with-set-2))))
  )