@API_US05
Feature: API User Controller Testleri

  #Post users/register
  @ApiAdmin_US05
  Scenario: TC01 | User Register Test
    Given User Register icin URL duzenlenir
    And User Register icin payload duzenlenir
    When User Register icin POST request gonderilir ve Response alinir
    Then User Register icin Status kodunun 200 oldugu dogrulanir
    And User Register icin Response body dogrulanir


  @ApiAdmin_US05
  Scenario: TC02 | Patch User Role Update Test
    Given Patch User Role Update icin URL duzenlenir
    And Patch User Role Update icin expected data duzenlenir
    When Patch User Role Update icin PATCH request duzenlenir
    Then Patch User Role Update icin Status kodunun 200 oldugu dogrulanir
    And Patch User Role Update icin Response body dogrulanir



  #Get user/userId/admin
  @ApiAdmin_US05
  Scenario: TC03 | Get User Test
    Given Admin yetkisi ile Get User icin URL duzenlenir
    And Admin yetkisi ile Get User icin expected data duzenlenir
    When Admin yetkisi ile Get User icin GET request duzenlenir
    Then Admin yetkisi ile Get User icin Status kodunun 200 oldugu dogrulanir
    And Admin yetkisi ile Get User icin Response body dogrulanir


  #Patch users/auth
  @ApiCustomer_US05
  Scenario: TC04 | Patch Users Auth Test
    Given Patch users auth icin URL duzenlenir
    When Kullanıcı bilgilerini değiştirmek için gerekli payload hazırlanır.
    Then Kullanıcı bilgilerini değiştirmek için bir PATCH request gonderilir ve Response alinir
    And Kullanıcı bilgilerini değiştirme işlemi için Status kodunun 200 oldugu dogrulanir
    And Kullanıcı bilgilerini değiştirme işlemi için Response body dogrulanir


    @ApiCustomer_US05
    Scenario: TC05 | User forgot-password Test
      Given User forgot-password icin URL duzenlenir
      When  User forgot-password icin POST request gonderilir ve response alinir
      Then  User forgot-password icin Status kodunun 200 oldugu dogrulanir


  #delete users/auth
  @ApiCustomer_US05
  Scenario: TC06 | Delete User Auth Testi
    Given Giriş yapılmış kullanıcı hesabini silmek icin URL duzenlenir
    When  Giriş yapılmış kullanıcı hesabini silmek icin DELETE request gonderilir ve response alinir
    Then  Giriş yapılmış kullanıcı hesabini silmek icin Status kodunun 200 oldugu dogrulanir






