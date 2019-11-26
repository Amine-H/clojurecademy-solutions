(ns trees-into-tables)


(defn trees-into-tables
  [v-map]
  (def v-res-as-seq (for [[v-key v-value] v-map
        [v-sub-key v-sub-value] v-value
        v-res [[v-key v-sub-key] v-sub-value]]
		v-res))
  
  (apply hash-map v-res-as-seq))
