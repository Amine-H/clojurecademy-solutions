(ns set-intersection)

(defn my-intersection [v-a v-b]
  (defn in-intersection [v-el]
    (and (contains? v-a v-el) (contains? v-b v-el))
    )
  (set (->> (clojure.set/union v-a v-b) (filter in-intersection)))
  )