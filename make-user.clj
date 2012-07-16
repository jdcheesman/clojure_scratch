(defn make-user
  [& [user-id]]
    {:user-id (or user-id
      (str (java.util.UUID/randomUUID)))})