(ns get-the-caps)

(defn is-char-uppercase [c]
  (Character/isUpperCase c))

(defn only-capitals [s]
  (apply str (filter is-char-uppercase s))
  )