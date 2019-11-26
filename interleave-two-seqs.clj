(ns interleave-two-seqs)

(defn interleave-seqs [a b]
  (->> (map vector a b) (flatten))
  )