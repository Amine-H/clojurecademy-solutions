(ns palindrome-detector)

(defn palindrome [input]
  (def input-seq (seq input))
  (def reversed-seq (reverse input-seq))
  (def eq (map = input-seq reversed-seq))
  (every? true? eq)
  )
