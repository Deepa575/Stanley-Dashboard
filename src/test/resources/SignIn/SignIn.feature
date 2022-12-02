Feature: Sign In to Application

Scenario Outline: Scenario to Sign In

    Given Enter the Username and Password <Username> <Password>
    When click on Sign In
    Then verify the home page
    Examples:
      | Username     | Password   |
      | "superadmin" | "stanley@123"|