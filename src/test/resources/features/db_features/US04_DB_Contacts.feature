@db04
Feature: Contacts tablosunun sütun isimlerini ve bilgilerini doğrula

  Scenario: Contacts tablosundaki sütun isimlerini doğrula
    Given Connect to the DataBase..
    When Send query for column names of the contacts table..
    Then Validate column names from resultset..

  Scenario: Contacts tablosundaki son eklenen kaydı doğrula
    Given Connect to the DataBase..
    When Send query to get the last record from the contacts table..
    Then Display and verify the last record added to the table..