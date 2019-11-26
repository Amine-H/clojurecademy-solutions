(ns flipping-out)


(defn flip
  [v-func]
  
  (fn [& v-args] (apply v-func (reverse v-args)))
  )