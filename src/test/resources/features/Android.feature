Feature: Android
  @list
  Scenario: View
    Given click preference button
    And click preferenceDependencies button
    And select checkbox
    And click wifiSetting button
    And Enter "Appium Test" into ipnput box
    Then click ok button
