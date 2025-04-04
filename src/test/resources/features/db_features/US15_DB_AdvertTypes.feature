@US15db
Feature: Verify Advert Types Table in Database

  Scenario: Verify column names and data in advert_types table
    Given User connects to The Database
    When User retrieves actual column names from 'advert_types' table
    Then User verifies expected column names and actual column names in 'advert_types' table
    And User verifies that no empty data in the 'title' column in 'advert_types' table
    And User closes the Database Connection