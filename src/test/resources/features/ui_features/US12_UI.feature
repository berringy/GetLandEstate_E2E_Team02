@US12
Feature: US12 Kullanıcı (Sayfaya Kayıt olmayan) satılık ve kiralık ilan arayabilmeli

  Scenario:TC01 Genel ilan araması yapabilme

 Given Sayfayı aç
  When Arama çubuğuna house yaz ve ara
  Then Listelenen ilanları incele
  And İlanlar açılmalı



  Scenario:TC02 Özel arama yapabilmeli
 Given Sayfayı aç ve arama filtresine gir
  When Price Range, Category, City seç ve ara. Besyüzbin Euro, house, Antalya
  Then İlanları inceleyerek detaylarını kontrol et
  And Sonuçlar listelenmeli İlanlar açılmalı





  Scenario:TC03 İlan detay sayfasında bilgiler görüntüleme(Resim, Description, DETAILS, LOCATION )

  Given Sayfayı aç ve bir ilana tıkla
  Then Description bilgilerini kontrol et
  When Details sekmesini aç
  And Location sekmesine geç
  And İlan resimlerini kontrol et
  And Tüm bilgiler eksiksiz olmalı





  Scenario:TC04 İlanı verenin iletişim bilgilerini tıklandığında "Don't have an account? Create one now!" uyarı metni gelmeli

 Given Sayfayı aç ve bir ilana tıkla
  When Contact Number butonuna tıkla
  Then Kullanıcı giriş yapmamışsa uyarı mesajını bekle
  When Don't have an account? Create one now! mesajını kontrol et
  And Popup açılmalı Uyarı çıkmalı






  Scenario:TC05 Tarih ve saat girerek ilan için randevu isteğinde bulunabilmeli
  Given Sayfayı aç ve bir ilana tıkla
  When Schedule a tour bölümününe git
  Then Randevu için tarih ve saat gir
  And Submit a tour request butonuna tikla
  And Randevu talebinin olusturuldugunu kontrol et



  Scenario:TC06 Giriş yapmamış kullanıcıya randevu isteğinde uyarı mesajlarının gösterilmesi ve register sayfasına yönlendirme

  Given Sayfayı aç ve bir ilana tıkla
  When Schedule a tour bölümününe git
  Then Randevu için tarih ve saat gir
  And Submit a tour request butonuna tikla
 And Log in for tour request ve Don't have an account? Create one now! mesajlarını kontrol et
  When Create one now! metnine tıkla
 And Register sayfasında oldugunu dogrula




