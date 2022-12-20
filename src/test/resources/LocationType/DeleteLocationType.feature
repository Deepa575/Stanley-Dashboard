Feature: Validate Delete Location Type Functionality

  Scenario Outline: Validate Delete Location Type Functionality
    Given User is on Location Type page
    When Delete desired Location Type <LocationType> <ExpectedMessage>

    Examples: 
      | LocationType     | ExpectedMessage                                  |
      | "Testing East@@" | "Location Type Deleted Successfully"             |
      | "Testing 11@@"   | "Location Type Deleted Successfully"             |
      | "Test@12345@@"   | "Location Type Deleted Successfully"             |
      | "Testing abc@@"  | "Location Type Deleted Successfully"             |
      | "Testing 985@@"  | "Location Type Deleted Successfully"             |
      | "Testing 25@@"   | "Location Type Deleted Successfully"             |
      | "Testing 287@@"  | "Location Type Deleted Successfully"             |
      | "Testing 548@@"  | "Location Type Deleted Successfully"             |
      | "Testing 2@@"    | "Location Type Deleted Successfully"             |
      | "Testing 2@@"    | "Entered Location Type does NOT exists in Table" |
      | "Testing 25@@"   | "Entered Location Type does NOT exists in Table" |
      | "Testing 985@@"  | "Entered Location Type does NOT exists in Table" |
      | "Testing abc@@"  | "Entered Location Type does NOT exists in Table" |
      | "Test@12345@@"   | "Entered Location Type does NOT exists in Table" |
      | "Testing East@@" | "Entered Location Type does NOT exists in Table" |
