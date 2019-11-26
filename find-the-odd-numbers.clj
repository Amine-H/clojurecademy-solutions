(ns find-the-odd-numbers)

(defn just-odds [s]
  (->> s (filter odd?)))
