(ns penultimate-element)

(defn second-last [args]
  (def second-last-index (- (count args) 2))
  (nth args second-last-index))
