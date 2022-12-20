Feature: Validate Add Location Type feature

  Scenario Outline: Validate Add Location Type feature
    Given User is on the Location Type Page
    When User Click on Add Location Type button
    And User Enters <Location Type> <Description> <Physical Location Type> <Customers>
    And Click on Submit button <ExpMsg>

    Examples: 
      | Location Type    | Description             | Physical Location Type | Customers    | ExpMsg                                                     |
      | "Testing East@@" | "Testing Purpose"       | "Device Location"      | "Walmart"    | "Location Type Added Successfully"                         |
      | "Testing 11@@"   | "State"                 | "Device Location"      | "All"        | "Location Type Added Successfully"                         |
      | "Test@12345@@"   | "State Division"        | "Device Location"      | "Walmart"    | "Location Type Added Successfully"                         |
      | "Testing abc@@"  | "State"                 | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing 985@@"  | "Region"                | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing 25@@"   | "Location Type Profile" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing 287@@"  | "Location Type Profile" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing 548@@"  | "Testing Purpose"       | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing 2@@"    | "State"                 | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Test Demo"      | "State"                 | "Device Location"      | "All"        | "Duplicate Value Entered"                                  |
      | "Test Demo1"     | "Region"                | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "Test 1"         | "State"                 | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "Test 45"        | "Testing Purpose"       | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "Testing"        | "     "                 | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "     "          | "     "                 | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "    "           | "Testing"               | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | ""               | "State"                 | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"        | ""                      | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"        | "State"                 | ""                     | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"        | "State"                 | "Device Location"      | ""           | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | ""               | ""                      | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"        | ""                      | ""                     | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"        | "State"                 | ""                     | ""           | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | ""               | "State"                 | "Device Location"      | ""           | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | ""               | ""                      | ""                     | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"        | ""                      | ""                     | ""           | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | ""               | "State"                 | ""                     | ""           | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | ""               | ""                      | "Device Location"      | ""           | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | ""               | ""                      | ""                     | ""           | "Submit Button is Disabled. Need to fill Mandatory fields" |
