@UIUS18
  Feature: US18 Manager ilanlar ile ilgili işlemler yapabilmelidir.


    Background:
      Given Sayfaya gidilir.
      When  Login linkine tıklanır.
      And   Geçerli email ve şifre ile sisteme giriş yapılır.
      And   Back to site linkine tıklanır.


    @US18TC01
    Scenario: TC01	Manager sayfadaki bir ilanı görmek için istekte bulunabilmeli.

         And   Search Box'a istenen ilanın ismi yazılır ve aratılır.
         And   Arama sayfasında tur talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.
         And   İlan detay sayfasında bulunan Schedule a tour alanından tarih ve saat bilgileri girilir
         And   Submit a tour request butonu tıklanır.
         And   Manager'ın tur talebinde bulunabildiği doğrulanır.
         And   Gönderilen tur talebi MY TOUR REQUEST linkinden silinir.
         And   Sayfa Kapatılır.


    @US18TC02
    Scenario: TC02	Manager sayfadaki bir ilanı görmek için istekte bulunurken daha önceden ilan sahibi tarafından onaylanmış başka bir görme isteği ile aynı gün ve saatte görme isteği oluşturamamalıdır. (Negative scenario)

         And   Search Box'a daha önceden tur talebi onaylanmış bir randevu ilanın ismi yazılır ve aratılır.
         And   Arama sayfasında daha önceden tur talebi onaylanmış tarih ve saatde randevu talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.
         And   İlan detay sayfasında bulunan Schedule a tour alanına başka biri tarafından önceden oluşturulup onaylanan randevu ile aynı tarih ve saat bilgileri girilir.
         And   Submit a tour request butonu tıklanır.
         And   Manager'ın hata mesajı aldığı doğrulanır.
         And   Sayfa Kapatılır.


    @US18TC03
    Scenario: TC03	Manager sayfadaki bir ilanı görmek için istekte bulunurken geçmiş günler için istekte bulunamamalıdır. (Negative scenario)

         And   Search Box'a daha önceden tur talebi onaylanmış bir randevu ilanın ismi yazılır ve aratılır.
         And   Arama sayfasında tur talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.
         And   İlan detay sayfasında bulunan Schedule a tour alanına geçmiş bir tarih bilgisi girilir.
         And   Submit a tour request butonu tıklanır.
         And   Manager'ın randevu oluşturamadığı doğrulanır.
         And   Sayfa Kapatılır.

    @US18TC04
    Scenario: TC04	Manager kendi verdiği ilanların gezme isteklerini görebilmelidir.

         And   User logo üzerine tıklanıp menu açılır.
         And   Açılan menü üzerinden MY TOUR REQUEST linkine tıklanır.
         And   Açılan sayfada bulunan MY RESPONSES sekmesine tıklanır.
         And   Manager'ın göderilen randevu isteklerini görüntüleyebildiği doğrulanır.
         And   Sayfa Kapatılır.

    @US18TC05
    Scenario: TC05	Manager kendi verdiği ilanların gezme isteklerini kabul edebilmeli ve reddedebilmeli.

         And   User logo üzerine tıklanıp menu açılır.
         And   Açılan menü üzerinden MY TOUR REQUEST linkine tıklanır.
         And   Açılan sayfada bulunan MY RESPONSES sekmesine tıklanır.
         And   Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu ONAY butonu tıklanır.
         And   Randevu onay doğrulama sorusunda YES butonu tıklanarak onaylanır.
         And   Manager'ın randevu isteğini kabul edebildiği doğrulanır.
         And   Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu RED butonu tıklanır.
         And   Randevu red işlemi doğrulama sorusunda YES butonu tıklanarak onaylanır.
         And   Manager'ın randevu isteğini reddedebildiği doğrulanır.
         And   Sayfa Kapatılır.













