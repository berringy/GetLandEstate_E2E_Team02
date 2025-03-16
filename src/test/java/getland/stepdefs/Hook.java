package getland.stepdefs;
<<<<<<< HEAD

=======
>>>>>>> f473797d6fea45b4d55cd56ab01a9dd9a4c09cc0

import getland.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

    @Before
    public void setUp() {
        System.out.println("Test basladı");
    }


    @After
    public void tearDown(Scenario scenario) {
        Driver.closeDriver();
        System.out.println("Test bitti");
    }



    /* @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario" + scenario.getName());
            Driver.closeDriver();
        }
    } */
}