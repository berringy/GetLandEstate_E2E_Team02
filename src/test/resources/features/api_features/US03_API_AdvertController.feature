@API
Feature: Advert   Testleri


  Scenario: TC01 | Advertlerin id güncelleme islemleri
    Given Database baglantisi saglandi
    And   Guncellenecek veri gonderilir
    Then  Gelen cevap dogrulanir