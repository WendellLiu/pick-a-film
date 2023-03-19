(defproject pick-a-film "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"],
                 [ring/ring-core "1.9.6"],
                 [ring/ring-jetty-adapter "1.9.6"],
                 [compojure "1.7.0"],
                 [clj-http "3.12.3"],
                 [environ "1.2.0"]]
  :main ^:skip-aot pick-a-film.core
  :repl-options {:init-ns pick-a-film.core}
  :plugins [[lein-environ "1.2.0"]]
  :env {:openai-host "https://api.openai.com"})
