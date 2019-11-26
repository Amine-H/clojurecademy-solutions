(ns symmetric-difference)



(defn symmetric-diff
  [v-set-1 v-set-2]
  
  (def v-only-in-set-1 (->> v-set-1 (filter #(not (contains? v-set-2 %)))))
  (def v-only-in-set-2 (->> v-set-2 (filter #(not (contains? v-set-1 %)))))
  
  (set (clojure.set/union v-only-in-set-1 v-only-in-set-2))
  
  )