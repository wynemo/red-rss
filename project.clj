(defproject red-rss "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :plugins [[lein-cljsbuild "1.0.2"]]
  :dependencies [[org.clojure/clojurescript "0.0-2173"] [org.clojure/clojure "1.5.1"] [org.bodil/cljs-noderepl "0.1.11"]]
  :cljsbuild
    {:builds
     [{:source-paths ["src"],
       :compiler
       {:pretty-print true, :target :nodejs, :optimizations :simple}}]})
