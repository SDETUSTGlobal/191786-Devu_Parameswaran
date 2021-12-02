Feature: View all orders
show all the details of all orders
	Given User is on Home Page

	When User enters Credentials to LogIn
    | Tester | test |
	Then Message displayed Login Successfully
Scenario: Check all
Select all checkboxes
Given user is on list of order page
When user click check all button
Then all the checkboxes are ticked
Scenario: UnCheck all
Deselect all checkboxes
Given user is on list of order page
When user click uncheck all button
Then all the checkboxes are unticked that are selected
Scenario: Checkbox checking and unchecking
Given user is on list of order page
And user clicks desired order's checkbox
Then user should see desired order checked/unchecked
Scenario: Edit
Go to the edit order page 
Given user is on list of order page
When user click edit button
Then the edit order page will display
Scenario: Delete
Delete the order from the list
Given user is on list of order page
When user delete button 
Then delete the order that are selected from the list