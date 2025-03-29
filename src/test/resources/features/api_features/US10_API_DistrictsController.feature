
@US10
Feature: US10 Districts Controller

  Scenario: TC01 Id ile bölge arama
    Given Database ile bağlantı kurulurrrr
    And   Sorgu gönderilirr
    Then  Doğru verilerin geldiği doğrulanır

  Scenario: TC02 Bütün belgeleri getirme
    Given Database ile bağlantı kurulurrrrr
    And   Sorgu gönderili
    Then  Bütün verilerin geldiği doğrulanır