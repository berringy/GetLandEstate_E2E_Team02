@UIUS01
Feature: US001 Create Customer
  @UITC01
  Scenario: Customer should be able to register on the page Positive scenario
  Given Navigate to the "baseUrl" web site
  When The user clicks on the register button
  And Enters valid first name in the first name field
  And Enters the valid  last name in the  last name field
  And  Enters the valid phone number in the phone number field
  And Enters the valid email in the email field
  And Enters the password in the password field
  And Enters the confirm password in the confirm password field
  And Click the 'I understand and agree' checkbox
    And Click on Register button
  Then verify that the registration is successful
    And closes the application

  @UITC02
  Scenario: Verify error message for empty mandatory fields (negative scenario)
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Click Register Submit without entering any data
    Then Verify that the error message is displayed for all mandatory fields
    And close the browser

  @UITC03
  Scenario: Verify invalid email format error (negative scenario)
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enters the invalid email in the email field
    And Click password field
    Then Verify that the error message invaild emmail is displayed
    And close the browser

  @UITC04
  Scenario: Verify invalid email format error (negative scenario)
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enters the other invalid email in the email field
    And Click password field
    Then Verify that the error message invaild emmail is displayed
    And close the browser

  @UITC05
  Scenario: Verify password length and complexity requirements (negative scenario)
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enters a password shorter than eight characters
    And Click confirm password field
    Then Verify that the error message At least eight characters is displayed
    And close the browser

  @UITC06
  Scenario: Verify password length and complexity requirements (negative scenario)
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enter a password of eight characters, seven digits and one capital letter
    And Click confirm password field
    Then Verify that the error message One lowercase char is displayed
    And close the browser

  @UITC07
  Scenario: Verify password length and complexity requirements (negative scenario)
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enter a password consisting of eight characters, six digits, one uppercase letter and one lowercase letter
    And Click confirm password field
    Then Verify that the error message One special character is displayed
    And close the browser

  @UITC08
  Scenario: Verify mismatched password confirmation error
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enters the password in the password field
    And Enters the different password in the confirm password field
    And Click the I understand and agree checkbox
    Then Verify that the error message Passwords do not match is displayed
    And close the browser

  @UITC09
  Scenario: Verify that the 'Register' button is disabled until the 'I understand and agree' checkbox is checked
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Click the 'I understand and agree' checkbox
    Then Verify that the Submit Register button is not clickable
    And close the browser

  @UITC10
  Scenario: Verify that an error message is displayed when only spaces are entered in the First Name field
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enters the spaces in the first name field
    And Click the last name field
    Then Verify that the error message First Name is required is displayed
    And close the browser


  @UITC11
  Scenario: Verify that an error message is displayed when only spaces are entered in the Last Name field.
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enters the spaces in the last name field
    And Click the first name field
    Then Verify that the error message Last Name is required is displayed
    And close the browser

  @UITC12
  Scenario: Verify that an error message is displayed when ten digits zero  are entered in the Phone Number field
    Given Navigate to the "baseUrl" web site
    When The user clicks on the register button
    And Enters the ten digits zero in the phone number field
    And Click the email field
    Then Verify that the error message invalid Phone Number is displayed
    And close the browser











