Feature: Validate Delete Location Type Functionality

  Scenario Outline: Validate Delete Location Type Functionality
    Given User is on Location Type page
    When Delete desired Location Type <LocationType> <ExpectedMessage>

    Examples: 
      | LocationType                | ExpectedMessage                                  |
      | "Testing"                   | "Location Type Deleted Successfully"             |
      | "TESTING"                   | "Location Type Deleted Successfully"             |
      | "TestING"                   | "Location Type Deleted Successfully"             |
      | "@@@@@34525"                | "Location Type Deleted Successfully"             |
      | "Testing Description field" | "Location Type Deleted Successfully"             |
      | "1234"                      | "Entered Location Type does NOT exists in Table" |
      | "@@@@@"                     | "Entered Location Type does NOT exists in Table" |
      | "&&&&&"                     | "Entered Location Type does NOT exists in Table" |
      | "Testing"                   | "Entered Location Type does NOT exists in Table" |
      | "Test@12345"                | "Entered Location Type does NOT exists in Table" |
