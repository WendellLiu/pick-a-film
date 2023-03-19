(ns pick-a-film.utils.http (:require [clj-http.client :as client]))

(defn get-protected-resource [url token]
  (client/get url {:headers {"Authorization" (str "Bearer " token)}}))
