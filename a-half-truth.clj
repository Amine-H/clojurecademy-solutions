(ns a-half-truth)

(defn half-truth [& v-args]
  (def v-seq (seq v-args))
  
  (and (.contains v-seq true) (.contains v-seq false))
  )