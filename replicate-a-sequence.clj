(ns replicate-a-sequence)

(defn times [el times]
  (loop [i 0, res '()]
    (cond
      (= i times) res
      :else (recur (inc i) (conj res el))
      )
    )
  )

(defn  my-replicate [arr repeat-times]
  
  (loop [curr arr, acc '()]
    (cond
      (empty? curr) (mapcat identity (reverse acc))
      :else (recur (rest curr) (cons (times (first curr) repeat-times) acc))
      )
    )
  )