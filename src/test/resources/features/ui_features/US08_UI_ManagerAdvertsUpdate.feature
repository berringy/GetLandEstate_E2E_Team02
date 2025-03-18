@UIUS08
  Feature: US08 Manager verdiği ilanları görebilmeli, güncelleyebilmeli ve silebilmeli

    Background:

            Given Sayfaya gidilir.
            When  Login linkine tıklanır.
            And   Geçerli email ve şifre ile sisteme giriş yapılır.
            And   Back to site linkine tıklanır.
            And   User logo üzerine tıklanıp menu açılır.
            And   Açılan menü üzerinden My Adverts linkine tıklanır.
            And   Manager'ın daha önceden paylaşmış olduğu ilanların görüntülendiği doğrulanır.



    @US08TC01
    Scenario: TC01 Manager İlanları görebilmeli ve güncelleyebilmelidir.

        And   İlan detaylarından güncelle butonu tıklanır.
        And   Manager açılan sayfada Update butonuna scrool yaparak Update butonuna tıklar.
        And   Manager'ın ilan güncelleyebildiği doğrulanır.
        And   Sayfa Kapatılır.


    @US08TC02
    Scenario: TC02 Manager İlanları silebilmelidir.

        And   Manager ilanı sil butonuna tıklar.
        And   İlanın silindiği doğrulanır.
        And   Sayfa Kapatılır.


    @US08TC03
    Scenario: TC03 Manager ilanları ile ilgili Date Published, Status ve View-Like-Tour bilgilerini görebilmeli

        And   İlan detaylarında Date Published, Status ve View-Like-Tour başlıklarının ve ikonlarının görüntülendiği doğrulanır.
        And   Sayfa Kapatılır.
