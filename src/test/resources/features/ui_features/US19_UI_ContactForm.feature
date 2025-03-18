@US19
Feature: Contact Form Functionality

  @US19TC01
  Scenario: User can successfully send a message through the contact form
    Given User is on the Contact page
    When User enters valid "Techpro" in the First Name field
    And User enters valid "Education" in the Last Name field
    And User enters valid "techpro@education.com" in the Email field
    And User enters a message "Bu bir TEST mesajıdır."
    And User clicks on the Send button
    Then User should see a confirmation message "Mesaj başarıyla gönderildi."

  @US19TC02
  Scenario: User cannot submit the form with invalid data
    Given User is on the same page
    When User enters invalid "&?" in the First Name field
    And User enters invalid "$#" in the Last Name field
    And User enters invalid "w@2" in the Email field
    And User enters invalid "£" in the Message field
    Then User should see that the Send button is disabled

  @US19TC03
  Scenario: User connot submit the form with empty field
    Given User is on the same page
    When User leaves the First Name field empty
    And User leaves the Last Name field empty
    And User leaves the Email field empty
    And User leaves the Message field empty
    Then User should see that the Send button is disabled

  @US19TC04
  Scenario: User cannot submit the form with data less than 2 characters
    Given User is on the same page
    When User enters "T" in the First Name field
    And User enters "T" in the Last Name field
    And User enters "T" in the Email field
    And User enters "T" in the Message field
    Then User should see that the Send button is disabled
    And User closes the browser




