Feature: Validate Add Location Type feature

  Scenario Outline: Validate Add Location Type feature
    Given User is on the Location Type Page
    When User Click on Add Location Type button
    And User Enters <Location Type> <Description> <Physical Location Type> <Customers>
    And Click on Submit button <ExpMsg>

    Examples: 
      | Location Type               | Description             | Physical Location Type | Customers    | ExpMsg                                                     |
      | "Testing"                   | "Testing Location Type" | "Device Location"      | "Walmart"    | "Location Type Added Successfully"                         |
      | "234511"                    | "Testing Loc Type"      | "Device Location"      | "Vassar"     | "Location Type Added Successfully"                         |
      | "%%%%$$$$"                  | "Testing Loc Type"      | "Device Location"      | "Walmart"    | "Duplicate Value Entered"                                  |
      | "Testing@@@@"               | "Testing Location Type" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing9854"               | "Testing Location Type" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "@@@@@34525"                | "Testing Location Type" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing&&&123$$$"          | "Testing Location Type" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "TESTING"                   | "Testing Location Type" | "Device Location"      | "Vassar"     | "Location Type Added Successfully"                         |
      | "testing"                   | "Testing Location Type" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "TestING"                   | "Testing Location Type" | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing"                   | "Testing Location Type" | "Device Location"      | "Vassar"     | "Duplicate Value Entered"                                  |
      | "TestING"                   | "Testing Location Type" | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "234511"                    | "Testing Location Type" | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "Testing9854"               | "Testing Location Type" | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "      "                    | "Testing"               | "Device Location"      | "Vassar"     | "Duplicate Value Entered"                                  |
      | "Testing"                   | "       "               | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | "     "                     | "       "               | "Device Location"      | "Home Depot" | "Duplicate Value Entered"                                  |
      | ""                          | "Testing"               | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing"                   | ""                      | "Device Location"      | "Home Depot" | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | ""                          | ""                      | "Device Location"      | "Walmart"    | "Submit Button is Disabled. Need to fill Mandatory fields" |
      | "Testing Desc"              | "234511"                | "Device Location"      | "Walmart"    | "Location Type Added Successfully"                         |
      | "Testing Description"       | "###$$$$@@@@"           | "Device Location"      | "Walmart"    | "Duplicate Value Entered"                                  |
      | "Testing Desc field"        | "Testing&&&&&"          | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing Desc fld"          | "123&&&&&345"           | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing Description field" | "Testing8774"           | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing Description fld"   | "Testing87$$$74"        | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing Description fd"    | "TESTING DESCRIPTION"   | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
      | "Testing Descrip fld"       | "testing description"   | "Device Location"      | "Home Depot" | "Location Type Added Successfully"                         |
