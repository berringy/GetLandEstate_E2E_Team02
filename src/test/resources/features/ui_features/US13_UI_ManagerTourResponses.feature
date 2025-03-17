@UIUS13
  Feature: US13 Manager randevu isteklerini kabul edebilmeli

    Background:
           Given Sayfaya gidilir.
           When  Login linkine tıklanır.
           And   Geçerli email ve şifre ile sisteme giriş yapılır.
           And   Back to site linkine tıklanır.
           And   User logo üzerine tıklanıp menu açılır.
           And   Açılan menü üzerinden MY TOUR REQUEST linkine tıklanır.
           And   Açılan sayfada bulunan MY RESPONSES sekmesine tıklanır.



    @US13TC01
    Scenario: TC01 Manager verdiği ilanlara ait randevu isteklerini görebilmelidir.

           And   Manager'ın göderilen randevu isteklerini görüntüleyebildiği doğrulanır.
           And   Sayfa Kapatılır.


    @US13TC02
    Scenario: TC02 Manager verdiği ilana ait randevu isteklerini red ve kabul edebilmeli

          And   Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu ONAY butonu tıklanır.
          And   Randevu onay doğrulama sorusunda YES butonu tıklanarak onaylanır.
          And   Manager'ın randevu isteğini kabul edebildiği doğrulanır.
          And   Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu RED butonu tıklanır.
          And   Randevu red işlemi doğrulama sorusunda YES butonu tıklanarak onaylanır.
          And   Manager'ın randevu isteğini reddedebildiği doğrulanır.
          And   Sayfa Kapatılır.




