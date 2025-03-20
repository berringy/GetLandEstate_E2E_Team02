@DB_US003

Feature:Validate category_property_values column names and information

Scenario: Validate column names of category_property_values table via DB
    Given Connect to DB server for property values
    When Send query to get column names of category_property_values table
    Then Verify column names of category_property_values table
    When Send query to get the first record from category_property_values table
    Then Verify the first record has valid data in category_property_values table
    And close for propertyValues DB connection
