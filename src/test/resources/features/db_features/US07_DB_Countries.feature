@US07db
Feature: Verify Countries Table in Database

  Scenario: Verify column names and data in countries table
    Given User connects to The Database
    When User retrieves actual column names from 'countries' table
    Then User verifies expected column names and actual column names in 'countries' table
    And User verifies that no empty data in the 'name' column in 'countries' table
    And User closes the Database Connection