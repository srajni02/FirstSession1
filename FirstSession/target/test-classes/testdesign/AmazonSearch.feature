Feature: User is able to search and select from dropdowm


  @AmazonPage
  Scenario: Validate user is able to search
    Given User Validates the navigation to the Amazon page
    When User Search the products
    And User Clicks the Search button
    Then Validate search result is displayed

  @AmazonPage
    Scenario: Validate the dropdown list
      Given User Validates the navigation to the Amazon page
      When User extracts all the values from the drop down
      And User Clicks the Search button
      Then Validate that title of the page


