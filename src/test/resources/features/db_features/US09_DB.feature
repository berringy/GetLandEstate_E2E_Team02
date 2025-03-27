@db

Feature: category_property_keys dogrulama

  Scenario: Kayıtlı category_property_keys sutun isimlerini ve bilgilerini doğrulama
    Given DB baglantisi kurulur
    When category_property_keys tablosunun sütun adlarını almak için query gonderilir
    Then category_property_keys tablosunun sütun adları dogrulanir
    And category_property_keys tablosuna eklenen son kayıt dogrulanir
