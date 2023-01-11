Feature: Delete Device Type

  Scenario Outline: Delete Device Type
    Given Go to Device Type Page
    When Delete desired Device Type <DeviceType>
    Then Verify Toaster Message for Delete Device Type <ExpMsg>
    And Verify Device Type is Deleted from Device Type Table <DeviceType>

    Examples: 
      | DeviceType | ExpMsg                                         |
      | "Testing"  | "Device Type Deleted Successfully"             |
      #| "Demo"     | "Device Type Deleted Successfully"             |
      #| "1234"     | "Device Type Deleted Successfully"             |
      #| "Testing"  | "Entered Device Type Does NOT Exists in Table" |
      #| "Demo"     | "Entered Device Type Does NOT Exists in Table" |
      #| "1234"     | "Entered Device Type Does NOT Exists in Table" |
