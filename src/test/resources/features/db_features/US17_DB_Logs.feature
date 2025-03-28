
@dbus17

Feature:Validate Users column names and information via DB.

  Scenario: Validate Users column names and information.
    Given Connect to the DataBase.
    When Send query for Users column names of the logs.
    Then Validate Users column names from resultset.
    And Verify the accuracy for id three informations.