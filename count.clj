(defn mycounter
  ([toCount] (mycounter toCount 0))
  ([toCount counter]
    (if (first toCount)
        (mycounter (rest toCount) (+ counter 1))
        (+ counter 0))))




(mycounter [1 2 3 4])