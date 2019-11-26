(ns compress-a-sequence)

(defn compress [s]
  (if (<= (count s) 1)
    s
    (if (= (first s) (nth s 1))
      (compress (rest s))
      (conj (compress (rest s)) (first s))
      )
    )
  )
