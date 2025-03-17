
@US16
Feature: US16 The admin should be able to generate reports.

  Scenario: TC01 Verify that admin can generate a report based on start date,
  end date, category, advert type, and status

    Given User login as a manager
    But Navigate to the report generation page
    When Select filters: start date, end date, category, advert type, and status
    When Click Generate Adverts Report
    When wait two seconds
    Then close driver


  Scenario: TC02 Verify that admin can generate a report for popular ads


    Given User login as a manager
    But Navigate to the report generation page
    When Select Popular Ads report type
    When Click Generate Most Popular Properties Report
    When wait two seconds
    Then close driver


  Scenario: Verify that admin can generate a report based on user information

    Given User login as a manager
    But Navigate to the report generation page
    When Select users role: Admin
    When Click Generate users
    When wait two seconds
    Then close driver


  Scenario: Verify that admin can generate a report based on tour requests



    Given User login as a manager
    But Navigate to the report generation page
    When Select Tour Requests report type
    When Click Generate Tour Requests
    When wait two seconds
    Then close driver