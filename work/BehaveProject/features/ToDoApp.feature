Feature: Test to add item
  Scenario: Test Advance boy
    Given I go to 4 davanceboy to add item
    Then I Click on 1st checkbox and second checkbox
    When I enter the item to add
    When I click the add button
    Then I should verify  added item
