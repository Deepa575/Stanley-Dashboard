Feature: Validate Add Device Profile Functionality

Scenario Outline: Validate Add Device Profile Functionality
	Given Go to Add Device Profile window
	When Enter Device Profile Name <DeviceProfileName>
	And Enter Version <Version>
	And Select Door Type <DoorType>
	And Enter Firmware Range From <RangeFrom>
	And Enter Firmware Range TO <RangeTo>
	And Upload Data Command Group JSON <DataCommandGroupJSON>
	And Upload Boot Command Group JSON <BootCommandGroupJSON>
	Then Verify Submit button is Enabled
	When Click on Submit
	Then Verify Toaster Message for Add Device Profile functionality <ExpMsg>
	
Examples:	
	| DeviceProfileName | Version | DoorType | RangeFrom | RangeTo | DataCommandGroupJSON | BootCommandGroupJSON | ExpMsg |
	| "Testing 1"| "123" | "Sliding Door" | "123.432" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 13"| "145" | "Swing Door" | "123.432" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 12"| "1345" | "Rotary Door" | "123.432" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 134"| "12345" | "Sliding Door" | "123.432" | "123.4" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |		
	| "Testing 24"| "12345" | "Swing Door" | "123.42" | "123.46" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 1234"| "12345" | "Sliding Door" | "123.432" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 234"| "12345" | "Sliding Door" | "123.43" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |	
	| "Testing 136"| "345" | "Rotary Door" | "123.432" | "123.6" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 34"| "12345" | "Sliding Door" | "123.4" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 34"| "12345" | "Sliding Door" | "123.4" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Testing 34"| "ABCD" | "Sliding Door" | "123.4" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Duplicate Value Entered" |
	| "12345"| "548" | "Sliding Door" | "123.4" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.json" | "Device Profile Added Successfully" |
	| "Test DP"| "548" | "Sliding Door" | "458.22" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.json" | "C:\Users\deepa\Downloads\boot_command_group.xml" | "Duplicate Value Entered" |
	| "Test DP"| "548" | "Sliding Door" | "58" | "123.456" | "C:\Users\deepa\Downloads\data_command_group.jpg" | "C:\Users\deepa\Downloads\boot_command_group.xml" | "Duplicate Value Entered" |