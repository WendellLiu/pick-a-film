(ns pick-a-film.routes (:require ,
                        [compojure.core :as compojure]
                        [compojure.route :as compojure-route]
                        [pick-a-film.handlers :as other-handlers]
                        [pick-a-film.handlers.webhook :as webhook]))

(compojure/defroutes app
  (compojure/POST "/webhook" params webhook/handler)
  (compojure/GET "/" params other-handlers/home)
  (compojure/GET "/health" params other-handlers/health-check)

  (compojure-route/not-found other-handlers/not-found))
