@DB_US12

Feature:Validate images column names and information of the images table

  Scenario: Validate  column names of the images table
    Given Connect to the DB
    When Send query for column names of the images table
    Then Validate images column names from resultset
    And Display and verify the last record added to the images table

