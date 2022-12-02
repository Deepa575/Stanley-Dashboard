Feature: Validate Edit Device Profile Functionality

Scenario Outline: Validate Edit Device Profile Functionality
	Given Go to Device Profile Page
	When Edit Device Profile Name <DeviceProfileName>
	And Edit Version <Version>
	And Edit Door Type <DoorType>
	And Edit Firmware Range From <FirmwareRangeFrom>
	And Edit Firmware Range To <FirmwareRangeTo>
	And Click on Submit
	Then Verify Toaster Message <ExpectedMessage>
	
Examples:
	| DeviceProfileName | Version | DoorType | FirmwareRangeFrom | FirmwareRangeTo | ExpectedMessage |
	| "Testing" | "12" | "Sliding Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Testing" | "12" | "Sliding Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "" | "12" | "Sliding Door" | "342" | "357.43" | "Device Profile Edited Successfully" |
#	| "Test" | "" | "Sliding Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Test Profile" | "12" | "" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Test" | "12" | "Sliding Door" | "" | "357" | "Device Profile Edited Successfully" |
#	| "Test" | "12" | "Sliding Door" | "342.34" | "" | "Device Profile Edited Successfully" |
#	| "Testing" | "12" | "Swing Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Test Device profile" | "12" | "Rotary Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Testing" | "12" | "Sliding Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "" | "" | "Sliding Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Testing" | "12" | "Sliding Door" | "" | "" | "Device Profile Edited Successfully" |
#	| "Test 123" | "125" | "" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Testing" | "1245632" | "Sliding Door" | "342" | "357" | "Device Profile Edited Successfully" |
#	| "Test@@@" | "12" | "Sliding Door" | "342.345" | "357.456" | "Device Profile Edited Successfully" |
#	| "Test DP" | "12" | "Sliding Door" | "342.345" | "357" | "Device Profile Edited Successfully" |
#	| "Test Device" | "12" | "Sliding Door" | "342" | "357.456" | "Device Profile Edited Successfully" |