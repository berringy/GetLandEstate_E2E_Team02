<<<<<<< HEAD:src/test/java/getland/stepdefs/Hook.java
package getland.stepdefs;



import getland.utilities.Authentication;
import getland.utilities.ConfigReader;
=======
package getland.hooks;

import getland.utilities.Driver;
import io.cucumber.java.After;
>>>>>>> 8242723139655210ceb654ae0ba977f286329842:src/test/java/getland/stepdefs/ui_stepdefs/Hook.java
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hook {

    @Before
    public void setup() {
        System.out.println("Test başlamadan önce çalıştırılıyor...");
    }

    @After
    public void tearDown(Scenario scenario) {

        // Her durumda tarayıcıyı kapat
        Driver.closeDriver();
        System.out.println("Tarayıcı kapatıldı.");
    }
}
