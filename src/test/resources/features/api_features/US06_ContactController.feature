@us06contact
Feature: Contact Message Management

  @post
  Scenario: Verify that a new contact message can be created
    Given Prepare a new contact message.
    When Send the new contact message.
    Then Receive a success for status code.
    And Verify the message is created successfully.

    @get
  Scenario: Verify that a specific contact message can be retrieved
    Given Retrieve a specific contact message by ID.
    Then Receive a status code for success.
    And Verify the selected message details.

      @patch
  Scenario: Verify that a contact message can be updated.
    Given Update the status of a specific contact message.
    Then Receive status code for validation.
    And Verify the message is updated correctly.

        @delete
  Scenario: Verify that a contact message can be deleted.
    Given Delete a specific contact message.
    Then Receive a validate status code.
    And Verify the message is deleted successfully.