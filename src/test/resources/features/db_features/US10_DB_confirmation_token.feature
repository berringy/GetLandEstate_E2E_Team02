@db
Feature: US10 | confirmation_token sutun isimlerini ve bilgilerini doğrula
@DB05TC01
  Scenario: TC01 | confirmation_token sutun isimlerini dogrulama
    Given Confirmation_token tablosu için Database Bağlantısı kurulur.
    When Kayitli confirmation_token sutun isimlerini almak icin query gonderilir.
    And  Kayitli confirmation_token sutun isimleri dogrulanir.

@DB05TC02
  Scenario: TC02 | confirmation_token tablosunun bilgilerini ve içeriğini dogrulama
    Given Confirmation_token tablosu için Database Bağlantısı kurulur.
    And Kayitli confirmation_token sutun bilgilerini almak icin query gonderilir.
    And confirmation_token tablosunun kayıtlı datalar içerdiği doğrulanır.
    And Kayitli confirmation_token sutunlarının içerdiği bilgiler dogrulanir.
