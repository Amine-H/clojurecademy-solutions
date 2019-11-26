(ns infix-calculator)

(defn infix-calc
  [& v-args]
  (loop
    [v-exp (rest v-args)
     v-acc (first v-args)
     v-op nil
     ]
    (cond
      (empty? v-exp) v-acc
      :else (cond
        (number? (first v-exp)) (recur (rest v-exp) (v-op v-acc (first v-exp)) nil)
        :else (recur (rest v-exp) v-acc (first v-exp))
        )
      )
    )
  )