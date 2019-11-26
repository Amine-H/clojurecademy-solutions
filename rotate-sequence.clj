(ns rotate-sequence)

(defn rotate
  [v-shift v-seq]
  
  (loop
    [v-seq v-seq
     v-shift v-shift]
    (cond
      (pos? v-shift) (recur (concat (rest v-seq) [(first v-seq)]) (dec v-shift))
      (neg? v-shift) (recur (concat [(last v-seq)] (butlast v-seq)) (inc v-shift))
      :else v-seq
      )
    )
  )