(ns fibonacci-sequence)

(def fib-seq
  (lazy-cat [1 1] (map + (rest fib-seq) fib-seq)))

(defn nth-fib [n] (take n fib-seq))
