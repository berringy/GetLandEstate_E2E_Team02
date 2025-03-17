@US09
Feature:Admin girilen ilanları aktif edebilmeli, reddedebilmeli, güncelleyebilmeli

  @TC01
  Scenario: Verify that an admin can search on the "Adverts" page.
    Given The admin is logged into the system 01.
    When Click on the Adverts button 01.
    When Enter a keyword 'ev' in the search field 01.
    When Click on the Search button 01.
    Then The system displays advertisements that match the entered keyword without fail message 01.
    And Close the browser 01.

  @TC02
  Scenario: Verify that an admin can search on the "Adverts" page (Error Handling).
    Given The admin is logged into the system 02.
    When Click on the Adverts button 02.
    When Enter a keyword 'tu' in the search field 02.
    When Click on the Search button 02.
    Then The system displays advertisements that match the entered keyword without fail message 02.
    And Close the browser 02.

    @TC03
    Scenario: Verify that an admin can search,activates and rejects an advertisement.
      Given The admin is logged into the system 03.
      When Click on the Adverts button 03.
      When Enter a keyword 'yesil ev' in the search field 03.
      When Click on the Search button 03.
      When Click on the 'yesil ev' advert 03.
      When Select 'Activated' from dropdown menu bottom of the 'status' title 03.
      And Click on the Update button for Activated 03.
      And System displays update success message for Activated 03.
      When Select 'Rejected' from dropdown menu bottom of the 'status' title 03.
      And Click on the Update button for Rejected 03.
      Then System displays update success message for Rejected 03.
      And Close the browser 03.

  @TC04
  Scenario: Verify that an admin can search,activates and rejects an advertisement (Error Handling).
    Given The admin is logged into the system 04.
    When Click on the Adverts button 04.
    When Enter a keyword 'ev' in the search field 04.
    When Click on the Search button 04.
    When Click on the 'House' advert 04.
    When Select 'Activated' from dropdown menu bottom of the 'status' title 04.
    And Click on the Update button for Activated 04.
    And System displays update success message for Activated 04.
    When Select 'Rejected' from dropdown menu bottom of the 'status' title 04.
    And Click on the Update button for Rejected 04.
    Then System displays update success message for Rejected 04.
    And Close the browser 04.