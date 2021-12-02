Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page

	When User enters Credentials to LogIn
    | Tester | test |
	Then Message displayed Login Successfully

When User click the link
Then  goes to the list of products page  
