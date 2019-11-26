(ns map-construction)

(defn my-zipmap [v-keys v-values]
  (loop [
          v-keys v-keys
          v-values v-values
          v-acc {}
          ]
    (cond
      (or (empty? v-keys) (empty? v-values)) v-acc
      :else (recur (rest v-keys) (rest v-values) (assoc v-acc (first v-keys) (first v-values)))
      )
    )
  )