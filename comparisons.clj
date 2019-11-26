(ns comparisons)

(defn my-comparison [v-operator v-op-1 v-op-2]
  (cond
    (v-operator v-op-1 v-op-2) :lt
    (v-operator v-op-2 v-op-1) :gt
    :else :eq
    )
  )