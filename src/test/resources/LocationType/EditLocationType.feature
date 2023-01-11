Feature: Validate the Edit Location type

  Scenario Outline: Verify the Edit Location Type page
    Given User is on Location Type page
    When User Edits Location Type <Old Location Type> <New Location Type> <Description> <Physical Location Type> <Customers> <Expected Msg>

    Examples: 
      | Old Location Type | New Location Type | Description | Physical Location Type | Customers    | Expected Msg                                               |
      | "Testing"         | "Test 4"          | "Testing"   | "Device Location"      | "Walmart"    | "Location Type Edited Successfully"                        |
      | "Test 4"          | "Testing"         | "Test"      | "Device Location"      | "Vassar"     | "Location Type Edited Successfully"                        |
      | "Testing"         | "12345"           | "Testing"   | "Device Location"      | "Home Depot" | "Location Type Edited Successfully"                        |
      | "12345"           | "Test#####"       | "Testing"   | "Device Location"      | "Walmart"    | "Location Type Edited Successfully"                        |
      | "Test#####"       | "Testing"         | "Testing"   | "Device Location"      | "Home Depot" | "Location Type Edited Successfully"                        |
      | "Testing"         | "    "            | "Testing"   | "Device Location"      | "Vassar"     | "Duplicate Value Entered"                                  |
      | "Testing"         | "Test"            | "    "      | "Device Location"      | "Vassar"     | "Duplicate Value Entered"                                  |
      | "Testing"         | "    "            | "    "      | "Device Location"      | "Vassar"     | "Duplicate Value Entered"                                  |
      | "Testing"         | ""                | "Testing"   | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"         | "Testing"         | ""          | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"         | ""                | ""          | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Test@@@@@"       | "Test"            | "Testing"   | "Device Location"      | "Walmart"    | "Entered Location Type does NOT exists in Table"           |
      | "Test&&&&&"       | "Test"            | "Testing"   | "Device Location"      | "Walmart"    | "Entered Location Type does NOT exists in Table"           |
      | "Test$$$$$"       | "Test"            | "Testing"   | "Device Location"      | "Vassar"     | "Entered Location Type does NOT exists in Table"           |
