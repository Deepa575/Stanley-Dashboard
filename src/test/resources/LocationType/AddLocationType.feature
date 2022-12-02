Feature: Validate Add Location Type feature

  Scenario Outline: Validate Add Location Type feature
    Given User is on the Location Type Page
    When User Click on Add Location Type button
    And User Enters <Location Type> <Description> <Physical Location Type> <Customers>
    Then Verify Submit button is Enabled for Add Location Type
    And Click on Submit button
    And Verify Toaster Meassage for Add Location Type <ExpMsg>

    Examples: 
      | Location Type  | Description             | Physical Location Type | Customers    | ExpMsg              |
      | "Testing 1345" | "Testing Purpose"       | "Building "            | "Walmart"    | "Duplicate Value Entered" |
      | "Test Demo"    | "State"                 | "Geography"            | "All"        | "Duplicate Value Entered" |
      | "Test Demo1"   | "Region"                | "Device Location"      | "Home Depot" | "Duplicate Value Entered" |
      | "Test 1 "      | "State"                 | "Building "            | "All"        | "Duplicate Value Entered" |
      | "Testing@1234" | "State Division"        | "Geography"            | "Walmart"    | "Location Type Added Successfully" |
      | "Test 1"       | "State"                 | "Building "            | "Home Depot" | "Location Type Added Successfully" |
      | "Test 2"       | "State"                 | "Building "            | "Home Depot" | "Location Type Added Successfully" |
      | "Test 2"       | "Region"                | "Device Location"      | "Home Depot" | "Location Type Added Successfully" |
      | "Test 2"       | "Location Type Profile" | "Geography"            | "Home Depot" | "Location Type Added Successfully" |
      | "Test 2"       | "Location Type Profile" | "Device Location"      | "Home Depot" | "Location Type Added Successfully" |
      | "Test 2"       | "Testing Purpose"       | "Device Location"      | "Home Depot" | "Location Type Added Successfully" |
      | "Test 2"       | "Testing Purpose"       | "Geography"            | "Home Depot" | "Location Type Added Successfully" |
      | "Test 2"       | "Region"                | "Building "            | "Home Depot" | "Location Type Added Successfully" |
