(ns pick-a-film.handlers (:require [environ.core :refer [env]]))

(defn home
  [request]
  (env :openai-host))

(defn health-check
  [request]
  "The system is Healthy.")

(defn not-found
  [request]
  "Route not found")
