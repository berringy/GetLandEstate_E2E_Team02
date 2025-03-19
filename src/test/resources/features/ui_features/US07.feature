@US007
Feature: US07

  @TC001
  Scenario: TC01 Tüm bilgiler doldurulduktan sonra Create butonuna tıklanması
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Tüm bilgiler doldurur
    When Create butonuna tiklanir
    Then Create butonuna tiklanildiginda ilan olusturulur
    And Sayfayi kapat

  @TC002
  Scenario: TC02 Title alani bos birakildiginda uyari mesaji kontrolu
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Title alani bos birakilarak diger alanlar doldurulur
    Then Enter Title alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

  @TC003
  Scenario: TC03 Description alanı bos birakildiginda uyari mesaji kontrolu
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Description alani bos birakilarak diger alanlar doldurulur
    Then Description alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

  @TC004
  Scenario: TC04 Address alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Address alani bos birakilmali
    Then Address alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

  @TC05
  Scenario: TC05 Resim Ekleme - 3 MB'tan büyük resim yüklendiğinde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Resim Ekle butonuna tiklar
    When 3 MB'tan büyük resim yüklendi
    Then Resim Ekleme - 3 MB'tan büyük resim yüklenemedigi uyari mesaji gorulur
    And Sayfayi kapat

  @TC06
  Scenario: TC06 Tüm bilgiler doldurulmadan Create butonuna tıklanması
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Create butonuna tiklanir
    And Sayfayi kapat

  @TC007
  Scenario: TC07 Price alanına 0 girildiğinde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Price alanına deger gir diğer alanları doldur.
    Then Price alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

  @TC008
  Scenario: TC08 Advert Type alanı seçilmediğinde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Advert Type alanını boş bırak, diğer alanları doldur.
    When Create butonuna tiklanir
    Then Advert Type alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

  @TC009
  Scenario: TC09 Country alani bos birakildiginda uyari mesaji gorulur
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Country alanı bos birakilir
    Then Country alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

  @TC010
  Scenario: TC10 Size alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Size alani bos birakilmali
    When Create butonuna tiklanir
    Then Size alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

  @TC011
  Scenario: TC11 Bedrooms alanı negatif girildiginde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Bedrooms alanı negatif girildi
    When Create butonuna tiklanir
    Then Bedrooms alani negatif girildiginda uyari mesaji gorulur

  @TC012
  Scenario: TC12 Year of build alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Year of build alani bos birakilmali
    When Create butonuna tiklanir
    Then Year of build alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat