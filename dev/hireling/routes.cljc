(ns hireling.routes
  (:require [bidi.bidi :as bidi]))



(def routemap ["/" {"js/" {true ::main-js}
                    "worker.js" ::worker-js
                    "out//" {true ::worker-js-assets}
                    #{"" "index.html"} ::index
                    "style.css" ::style
                    "simple.txt" ::simple-txt
                    "alt-index/" ::alt-index
                    "rand/" {"" ::rand-index
                             "always-cached.txt" ::always-cache-txt
                             "precached.txt" ::precached
                             "never-cached.txt" ::never-cache-txt
                             "cache-updates.txt" ::fastest-cache-txt
                             "all/" {"" ::rand-all
                                     "uncached/" {true ::rand-all-uncached}
                                     "allcached/" {true ::rand-all-cached}
                                     "fastest/" {true ::rand-all-fastest-cached}
                                     "regexd/" {true ::rand-regex}}}}])