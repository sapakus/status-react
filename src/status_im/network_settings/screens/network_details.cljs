(ns status-im.network-settings.screens.network-details
  (:require-macros [status-im.utils.views :refer [defview]])
  (:require
    [re-frame.core :refer [dispatch]]
    [status-im.components.status-bar :refer [status-bar]]
    [status-im.components.toolbar-new.view :refer [toolbar]]
    [status-im.components.context-menu :refer [context-menu]]
    [status-im.components.text-input-with-label.view :refer [text-input-with-label]]
    [status-im.network-settings.screen :refer [network-badge]]
    [status-im.components.react :refer [view text text-input icon]]
    [status-im.components.sticky-button :refer [sticky-button]]
    [status-im.i18n :as i18n]
    [clojure.string :as str]
    [status-im.network-settings.styles :as st]))

(def options
  [{:text (i18n/label :t/add-json-file)      :value #(dispatch [:network-add-json-file])}
   {:text (i18n/label :t/paste-json-as-text) :value #(dispatch [:network-paste-json-as-text])}
   {:text (i18n/label :t/:edit-rpc-url)      :value #(dispatch [:network-edit-rpc-url])}
   {:text (i18n/label :t/:remove-network)    :value #(dispatch [:network-remove])}])

(defview network-details []
  [{:keys [name connected?] :as network} [:get :selected-network]]
  [view {:flex 1}
   [status-bar]
   [toolbar]
   [network-badge {:name       name
                   :connected? connected?
                   :options    options}]
   (when-not connected?
     [view st/connect-button-container
      [view st/connect-button
       [text {:style st/connect-button-label} (i18n/label :t/connect)]]
      [text {:style st/connect-button-description} "Connecting to another network requires login"]])
   [view {:height 160 :margin-top 8 :margin-horizontal 16 :border-radius 9 :opacity 0.9 :background-color "#eef2f5"
          :justify-content :center :align-items :center}
    [text "json"]]
   [view st/edit-button-container
    [context-menu
     [view st/edit-button
      [text {:style st/edit-button-label} "Edit network config"]]
     options]
    [text {:style st/edit-button-description}

     "Be careful, editing the network data may disable this network for you"]]])