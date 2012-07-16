(defn make-user
  [username & {:keys [email join-date]
    :or {join-date (java.util.Date.)}}]
      {:username username
      :join-date join-date
      :email email
      ;; 2.592e9 -> one month in ms
      :exp-date (java.util.Date. (long (+ 2.592e9 (.getTime join-date))))})
