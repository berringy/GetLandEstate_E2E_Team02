@US006
Feature: US06

@TC001
    Scenario: TC01 Title alani bos birakildiginda uyari mesaji kontrolu
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Title alani bos birakilarak diger alanlar doldurulur
    Then Enter Title alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC002
    Scenario: TC02 Description alanı bos birakildiginda uyari mesaji kontrolu
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Description alani bos birakilarak diger alanlar doldurulur
    Then Description alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC003
    Scenario: TC03 Price alanına 0 girildiğinde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Price alanına deger gir diğer alanları doldur.
    Then Price alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC004
    Scenario: TC04 Advert Type alanı seçilmediğinde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Advert Type alanını boş bırak, diğer alanları doldur.
    When Create butonuna tiklanir
    Then Advert Type alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC005
    Scenario: TC05 Common Information alanlarının doldurulduğunda doğrulama
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Title, Description, Price, Advert Type, Category alanlarını doldur.
    Then  Title, Description, Price, Advert Type, Category alanlarını doldu oldugu dogrulanir
    And Sayfayi kapat

@TC006
    Scenario: TC06 Country alani bos birakildiginda uyari mesaji gorulur
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Country alanı bos birakilir
    Then Country alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC007
    Scenario: TC07 Address alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Address alani bos birakilmali
    Then Address alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC008
    Scenario: TC08 Address Information alanlarının doldurulduğunda doğrulama
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Country, City, District, Address alanlarını doldur.
    Then  Country, City, District, Address alanlarını doldu oldugu dogrulanir
    And Sayfayi kapat

@TC009
    Scenario: TC09 Size alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Size alani bos birakilmali
    When Create butonuna tiklanir
    Then Size alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC010
    Scenario: TC10 Bedrooms alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Bedrooms alani bos birakilmali
    When Create butonuna tiklanir
    Then Bedrooms alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC011
    Scenario: TC11 Bedrooms alanı negatif girildiginde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Bedrooms alanı negatif girildi
    When Create butonuna tiklanir
    Then Bedrooms alani negatif girildiginda uyari mesaji gorulur


@TC012
    Scenario: TC11 Bathrooms alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Bathrooms alani bos birakilmali
    When Create butonuna tiklanir
    Then Bathrooms alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC013
    Scenario: TC13 Bathrooms alanı negatif girildiginde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Bathrooms alanı negatif girildi
    When Create butonuna tiklanir
    Then Bathrooms alani negatif girildiginda uyari mesaji gorulur

@TC014
    Scenario: TC14 Year of build alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Year of build alani bos birakilmali
    When Create butonuna tiklanir
    Then Year of build alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC015
    Scenario: TC15 Year of build alanı negatif girildiginde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Year of build alanı negatif girildi
    When Create butonuna tiklanir
    Then Year of build alani negatif girildiginda uyari mesaji gorulur

@TC016
    Scenario: TC16 Maintenance Fee alanı boş bırakıldığında uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Maintenance Fee alani bos birakilmali
    When Create butonuna tiklanir
    Then Maintenance Fee alani bos birakildiginda uyari mesaji gorulur
    And Sayfayi kapat

@TC017
    Scenario: TC17 Maintenance Fee alanı negatif girildiginde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Maintenance Fee alanı negatif girildi
    When Create butonuna tiklanir
    Then Maintenance Fee alani negatif girildiginda uyari mesaji gorulur

@TC018
    Scenario: TC18 Properties alanlarının doldurulduğunda doğrulama
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Properties alanlarını doldur.
    Then  Properties alanlarını doldu oldugu dogrulanir
    And Sayfayi kapat

@TC019
    Scenario: TC19 Resim Ekleme - Geçerli bir resim yüklendiğinde doğrulama
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Resim Ekle butonuna tiklar
    When Geçerli bir resim yüklendi
    Then Resim Ekleme - Geçerli bir resim yüklendiğinde dogrulama
    And Sayfayi kapat

@TC020
    Scenario: TC20 Resim Ekleme - 3 MB'tan büyük resim yüklendiğinde uyarı mesajı kontrolü
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Resim Ekle butonuna tiklar
    When 3 MB'tan büyük resim yüklendi
    Then Resim Ekleme - 3 MB'tan büyük resim yüklenemedigi uyari mesaji gorulur
    And Sayfayi kapat

@TC021
    Scenario: TC21 Tüm bilgiler doldurulmadan Create butonuna tıklanması
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Create butonuna tiklanir
    And Sayfayi kapat

    @TC022
    Scenario: TC22 Tüm bilgiler doldurulduktan sonra Create butonuna tıklanması
    Given Manager Sayfasina Gider
    When Ilan ekle butonuna tiklar
    When Tüm bilgiler doldurur
    When Create butonuna tiklanir
    Then Create butonuna tiklanildiginda ilan olusturulur
    And Sayfayi kapat

