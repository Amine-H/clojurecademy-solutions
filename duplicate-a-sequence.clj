(ns duplicate-a-sequence)

(defn duplicate [s]
  (defn duplicate-reducer [acc el] (conj acc el el))
  (reduce duplicate-reducer [] s)
  )

(duplicate [1 2 3])