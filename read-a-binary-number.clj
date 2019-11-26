(ns read-a-binary-number)

(defn read-binary
  [v-binary-string]
  (defn expt [x pow] (apply * (repeat pow x)))
  (defn cal-acc [v-char v-current-val v-power]
    (if (= \1 v-char) (+ v-current-val (expt 2 v-power)) v-current-val))
  
  (loop
    [v-binary-string v-binary-string
     v-power 0
     v-acc 0
     ]
    (cond
      (empty? v-binary-string) v-acc
      :else (recur
              (butlast v-binary-string)
              (inc v-power)
              (cal-acc (last v-binary-string) v-acc v-power)
              )
      )
    )
  )