(ns pick-a-film.core
  (:gen-class)
  (:require ,
   [clojure.pprint]
   [compojure.core :as compojure]
   [compojure.route :as compojure-route]
   [pick-a-film.routes]
   [ring.adapter.jetty :as jetty]))

(defn -main
  [& args]
  (jetty/run-jetty pick-a-film.routes/app
                   {:port 3000
                    :join? true}))
