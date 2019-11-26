(ns pack-a-sequence)

(defn pack-seq [v-seq]
  (loop [v-seq (rest v-seq)
         v-current (first v-seq)
         v-group [(first v-seq)]
         v-acc []
         ]
    (cond
      (empty? v-seq) (conj v-acc v-group)
      (= v-current (first v-seq)) (recur (rest v-seq) v-current (conj v-group v-current) v-acc)
      :else (recur (rest v-seq) (first v-seq) [(first v-seq)] (conj v-acc v-group))
      )
    )
  )