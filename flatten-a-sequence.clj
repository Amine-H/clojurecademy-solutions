(ns flatten-a-sequence)


(defn flat [arr]
	(loop [curr arr, res []]
      (cond
        (sequential? (first curr)) (recur (concat (first curr) (rest curr)) res)
        (empty? curr) res
        :else (recur (rest curr) (conj res (first curr)))
        )
      )	
  )