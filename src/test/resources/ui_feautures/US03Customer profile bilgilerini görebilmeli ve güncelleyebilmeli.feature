@US03

Feature: US_03


  @US03TC01
  Scenario: TC01 customer profile bilgilerini görebilmeli ve güncelleyebilmeli

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And e-mail alanı doldurulur
    And password alanı doldurulur
    And login butonuna basılır
    And myProfile sekmesine tıklanır
    And Name kısmına yeni isim girilir
    Then Uptade kısmına tıklanır ve ismin değiştiği doğrulanır
    And kullanıcı çıkış yapar

  @US03TC02
  Scenario: TC02 customer profile bilgilerini görebilmeli ve güncelleyebilmeli

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And e-mail alanı doldurulur
    And password alanı doldurulur
    And login butonuna basılır
    And myProfile sekmesine tıklanır
    And soyisim kısmına yeni soyisim girilir
    Then uptade kısmına tıklanır ve soyismin değiştiği doğrulanır
    And kullanıcı çıkış yapar

  @US03TC03
  Scenario: TC03 customer profile bilgilerini görebilmeli ve güncelleyebilmeli

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And e-mail alanı doldurulur
    And password alanı doldurulur
    And login butonuna basılır
    And myProfile sekmesine tıklanır
    And phonenumber kısmına yeni phonenumber girilir
    Then uptade kısmına tıklanır ve phonenumberın değiştiği doğrulanır
    And kullanıcı çıkış yapar

  @US03TC04
  Scenario: TC04 customer profile bilgilerini görebilmeli ve güncelleyebilmeli


    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And e-mail alanı doldurulur
    And password alanı doldurulur
    And login butonuna basılır
    And myProfile sekmesine tıklanır
    And mail kısmına yeni mail girilir
    Then uptade kısmına tıklanır ve mailin değiştiği doğrulanır
    And kullanıcı çıkış yapar


  @US03TC05
  Scenario: TC05 customer profile bilgilerini görebilmeli ve güncelleyebilmeli

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And e-mail alanı doldurulur
    And password alanı doldurulur
    And login butonuna basılır
    And myProfile sekmesine tıklanır
    And change password sekmesine tıklanır
    And  şu anki password girilir
    And  yeni password girilir
    And  yeni password doğrulanır
    And  change butonuna basılır
    Then şifrenin değiştiği doğrulanır


  @US03TC06
  Scenario: TC06 customer profile bilgilerini görebilmeli ve güncelleyebilmeli

    Given kullanici getlandestate anasayfasina gider
    When login sayfasına gidilir
    And e-mail alanı doldurulur
    And kullanıcı yeni şifre ile giriş yapar
    And login butonuna basılır
    And myProfile sekmesine tıklanır
    And delete account sekmesine tıklanır
    And  geçerli şifre girilir
    And  delete account butonuna tıklanır
    Then  hesabın silindiği doğrulanır


