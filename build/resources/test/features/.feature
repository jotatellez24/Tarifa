Feature: Billing

  As a user I need to create a new opportunity in order to create a close plan quote
  for being able to get the insurance premium for a certain plan.

  Scenario: Close plan quote Successful
    Given The user logged into the page with valid credentials
    When The user enters into the opportunity tag and creates a new opportunity
    And The user creates a new quote
    And The user wants to display the values associates to Plan A
    And The user wants to display the values associates to Plan B
    And The user wants to display the values associates to Plan C
    And The user wants to display the values associates to Plan D
    Then The user will be able to see all the values associated to the requested quotes Plan A
    And The user will be able to see all the values associated to the requested quotes Plan B
    And The user will be able to see all the values associated to the requested quotes Plan C
    And The user will be able to see all the values associated to the requested quotes Plan D


