Feature: Web orders browsing
  Scenario: User visiting web orders page
    When user on Login page.
    When user enters useranme and password
    When user clicks "login" button
    Then user clicks Check all button user should see all orders checked
    Then user clicks Uncheck all button user should see all orders unchecked.
    Then user clicks desired orders check box user should see desired orders checked/unchecked.
    Then user clicks Delete selected button user should see all selected orders unchecked.
    Then user clicks View all products from the main page user should see List of Products.
    When user has navigated to orders page
    When the user enters details
    When the process button is clicked the payment is processed
    When the reset button is clicked all the data from the columns are erased'
    And close the browser
