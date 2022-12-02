Feature: Validate Delete Location Type Functionality

Scenario Outline: Validate Delete Location Type Functionality
	Given User is on Location Type page
	When Delete desired Location Type ID <LocationTypeID> <ExpectedMessage>

	
Examples:
	| LocationTypeID | ExpectedMessage |
	| "2792" | "Location Type Deleted Successfully" |