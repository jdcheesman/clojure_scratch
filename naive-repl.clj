(defn embedded-repl
  "A naive Clojure REPL implementation. Enter `:quit`
  to exit."
  []
  (print (str (ns-name *ns*) ">>> "))
  (flush)
  (let [expr (read)
        value (eval expr)]
    (when (not= :quit value)
      (println value)
      (recur))))