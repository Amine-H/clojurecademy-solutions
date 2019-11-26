(ns reverse-a-sequence)


(defn reverse-seq [s]
  (reduce conj '() s))
