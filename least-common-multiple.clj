(ns least-common-multiple)

(defn get-denominator
  [v-number]
  (if (ratio? v-number) (denominator v-number) 1
    ))

(defn multiple?
  [v-a v-b]
  (= (rem v-a v-b) 0)
  )

(defn lcm
  [& v-args] 
  (def v-denom (->> v-args (map get-denominator) (reduce *)))
  (def v-numbers (->> v-args (map #(* % v-denom))))
  
  (def v-result (loop [v-current 2]
    (cond
      (every? #(multiple? v-current %) v-numbers) v-current
      :else (recur (inc v-current))
      )))

  (/ v-result v-denom))