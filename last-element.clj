(ns last-element)

(defn my-last [args]
  (def last-index (- (count args) 1))
  (nth args last-index))

(my-last [5 4 5])
