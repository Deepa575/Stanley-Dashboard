Feature: Validate the Edit Location type

Scenario Outline: Verify the Edit Location Type page
    Given User is on Location Type page
    When User Edits Location Type <ID> <Location Type> <Description> <Physical Location Type> <Customers> <Expected Msg>


Examples: 
  | ID       | Location Type                    | Description                        | Physical Location Type | Customers    | Expected Msg                     |
  | "9778" | "Regions typ123"                  | "Testing"                  | "Geography"            | "All"           | "Location Type Edited Successfully" |
  | "3947" | ""                               | "Stanley Dashboard@#$#% Dashboard" | "Building "            | "Walmart"    | "Location Type Edited Successfully" |
  | "7891" | ""                               | ""                                 | ""                     | ""           | "Duplicate Value Entered"           |
  | "3372" | "Regions type"                   | "Testing Purpose"                  | "Geography"            | "Walmart"    | "Duplicate Value Entered" |
  | "9654" | "Regions types"                  | "Stanley Dashboard Testing"        | "Device Location"      | ""           | "Duplicate Value Entered"           |
  | "3665" | "Country Testing"                | ""                                 | "Building "            | "Walmart"    | "Location Type Edited Successfully" |
  | "3425" | "Regions type"                   | "Testing"                          | ""                     | "Walmart"    | "Duplicate Value Entered"           |
  | "7564" | "Testing 2"                      | "Stanley Dashboard-Region@Tesing"  | "Geography"            | ""           | "Duplicate Value Entered"           |
  | "6654" | "Regions type-Interior Entrnace" | "Testing"                          | ""                     | "Home Depot" | "Location Type Edited Successfully" |
  | "4746" | "Testing 2"                      | "Stanley Dashboard"                | ""                     | ""           | "Location Type Edited Successfully" |
  