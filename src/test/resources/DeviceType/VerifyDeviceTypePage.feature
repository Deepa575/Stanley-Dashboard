Feature: Verify Device Type Page

Scenario: Verify Device Type page
	Given User is on Device Type Page
	When Verify Device Type Heading
	And Verify Add Device Type button
	And Verify Device Type Column Names
	Then Verify Device Type Table Data