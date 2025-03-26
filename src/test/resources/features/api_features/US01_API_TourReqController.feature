@US01API
Feature: Tour Request Management API Tests

    #POST /tour-requests
  Scenario: User creates a tour request
    Given Base url and path parameter "/tour-requests" are set
    When Payload setup and a post request is sent to the API
    Then The response status code should be 200
    And The response content type should be "application/json"
    And The response body should contain the tour request id

    #GET /tour-requests/{id}/decline
  Scenario: The advertiser declines the incoming tour request.
    Given a GET request is sent to the API to decline the tour request
    Then The response status code should be 200
    And The response content type should be "application/json"
    And The response body should contain "DECLINED"

    #UPDATE /tour-requests/{id}/auth
  Scenario: User updates the created tour request
    Given Payload setup and a put request is sent to the API
    Then The response status code should be 200
    And The response content type should be "application/json"
    And The response body should contain the tour request id

    #GET /tour-requests/{id}/auth     GET /tour-requests/auth/guest
  Scenario: User views updated tour request
    Given a GET request is sent to the API to view the tour request
    When The user views their own tour requests
    Then The response status code should be 200
    And The response content type should be "application/json"
    And The response body should contain the tour request id

      #GET /tour-requests/{id}/approve    GET /tour-requests/auth/owner
  Scenario: The advertiser approves the incoming tour request.
    Given a GET request is sent to the API to approve the tour request
    And The response body should contain "APPROVED"
    When The advertiser views all tour requests received
    Then The response status code should be 200
    And The response content type should be "application/json"

      #GET /tour-requests/{id}/cancel
  Scenario: User cancels approved tour request
    Given a GET request is sent to the API to cancel the tour request
    Then The response status code should be 200
    And The response content type should be "application/json"
    And The response body should contain "CANCELLED"

    #DELETE /tour-requests/{id}
  Scenario: User deletes the tour request
    Given User creates a new tour request
    When a GET request is sent to the API to delete the tour request
    Then The response status code should be 200
    And The response content type should be "application/json"
    And The response body should contain "DELETED"