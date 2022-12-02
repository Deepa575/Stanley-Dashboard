Feature: Verify Device Profile Page

Scenario: Verify Device Profile page
	Given User is on Device Profile page
	When Verify Device Profile heading
	And Verify Add Device Profile button
	And Verify Table column Names
	Then Verify Table Data
	