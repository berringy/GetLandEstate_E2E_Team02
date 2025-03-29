@DB_US06

Feature:Validate cities column names and information of the cities table

  Scenario: Validate  column names of the cities table
    Given Connect to DB
    When Send query for column names of the cities table
    Then Validate cities column names from resultset
    And Display and verify the last record added to the cities table

