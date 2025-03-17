@UIUS14
  Feature: US14 Manager randevu isteğinde bulunabilmelidir.

    Background:
          Given Sayfaya gidilir.
          When  Login linkine tıklanır.
          And   Geçerli email ve şifre ile sisteme giriş yapılır.
          And   Back to site linkine tıklanır.

    @US14TC01
    Scenario: TC01	Manager kendine ait olmayan bir ilan için randevu oluşturabilmeli.

          And   Search Box'a istenen ilanın ismi yazılır ve aratılır.
          And   Arama sayfasında tur talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.
          And   İlan detay sayfasında bulunan Schedule a tour alanından tarih ve saat bilgileri girilir
          And   Submit a tour request butonu tıklanır.
          And   Manager'ın tur talebinde bulunabildiği doğrulanır.
          And   Gönderilen tur talebi MY TOUR REQUEST linkinden silinir.
          And   Sayfa Kapatılır.

    @US14TC02
    Scenario: TC02	Manager oluşturduğu randevunun kabul veya reddedidiğini görebilmeli

          And   User logo üzerine tıklanıp menu açılır.
          And   Açılan menü üzerinden MY TOUR REQUEST linkine tıklanır.
          And   Açılan sayfada bulunan MY REQUESTS sekmesine tıklanır.
          And   Manager'ın gönderdiği randevu isteklerinin status başlığı altında kabul veya rededildiğinin görüntüleyebildiği doğrulanır.
          And   Sayfa Kapatılır.

    @US14TC03
    Scenario: TC03	Manager kendine ait olmayan bir ilan için randevu oluştururken daha önceden ilan sahibi tarafından onaylanmış başka bir randevu ile aynı gün ve saatte randevu oluşturamamalıdır. (Negative scenario)

          And   Search Box'a daha önceden tur talebi onaylanmış bir randevu ilanın ismi yazılır ve aratılır.
          And   Arama sayfasında daha önceden tur talebi onaylanmış tarih ve saatde randevu talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.
          And   İlan detay sayfasında bulunan Schedule a tour alanına başka biri tarafından önceden oluşturulup onaylanan randevu ile aynı tarih ve saat bilgileri girilir.
          And   Submit a tour request butonu tıklanır.
          And   Manager'ın hata mesajı aldığı doğrulanır.
          And   Sayfa Kapatılır.

    @US14TC04
    Scenario: TC04	Manager kendine ait olmayan bir ilan için randevu oluştururken geçmiş günler için randevu oluşturamamalıdır. (Negative scenario)

           And   Search Box'a istenen ilanın ismi yazılır ve aratılır.
           And   Arama sayfasında tur talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.
           And   İlan detay sayfasında bulunan Schedule a tour alanına geçmiş bir tarih bilgisi girilir.
           And   Submit a tour request butonu tıklanır.
           And   Manager'ın randevu oluşturamadığı doğrulanır.
           And   Sayfa Kapatılır.
