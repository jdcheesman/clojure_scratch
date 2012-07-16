(defn concat-rest
  [& rest]
  (apply str (butlast rest)))