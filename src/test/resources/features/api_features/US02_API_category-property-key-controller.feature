@apius02
Feature: US02 API Category property key controller

  Scenario: TC01 Create, verify, update and delete a category property key
    Given a URL is created for the POST
    When create a payload for the Post and get the response
    Then verify that the status code is 200
    And compare the payload with the response
    Given A get request is created with the previously created id
    And Validate the data created with the post request with the response
    Given update the category property key controller with the id created with the post request
    When Send PUT request for category property key controller and receive response
    Then Verify response body against updated data
    Given delete the category property key controller with the id created with the post request
    When Send DELETE request for category property key controller and receive response
    Then Verify response body against deleted data
