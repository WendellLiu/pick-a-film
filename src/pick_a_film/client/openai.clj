(ns pick-a-film.client.openai (:require [environ.core :refer [env]]
                                        [pick-a-film.utils.http :as http]))

(defn check
  []
  (http/get-protected-resource (str (env :openai-host) "/v1/models") (env :openai-api-key)))
