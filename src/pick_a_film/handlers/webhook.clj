(ns pick-a-film.handlers.webhook
  (:require [pick-a-film.client.openai :as openai-client]))

(defn handler
  [request] (openai-client/check))
