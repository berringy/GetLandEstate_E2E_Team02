
@US04
Feature: US04  Kullanıcı (Admin, Manager, Customer)  5 farkli dilde sayfayı görüntüleyebilmelidir.


  Scenario:TC01 Dil değiştirme menüsü görünürlüğü

  Given Ana sayfayı aç
  And Dil değiştirme butonunu bul
  When Butona tıklayarak açılır menüyü kontrol et
    And Tüm diller görünmeli

  Scenario:TC02 Tüm sayfaların farklı dillerde görüntülenmesi

    Given Dil menüsünü aç
  And Almanca seçeneğini seç
   And Sayfa Almanca olmalı


  Scenario:TC03 Sayfanın dili değiştirildiğinde, diğer sayfalarda da Dil degismeli
 Given Dil menüsünü aç ve İngilizce'yi seç
  Then Hakkında sayfasına git
  When Sayfa dilinin İngilizce olup olmadığını kontrol et
    And Sayfa ingilizce olmalı

  Scenario:TC04 Tarayıcı kapatılıp açıldığında dilin korunması
  Given Dil menüsünü aç ve Fransızca'yı seç
  Then Tarayıcıyı kapat ve tekrar aç
  When Sayfa dilinin Fransızca olup olmadığını kontrol et
  And Sayfa Fransızca olmalı

  Scenario:TC05 Gizlilik Politikası sayfasının dil desteği verilmesi
  Given Dil menüsünü aç ve Türkçe'yi seç
  When Gizlilik Politikası bağlantısına tıkla
  And Sayfa dilini kontrol et türkce omalai
And Sayfanin DiliTürkçe olmalı

  Scenario:TC06 Şartlar ve Koşullar sayfasının dil desteği verilmesi

  Given Dil menüsünü aç ve İspanyolca'yı seç
  Then Şartlar ve Koşullar bağlantısına tıkla
  When Sayfa dilini kontrol et dil ispanyolca olmali
  And Sayfa İspanyolca olmalı
@001
  Scenario:TC07 Gizlilik Politikası sayfasının Admin girisi ile dil desteği
  Given Ana sayfayı aç
    Given Dil menüsünü aç ve Almanca'yı seç
    Then Admin olarak Almanca dilinde  giriş yapilir
  And Gizlilik Politikası sayfasına Almanca dilinde  tıkla
  And  Gizlilik Politikası Sayfasi Almanca olmalı

  Scenario:TC08 "Şartlar ve Koşullar" sayfasının Admin girisi ile dil desteği verilmesi
  Given Dil menüsünü aç ve İspanyolca'yı seç
    Then Admin olarak ispanyolca dilinde  giriş yapilir
  Then Şartlar ve Koşullar bağlantısına ispanyolca dilinde tıkla
  And Sayfa İspanyolca olmalı

