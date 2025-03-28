@US04
Feature: US04 Advert Type Controller

  Scenario: TC01 Id ile advert typeları doğrulama
    Given Database ile bağlantı kurulur
    And   Sorgu gönderilir
    Then  Advert type doğrulanır

  Scenario: TC02 Bütün advert typeları doğrulama
    Given Database ile bağlantı kurulurr
    And   Databese sorgu gönderilir ve cevap alınır
    Then  Bütün advert typelar doğrulanır

  Scenario: TC03 Id ile advert types güncelleme
    Given Database ile bağlantı kurulurrr
    And   Databese güncellenecek veri gönderilir
    Then  Advert types güncellendiği doğrulanır

  Scenario: TC04 Advert types oluşturma
    Given Database ile bağlantısı kurulur
    And   Databese veri gönderilir
    Then  Advert types oluşturduğu doğrulanır

  Scenario: TC05 Advert types silme
    Given Database ile bağlantıı kurulur
    And   Databese silinecek veri gönderilir
    Then  Verinin silindiği doğrulanır