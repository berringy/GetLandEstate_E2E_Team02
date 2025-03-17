package getland.stepdefs.ui_stepdefs.us03_stepdefs;

import getland.pages.GetandLandPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US03TC04Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());



    @When("mail kısmına yeni mail girilir")
    public void mailKısmınaYeniMailGirilir() {

        getandLandPage.emailGüncelleme.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        getandLandPage.emailGüncelleme.sendKeys("velikavlak@hotmail.com");
        getandLandPage.updateButton.click();


    }

    @Then("uptade kısmına tıklanır ve mailin değiştiği doğrulanır")
    public void uptadeKısmınaTıklanırVeMailinDeğiştiğiDoğrulanır() {

        Assert.assertEquals((ConfigReader.getProperty("updateMail")),("velikavlak@hotmail.com"));

    }
}
