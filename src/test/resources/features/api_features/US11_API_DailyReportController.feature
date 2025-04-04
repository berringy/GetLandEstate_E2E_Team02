@API_US11
Feature:Daily Reports Controller

  @ApiAdmin_US11
  Scenario:TC01 | Daily Reports Controller

    Given Get daily reports için URL hazırlanır.
    When Daily report icin GET request düzenlenir ve response alınır.
    And Get daily reports icin Status kodunun 200 oldugu dogrulanir
