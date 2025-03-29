@DB_US18

Feature:Favorites sutun isimlerinin kontrolu

  Scenario: Favoriler sutun isimlerini dogrula
    Given Veritabani baglantisi sagglanir
    When Favoriler tablosunun sütun adları için sorgu gönderilir
    Then Sonuç kümesinden şehir sütun adlarını doğrula
    And Favoriler tablosuna son eklenen veriyi göster ve doğrula