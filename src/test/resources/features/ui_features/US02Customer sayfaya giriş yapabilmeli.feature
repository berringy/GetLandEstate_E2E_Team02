@US02
Feature: US_02

  @US02TC01
  Scenario: TC01 customer sayfaya giriş yapabilmeli

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And  e-mail alanı doldurulur
    And  password alanı doldurulur
    And  login butonuna basılır
    Then getlandstate home sayfası geldiği doğrulanır
    And kullanıcı çıkış yapar



  @US02TC02
  Scenario: TC02 customer sayfaya yanlış e-mail ile giriş yapamamalı

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And yanlış e-mail alanı doldurulur
    And  password alanı doldurulur
    And  login butonuna basılır
    Then login olunmadığı doğrulanır


  @US02TC03
  Scenario: TC03 customer şifre olmadan giriş yapamamalı

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And e-mail alanı doldurulur
    And  password alanı boş bırakılır
    Then  login butonuna işlevsiz olduğu doğrulanır



  @US02TC04
  Scenario: TC04 customer mail ve şifre olmadan giriş yapamamalı

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And  e-mail alanı boş bırakılır
    And  password alanı boş bırakılır
    Then  login butonuna işlevsiz olduğu doğrulanır









