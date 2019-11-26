(ns implement-range)


(defn my-range [start end]
  (if (= start end)
    '()
    (conj (my-range (+ start 1) end) start)
    )
  )
