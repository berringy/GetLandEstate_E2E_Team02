@dbus11

Feature:Validate column names and information of the logs table via DB

Scenario: Validate column names of the logs table via DB
    Given Connect to the DataBase
    When Send query for column names of the logs table
    Then Validate column names from resultset
    And Display and verify the last record added to the table

