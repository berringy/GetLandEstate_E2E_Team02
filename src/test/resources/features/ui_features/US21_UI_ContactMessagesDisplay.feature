@US21
Feature: Displaying Contact Messages

  @US21TC01
  Scenario: User should be able to display contact messages
    Given User is on the homepage
    When User clicks on the -Giris Yap- link
    And User enters a valid email in the Email field
    And User enters a valid password in the Sifre field
    And User clicks on the -GIRIS- button
    And User clicks on the -iletisim Mesajlari- link
    And User should see the list of received messages
    Then User clicks on the message

  @US21TC02
  Scenario: User should be able to delete contact messages
    Given User is on the same page
    When User clicks on the message
    And User clicks on the -Sil- icon

  @US21TC03
  Scenario: User should be able to make messages read/unread
    Given User is on the same page
    When User clicks on the message
    And User clicks on the -Read- icon


  @US21TC04
  Scenario: User should be search for a message by keyword
    Given User is on the same page
    When User enters "test" into the search box
    And User clicks the search button
    And User clicks on the message
    Then Messages containing "test" should be displayed


  @US21TC05
  Scenario: User should be search for a message by keyword
    Given User is on the same page
    When User enters "test" into the search box
    And User clicks the filter button
    And User selects start date "11.03.2025"
    And User selects end date "17.03.2025"
    And User selects message status "Okundu"
    And User clicks on the Apply button
    And User clicks the search button
    And User clicks the filter button
    And User selects message status "Okunmamış"
    And User clicks on the Apply button
    And User clicks the search button
    And User clicks the filter button
    And User selects message status "Tümü"
    And User clicks on the Apply button
    And User clicks the search button
    And User clicks on the message
    Then Messages containing "test" should be displayed
    And User closes the browser



