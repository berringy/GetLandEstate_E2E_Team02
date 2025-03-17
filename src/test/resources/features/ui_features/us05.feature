@US05
Feature:Admin oluşturulan Customer kullanıcısını; Admin ve Manager yapılabilmeli,
  bilgileri güncellenebilmeli ve kullanıcılar silinebilmeli

  @TC01
  Scenario: Verify that an admin can log in successfully.
    Given Navigate to the login page.
    When Enter valid admin email.
    And  Enter valid admin password.
    Then Click on the login button.
    And Admin is logged in and redirected to the dashboard page.
    And Close the browser.

  @TC02
  Scenario: Verify that an admin cannot log in successfully. (negative scenario)
    Given Navigate to the login page
    When Enter valid admin email
    And Enter invalid admin password
    Then Click on the login button
    And System displays error message
    And Close the browser.

    @TC03
    Scenario: Verify that the admin can view all created user details 03.
      Given Navigate to the login page.
      When Enter valid admin email and password 03.
      And Click on the login button.
      Then Navigate to the users page 03.
      And The system displays users with their details 03.
      And Close the browser 03.

      @TC04
      Scenario: Verify that an admin can update user information.
        Given Navigate to the login page 04.
        When Enter valid admin email and password 04.
        When Click on the login button 04.
        When Click on the Users button to navigate Users page 04.
        When Select a user and click the pen button at the bottom of the Action title 04.
        Then Click on the Update button 04.
        Then System displays success message 04.
        And Close the browser 04.

        @TC05
        Scenario: Verify that an admin cannot update user information. (negative scenario)
          Given Navigate to the login page 05.
          When Enter valid admin email and password 05.
          When Click on the login button 05.
          When Click on the Users button to navigate Users page 05.
          When Select a user and click the pen button at the bottom of the Action title 05.
          Then Click on the Update button 05.
          Then System displays fail message 05.
          And Close the browser 05.

          @TC06
          Scenario: Verify that an admin can assign roles to users.
            Given Navigate to the login page 06.
            When Enter valid admin email and password 06.
            When Click on the login button 06.
            When Click on the Users button to navigate Users page 06.
            When Select a user and click the pen button at the bottom of the Action title 06.
            When Click on the menu at the bottom of the Roles title 06.
            When Select the Admin role 06.
            When Click on the Update button for Admin 06.
            When System displays success message for Admin 06.
            When Select the Customer role 06.
            When Click on the Update button for Customer 06.
            When System displays success message for Customer 06.
            When Select the Manager role 06.
            Then Click on the Update button for Manager 06.
            And System displays success message for Manager 06.
            And Close the browser 06.

            @TC07
            Scenario: Verify that an admin cannot assign roles to users. (negative scenario)
              Given Navigate to the login page 07.
              When Enter valid admin email and password 07.
              When Click on the login button 07.
              When Click on the Users button to navigate Users page 07.
              When Select a user and click the pen button at the bottom of the Action title 07.
              When Click on the menu at the bottom of the Roles title 07.
              When Select the Admin role 07.
              When Click on the Update button for Admin 07.
              When System displays fail message for Admin 07.
              When Select the Customer role 07.
              When Click on the Update button for Customer 07.
              When System displays fail message for Customer 07.
              When Select the Manager role 07.
              Then Click on the Update button for Manager 07.
              And System displays fail message for Manager 07.
              And Close the browser 07.

              @TC08
              Scenario: Verify that an admin can delete a user.
                Given Navigate to the login page 08.
                When Enter valid admin email and password 08.
                When Click on the login button 08.
                When Click on the Users button to navigate Users page 08.
                When Select a user and click the trash can button at the bottom of the Action title 08.
                When Click on the 'yes' button at the bottom of the message box that appears on the screen 08.
                Then System displays success message for delete 08.
                And Close the browser 08.

                @TC09
                Scenario: Verify that an admin cannot delete a user. (negative scenario)
                  Given Navigate to the login page 09.
                  When Enter valid admin email and password 09.
                  When Click on the login button 09.
                  When Click on the Users button to navigate Users page 09.
                  When Select a user and click the trash can button at the bottom of the Action title 09.
                  When Click on the 'yes' button at the bottom of the message box that appears on the screen 09.
                  Then System displays fail message for delete 09.
                  And Close the browser 09.



