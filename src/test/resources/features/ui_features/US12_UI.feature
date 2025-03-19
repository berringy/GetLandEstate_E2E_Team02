@US12
Feature: US12 Kullanıcı (Sayfaya Kayıt olmayan) satılık ve kiralık ilan arayabilmeli

  Scenario:TC01 Genel ilan araması yapabilme

  Sayfayı aç
  Arama çubuğuna "house" yaz ve ara
  Listelenen ilanları incele
  İlanlar açılmalı




  Scenario:TC02 Özel arama yapabilmeli

  Sayfayı aç ve arama filtresine gir
  Price Range, Category, City seç ve ara
  İlanları inceleyerek detaylarını kontrol et
  Sonuçlar listelenmeli İlanlar açılmalı





  Scenario:TC03 İlan detay sayfasında bilgiler görüntüleme(Resim, Description, DETAILS, LOCATION )

  Sayfayı aç ve bir ilana tıkla
  Description bilgilerini kontrol et
  Details sekmesini aç
  Location sekmesine geç
  İlan resimlerini kontrol et
  Tüm bilgiler eksiksiz olmalı





  Scenario:TC04 İlanı verenin iletişim bilgilerini tıklandığında "Don't have an account? Create one now!" uyarı metni gelmeli

  Sayfayı aç ve bir ilana tıkla
  "Contact Number" butonuna tıkla
  Kullanıcı giriş yapmamışsa uyarı mesajını bekle
  Don't have an account? Create one now! mesajını kontrol et
  Popup açılmalı Uyarı çıkmalı






  Scenario:TC05 Tarih ve saat girerek ilan için randevu isteğinde bulunabilmeli
  Sayfayı aç ve bir ilana tıkla
  "Schedule a tour"bölümünün oldugunu kotrol et
  Randevu için tarih ve saat gir
  "Submit a tour request" butonuna tikla
  Randevu talebinin olusturuldugunu kontrol et



  Scenario:TC06 Giriş yapmamış kullanıcıya randevu isteğinde uyarı mesajlarının gösterilmesi ve register sayfasına yönlendirme

  Sayfayı aç ve bir ilana tıkla
  Schedule a tour bölümününe git
  Randevu için tarih ve saat gir
  Submit a tour request butonuna tikla
  Log in for tour request ve Don't have an account? Create one now! mesajlarını kontrol et
  Create one now! metnine tıkla
  Register sayfasında oldugunu dogrula




