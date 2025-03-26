@US07API
Feature: Report Generation API Tests

  #GET /report
  Scenario: Generate a Summary Report with total counts
    Given Base url and path parameter "/report" are set
    When a GET request is sent to the API without query parameters
    Then The response status code should be 200
    And The response content type should be "application/json"
    And The response body should contain total counts
    And The response should contain the correct total counts

  #GET /report/tour-requests     HATA 400
  Scenario: Generate a Tour Request Report with given parameters
    Given Base url and path parameter "/report/tour-requests" are set
    And Payload setup with startDate "2025-01-01", endDate "2025-03-22", and status "0"
    When a GET request is sent to the API
    Then The response status code should be 200
    And The response content type should be "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    And The response should be an Excel file

  #GET /report/most-popular
  Scenario: Generate the Most Popular Advert Report
    Given Base url and path parameter "/report/most-popular" are set
    And Query parameter "amount" is set to "1"
    When a GET request is sent to the API
    Then The response status code should be 200
    And The response content type should be "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    And The response should be an Excel file

  #GET /report/adverts
  Scenario: Generate an Advert Report with given parameters
    Given Base url and path parameter "/report/adverts" are set
    And Payload setup with startDate "2025-01-01", endDate "2025-03-22", status "0", advert type "2", and category "1"
    When a GET request is sent to the API
    Then The response status code should be 200
    And The response content type should be "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    And The response should be an Excel file

  #GET /report/users     HATA 401
  Scenario: Generate a User Report by Role
    Given Base url and path parameter "/report/users" are set
    And Query parameter "role" is set to "ADMIN"
    When a GET request is sent to the API
    Then The response status code should be 200
    And The response content type should be "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
    And The response should be an Excel file





