(ns greatest-common-divisor)

(defn gcd [a b]
  (cond
    (zero? a) b
    (zero? b) a
    (and (even? a) (even? b)) (* 2 (gcd (/ a 2) (/ b 2)))
    (even? a) (gcd (/ a 2) b)
    (even? b) (gcd a (/ b 2))
    (>= a b) (gcd (/ (- a b) 2) b)
    :else (gcd (/ (- b a) 2) a)
    )
  )