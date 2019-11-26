(ns beauty-is-symmetry)

(defn is-symmetric [node-1 node-2]
  (or
    (and (nil? node-1) (nil? node-2))
    (and
      (not (nil? node-1))
      (not (nil? node-2))
      (= (first node-1) (first node-2))
      (is-symmetric (nth node-1 1) (nth node-2 2))
      (is-symmetric (nth node-1 2) (nth node-2 1))
      )
    )
  )

(defn symmetric
  [v-node]
  (let [[v-value v-left v-right] v-node]
    (is-symmetric v-left v-right)
    ))

