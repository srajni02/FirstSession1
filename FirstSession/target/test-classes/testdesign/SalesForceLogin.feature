Feature: Functional Validation of Login Page

  Scenario: Validation of Login Functionality
    Given User navigates to the Sales Force Login Page
    When User enters the Username "testlogin" and Password "Test123#"
    And User Clicks the Login button
    Then User Validates the navigation to the homepage

    Scenario: Validation of Error Functionality
      Given User navigates to the Sales Force Login Page
      When User enters the Username "learnmore" and Password "Test123#"
      And User Clicks the Login button
      Then User Validates the Error message

