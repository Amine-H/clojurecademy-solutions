(ns interpose-a-seq)

(defn interpose-seq [v-val v-seq]
	(rest (loop [v-seq v-seq
           v-acc (empty v-seq)]
      (cond
        (empty? v-seq) v-acc
        :else (recur (rest v-seq) (conj v-acc v-val (first v-seq)))
        )
      ))
  )
