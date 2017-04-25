(ns status-im.network-settings.styles
  (:require-macros [status-im.utils.styles :refer [defstyle]])
  (:require [status-im.components.styles :as common]))

(def networks-list
  {:background-color common/color-light-gray})

(defstyle badge-name-text
  {:ios {:font-size      17
         :letter-spacing -0.2}})

(defstyle badge-connected-text
  {:ios {:margin-top     5
         :font-size      14
         :letter-spacing -0.2
         :color          common/color-gray4}})

(defstyle paste-json-text-input
  {:ios {:font-size      17
         :line-height    24
         :letter-spacing -0.2}})

(def connect-button-container
  {:margin-top        8
   :align-items :center
   :margin-bottom     16
   :margin-horizontal 16})

(defstyle connect-button
  {:ios {:height 52
         :width 343
         :align-items :center
         :justify-content :center
         :background-color common/color-light-blue
         :border-radius 8
         :opacity 0.9}})

(defstyle connect-button-label
  {:ios {:font-size 17
         :color common/color-white
         :letter-spacing -0.2}})

(defstyle connect-button-description
  {:ios {:margin-top 8
         :height    20
         :font-size 14
         :color common/color-gray4
         :letter-spacing -0.2}})


(def edit-button-container
  {:margin-top        16
   :align-items :center
   :margin-bottom     16
   :margin-horizontal 16})

(defstyle edit-button
  {:ios {:height 52
         :width 343
         :align-items :center
         :justify-content :center
         :background-color common/color-light-blue-transparent
         :border-radius 8}})

(defstyle edit-button-label
  {:ios {:font-size 17
         :color common/color-light-blue
         :letter-spacing -0.2}})

(defstyle edit-button-description
  {:ios {:margin-top 8
         :text-align :center
         :font-size 14
         :color common/color-gray4
         :letter-spacing -0.2}})
