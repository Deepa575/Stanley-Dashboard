Feature: Validate Delete Device Profile Functionality

Scenario Outline: Validate Delete Device Profile Functionality
	Given Go to Device Profile page
	When Delete desired Device Profile ID <DeviceProfileID> <ExpectedMessage>

	
Examples:
	| DeviceProfileID | ExpectedMessage |
	| "Pid6877" | "Device Profile Deleted Successfully" |
#	| "Pid1684" | "Device Profile Deleted Successfully" |
#	| "Pid8458" | "Device Profile Deleted Successfully" |
#	| "Pid3213" | "Device Profile Deleted Successfully" |

	