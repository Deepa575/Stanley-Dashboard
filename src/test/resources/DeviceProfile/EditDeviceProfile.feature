Feature: Validate Edit Device Profile Functionality

  Scenario Outline: Validate Edit Device Profile Functionality
    Given Go to Device Profile Page
    When User Edits Device Profile <DevProfID> <DeviceProfileName> <Version> <DoorType> <FirmwareRangeFrom> <FirmwareRangeTo> <ExpectedMessage>

    Examples: 
      | DevProfID | DeviceProfileName | Version | DoorType       | FirmwareRangeFrom | FirmwareRangeTo | ExpectedMessage                      |
      | "Pid2903" | "Testing"         | "12"    | "Sliding Door" | "342"             | "357"           | "Device Profile Edited Successfully" |                
