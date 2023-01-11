Feature: To Add DeviceType

  Scenario Outline: Scenario to Add DeviceType
    Given Go To Add DeviceType Page
    When Enter Details Into Devicetype and Description <deviceType> <description>
    When Click On Submit
    Then Verify Toaster Message <expectedMessage>

    Examples: 
      | deviceType      | description     | expectedMessage                  |
      | "Device test 6" | "For Testing 3" | "Device Type Added Successfully" |
      | "Device test 9" | "For Testing 3" | "Device Type Added Successfully" |
      | "Device test"   | "For Testing"   | "Device Type Added Successfully" |
      | "Device 1 "     | "For Testing"   | "Device Type Added Successfully" |
      | "Device"        | "-------"       | "Device Type Added Successfully" |
      | "-------"       | "-------"       | "Device Type Added Successfully" |
      | "Testing 1"     | "-------"       | "Device Type Added Successfully" |
      | "Testing 1234"  | "123455"        | "Device Type Added Successfully" |
      | "Stanley123"    | "-------"       | "Device Type Added Successfully" |
      | "-------"       | "stanley123"    | "Device Type Added Successfully" |
