Feature: Expression set

  As a user I need to check if the values displayed for the close plans in the database,
  matches with the dates displayed after execute a simulation

  Scenario: Validate values after execute en expression set simulation
    Given The user logged into the salesforce CRM with valid credentials
    When The user enters into the expression set tag and execute a new simulation
    Then The user will be able to validate if the values displayed in the database matches with the values displayed in the simulation
