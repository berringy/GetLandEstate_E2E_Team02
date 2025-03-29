@APIUSs09
Feature: Favorites  Controller Testleri


    @APIUS09TC01
  Scenario: TC01 | Favorilerin idye gore kontrol edilmesi
    Given Database baglantisi saglanir
    And   Sorgu gonderilir
    Then  Dogru cevap geldigi dogrulanir


  @APIUS09TC02
  Scenario: TC02 | Kullanıcı favorilerini getirdiğinde doğru cevap dönmeli
    Given Database baglantisi saglanir(f2)
    And   Sorgu gonderilir(f2)
    Then  Dogru cevap dogrulanir(f2)

  @APIUS09TC03
  Scenario: TC03 | Kullanıcının Favori Emlak Sayısını Görüntüleme
    Given Database baglantisi saglanir(f3)
    And   Sorgu gonderilir(f3)
    Then  Dogru cevap dogrulanir(f3)

  @APIUS09TC04
  Scenario: TC04 | Kullanici favori ilanlarini yetkilendirme ile alir
    Given Database baglantisi saglanir(f4)
    And   Sorgu gonderilir(f4)
    Then  Dogru cevap dogrulanir(f4)

  @APIUS09TC05
  Scenario: TC05 | Kullanici favori ilanlarini yetkilendirme ile siler
    Given Database baglantisi saglanir(f5)
    And   Sorgu gonderilir(f5)
    Then  Dogru cevap dogrulanir(f5)

  @APIUS09TC06
  Scenario: TC06 | Kullanıcı belirli bir ilan için favori sayısını alır
    Given Database baglantisi saglanir(f6)
    And   Sorgu gonderilir(f6)
    Then  Dogru cevap dogrulanir(f6)

  #@APIUS09TC07
  #Scenario: TC07 | Admin id degerine göre secilir
   # Given Database baglantisi saglanir(f7)
   # And   Sorgu gonderilir(f7)
   # Then  Dogru cevap dogrulanir(f7)

  #@APIUS09TC08
  #Scenario: TC08 | Favorites tablosunda admin rolu ile favorileri saydirma
  #  Given Database baglantisi saglanir(f8)
  #  And   Sorgu gonderilir(f8)
  #  Then  Dogru cevap dogrulanir(f8)

  @APIUS09TC09
  Scenario: TC09 | Favorites tablosunda customer rolu ile id silme
    Given Database baglantisi saglanir(f9)
    And   Sorgu gonderilir(f9)
    Then  Dogru cevap dogrulanir(f9)

  @APIUS09TC10
  Scenario: TC10 | Favorites admin rolu ile  ile id silme
    Given Database baglantisi saglanir(f10)
    And   Sorgu gonderilir(f10)
    Then  Dogru cevap dogrulanir(f10)

  @APIUS09TC11
  Scenario: TC11 | Favorites admin rolu ile  her şeyi silme
    Given Database baglantisi saglanir(f11)
    And   Sorgu gonderilir(f11)
    Then  Dogru cevap dogrulanir(f11)