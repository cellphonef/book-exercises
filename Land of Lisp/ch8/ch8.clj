;; Clojure's 'loop' is different, use other functions
(repeat 10 1)
(range 1 11)
(for [n (range 1 11)] (+ 100 n))

;; Clojure's 'let' allows latter vars to refer to earlier vars
(let [a 5
      b (+ a 2)]
  b)
