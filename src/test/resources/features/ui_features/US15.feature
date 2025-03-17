@US15


@US15
Feature: US15 The admin should be able to perform operations related to announcements.




  Scenario: TC01 Google sayfasinda arama yapilir
    Given User login as a manager
    When Navigate to the Categories page
    When Click on the "Add New Category" button
    And Enter category name in the input field
    Then Click on the Save button Categories
    Then Verify that categories has created
    Then close driver


  Scenario: TC02 Verify that a new advert type can be added successfully
    Given User login as a manager
    When Navigate to the Advert Types page
    When Click on the Add New Advert Type button
    When Enter advert type name in the input field
    When Click on the Save button Advert Type
    Then Verify that new Advert Type has created
    And close driver


  Scenario: TC03 Verify that an admin can search for a user successfully
    When User login as a manager
    When Navigate to the User Management page
    When Enter a username or email in the search bar
    When Verify that username is exist
    And close driver

  Scenario: TC04 Verify that an admin can update user information

    When User login as a manager
    When Navigate to the User Management page
    When Search for the user
    When Click the Edit button next to the user
    When Modify user details name
    When Click Save modified user
    And close driver


  Scenario: TC05 Admin is logged in and on the User Management page

    When User login as a manager
    When Navigate to the User Management page
    When Search for the user
    When Click the Edit button next to the user
#    When Select a new role from the dropdown
#    When Click Save modified user
    And close driver

  Scenario: TC06 Verify that an admin can view Tour Requests

    When User login as a manager
    When Navigate to the Tour Request page
    When Check the list of Tour Requests
    When close driver










