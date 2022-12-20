Feature: Validate the Edit Location type

  Scenario Outline: Verify the Edit Location Type page
    Given User is on Location Type page
    When User Edits Location Type <Old Location Type> <New Location Type> <Description> <Physical Location Type> <Customers> <Expected Msg>

    Examples: 
      | Old Location Type | New Location Type | Description | Physical Location Type | Customers    | Expected Msg                                               |
      | "Test 45"         | "Test 4"          | "Testing"   | "Device Location"      | "All"        | "Location Type Edited Successfully"                        |
      | "Testing 2"       | "Testing 2"       | "Test"      | "Device Location"      | "All"        | "Location Type Edited Successfully"                        |
      | "Test Demo1"      | "Test Demo1"      | "Testing"   | "Device Location"      | "All"        | "Location Type Edited Successfully"                        |
      | "Testing"         | "Testing"         | "Testing"   | "Device Location"      | "Walmart"    | "Location Type Edited Successfully"                        |
      | "Testing"         | "Testing"         | "Testing"   | "Device Location"      | "Home Depot" | "Location Type Edited Successfully"                        |
      | "Test 985"        | "    "            | "Testing"   | "Device Location"      | "All"        | "Duplicate Value Entered"                                  |
      | "Test 287"        | "Test"            | "    "      | "Device Location"      | "All"        | "Duplicate Value Entered"                                  |
      | "Test 985"        | "    "            | "    "      | "Device Location"      | "All"        | "Duplicate Value Entered"                                  |
      | "Testing"         | ""                | "Testing"   | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"         | "Testing"         | ""          | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"         | ""                | ""          | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Test@@@@@"       | "Test"            | "Testing"   | "Device Location"      | "All"        | "Entered Location Type does NOT exists in Table"           |
      | "Test&&&&&"       | "Test"            | "Testing"   | "Device Location"      | "All"        | "Entered Location Type does NOT exists in Table"           |
      | "Test$$$$$"       | "Test"            | "Testing"   | "Device Location"      | "All"        | "Entered Location Type does NOT exists in Table"           |
