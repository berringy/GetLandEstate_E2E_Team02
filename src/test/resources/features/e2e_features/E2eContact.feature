@e2eContact
  Feature: End to end for contact field.

 @e2eui19TC01
  Scenario: User can successfully send a message through the contact form
    Given User is on the Contact page
    When User enters valid "Techpro" in the First Name field
    And User enters valid "Education" in the Last Name field
    And User enters valid "techpro@education.com" in the Email field
    And User enters a message "Bu bir TEST mesajıdır."
    And User clicks on the Send button
    Then User should see a confirmation message "Mesaj başarıyla gönderildi."

   @e2edb04
   @e2edb04 @tc01
    Scenario: Contacts tablosundaki sütun isimlerini doğrula
      Given Connect to the DataBase..
      When Send query for column names of the contacts table..
      Then Validate column names from resultset..

    @e2edb04 @tc02
    Scenario: Contacts tablosundaki son eklenen kaydı doğrula
      Given Connect to the DataBase..
      When Send query to get the last record from the contacts table..
      Then Display and verify the last record added to the table..


    @e2eapi06contact
    @e2eapi06contact @post
    Scenario: Verify that a new contact message can be created
      Given Prepare a new contact message.
      When Send the new contact message.
      Then Receive a success for status code.
      And Verify the message is created successfully.

    @e2eapi06contact @get
    Scenario: Verify that a specific contact message can be retrieved
      Given Retrieve a specific contact message by ID.
      Then Receive a status code for success.
      And Verify the selected message details.

    @e2eapi06contact @patch
    Scenario: Verify that a contact message can be updated.
      Given Update the status of a specific contact message.
      Then Receive status code for validation.
      And Verify the message is updated correctly.

    @e2eapi06contact @delete
    Scenario: Verify that a contact message can be deleted.
      Given Delete a specific contact message.
      Then Receive a validate status code.
      And Verify the message is deleted successfully.
