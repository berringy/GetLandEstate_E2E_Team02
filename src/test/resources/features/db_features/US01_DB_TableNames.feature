@DB_US01

Feature:Validate cities column names and information of the cities table

  Scenario: Validate  column names of the cities table
    Given Connect to the database1
    When Send query to retrieve all table names1
    Then Validate table names from resultset1
    And Display and verify the last record added to each table1