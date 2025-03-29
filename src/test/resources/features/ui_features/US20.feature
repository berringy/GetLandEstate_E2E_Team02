@US20
Feature: Manager rolu ile mesajlari gorme ve silme

  @TC001
  Scenario:Manager mesajlari gorebilmeli ve silebilmeli
    Given GetLandEstate sayfasına gidilir
    When Manager olarak giris yapilir
    And ContactMessages sayfasina gidilir
    And Herhangi bir mesaja tıklanır
    And Tiklanan mesaj silinir
    Then mesajın silindiği dogrulanir

  @TC002
  Scenario:Manager mesajlari okundu olarak isaretleyebilmeli
    Given GetLandEstate sayfasına gidilir
    When Manager olarak giris yapilir
    And ContactMessages sayfasina gidilir
    And Herhangi bir mesaja tıklanır
    And Tiklanan okundu olarak isaretlenir
    Then Mesajın okundu olarak isaretlendigi dogrulanir

  Scenario:Manager mesajlari arayabilmeli
    Given GetLandEstate sayfasına gidilir
    When Manager olarak giris yapilir
    And ContactMessages sayfasina gidilir
    And Searchboxa mesaj yazılır
    And Searchbox ile arama yapilir
    Then Yapilan arama dogrulanir

  @TC004
  Scenario: Manager Contact mesajlarda yazi ve tarih ile arama yapabilmeli
    Given GetLandEstate sayfasına gidilir
    When Manager olarak giris yapilir
    And ContactMessages sayfasina gidilir
    And Searchboxa mesaj yazılır
    And Tarih girilir
    And Arama yapilir
    Then Yapilan tarih aramasi dogrulanir

