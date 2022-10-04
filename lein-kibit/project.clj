(defproject lein-kibit (clojure.string/trim-newline (slurp "../kibit-common/resources/bowyer/kibit/VERSION"))
  :description "kibit lein plugin"
  :url "https://github.com/bowyer/kibit"
  :resource-paths ["../kibit-common/resources"]
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.namespace "0.2.11"]
                 [bowyer/kibit ~(clojure.string/trim-newline (slurp "../kibit-common/resources/bowyer/kibit/VERSION"))]]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :eval-in-leiningen true)
