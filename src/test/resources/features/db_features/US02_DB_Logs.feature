@dbus02

Feature:Validate Users column names and information via DB.

  Scenario: Validate Categories column names and information.
    Given Connect to the DataBase as Admin.
    When Send query for Categories column names of the logs.
    Then Validate Categories column names from resultset.
    And Verify the accuracy of the apartment title and information.