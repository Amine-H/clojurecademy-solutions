(ns group-a-sequence)

(defn my-group-by
  [v-func v-seq]
  (defn my-group-by-tail
    [v-map v-val]
    (def v-key (v-func v-val))
    (assoc v-map v-key (vec(conj (get v-map v-key) v-val)))
    )
  (loop
    [v-seq v-seq
     v-acc {}
     ]
    (cond
     (empty? v-seq) v-acc
      :else (recur (rest v-seq) (my-group-by-tail v-acc (first v-seq)))
      )
    )
  )

(my-group-by #(> % 5) [1 3 6 8])
{false [1 3], true [6 8]}