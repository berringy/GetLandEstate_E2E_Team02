package getland.stepdefs.ui_stepdefs.us17_20;

import getland.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("Testt başlamadan önce çalıştırılıyor...");
    }

    @After
    public void tearDown(Scenario scenario)  {

        // Her durumda tarayıcıyı kapat
        Driver.closeDriver();
        System.out.println("Tarayıcı kapatıldı.");
    }
}
