Feature: OrangeHRM Logo
  Scenario: Logo presence on OrangeHRM home page
    Given Launch chrome browser
    When Open OrangeHRM home page
    Then Verify that the logo present in the home page
    And close the Browser
