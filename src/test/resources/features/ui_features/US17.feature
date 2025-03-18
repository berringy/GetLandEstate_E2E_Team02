@US17
Feature:Manager rolu ile ilanlar raporu olusturma

    @TC01
    Scenario: TC01 Manager girilen degerlerle rapor olusturur
        Given GetLandEstate sayfasına gidilir
        When Manager olarak giris yapilir
        And Reports sayfasina gidilir
        And StartDate alanina gecerli bir tarih girilir
        And EndDate alanina gecerli bir tarih girilir
        And Rapor oluştur butonuna tıklanır.
        Then Raporun başarıyla oluştuğu doğrulanır


    @TC02
    Scenario: TC02 Manager MOST POPULAR PROPERTIES alaninda girilen amount degeri ile rapor olusturur
        Given GetLandEstate sayfasına gidilir
        When Manager olarak giris yapilir
        And Reports sayfasina gidilir
        And MOST POPULAR PROPERTIES alaninda amount degeri girilir
        And MOST POPULAR PROPERTIES alanindaki rapor oluştur butonuna tıklanır.
        Then Raporun başarıyla oluştuğu doğrulanır

    @TC03
    Scenario:TC03 Manager Role alaninda secilen  deger ile rapor olusturur
        Given GetLandEstate sayfasına gidilir
        When Manager olarak giris yapilir
        And Reports sayfasina gidilir
        And Users alaninda role olarak manager secilir.
        And Users alanindaki rapor oluştur butonuna tıklanır.
        Then Authentication Raporun başarıyla oluştuğu doğrulanır

    @TC04
    Scenario:TC04 Manager Start Date, End Date, Status bilgileri girerek tur isteği oluşturabilmeli
        Given GetLandEstate sayfasına gidilir
        When Manager olarak giris yapilir
        And Reports sayfasina gidilir
        And Tour Request alanindaki Start Date degeri girilir
        And Tour Request alanindaki End Date degeri girilir
        And Tour Request alanindaki rapor oluştur butonuna tıklanır.
        Then Raporun başarıyla oluştuğu doğrulanır

