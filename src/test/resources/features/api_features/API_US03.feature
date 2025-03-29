@APIUSs03
Feature: Advert   Testleri

  Scenario: TC07 | Advertslerde admin ile arama islemi yapilir
    Given Database connection saglandi(f7)
    And   Sorgu gonderildi(f7)
    Then  Gelen cevap dogrulandi(f7)


  Scenario: TC08 | Adverts arama islemi yapilir
    Given Database connection saglandi(f8)
    And   Sorgu gonderildi(f8)
    Then  Gelen cevap dogrulandi(f8)

  Scenario: TC09 | Advertslerin hepsi id ile kontrol edilir
    Given Database connection saglandi(f9)
    And   Sorgu gonderildi(f9)
    Then  Gelen cevap dogrulandi(f9)


  Scenario: TC11 | Advert kategorilerine  bakilir
    Given Database connection saglandi(f11)
    And   Sorgu gonderildi(f11)
    Then  Gelen cevap dogrulandi(f11)


  Scenario: TC12 | Advert ilanlarına herhangi bir rolle bakilir
    Given Database connection saglandi(f12)
    And   Sorgu gonderildi(f12)
    Then  Gelen cevap dogrulandi(f12)

  Scenario: TC13 | Advert ilanlarına adminle bakilir
    Given Database baglantisi saglandi(f13)
    And   Guncellenecek veri gonderilir(f13)
    Then  Gelen cevap dogrulanir(f13)







