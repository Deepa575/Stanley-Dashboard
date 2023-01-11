Feature: validate device type

  Scenario Outline: edit device type
    Given user click on Administrator <edit_text>
    When user Edit devices <device_type> <Description> <toaster_message>
    Then verify devive type <device_type> <Description>

    Examples: 
      | edit_text | device_type | Description | toaster_message                   |
      | "Test"    | "Test123"   | ""          | "Device Type Edited Successfully" |
      | "Test123" | ""          | "tesing12"  | "Device Type Edited Successfully" |
