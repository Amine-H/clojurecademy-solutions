(ns factorial-fun)


(defn factorial [n]
	(->> (range 1 (+ n 1)) (reduce *))
)