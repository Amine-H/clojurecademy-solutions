(ns product-digits)

(defn product-digits
  [v-a v-b]
  (def v-product (* v-a v-b))
  (loop
    [v-product v-product
     v-acc []
     ]
    (cond
      (< v-product 10) (reverse (conj v-acc v-product))
      :else (recur (quot v-product 10) (conj v-acc (rem v-product 10)))
      )))
