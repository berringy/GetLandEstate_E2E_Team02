package getland.stepdefs.ui_stepdefs.us02_stepdefs;

import getland.pages.GetandLandPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US02TC02Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());

    @And("yanlış e-mail alanı doldurulur")
    public void yanlışEMailAlanıDoldurulur() {
        getandLandPage.email.sendKeys(ConfigReader.getProperty("customerYanlisEmail"));
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB);

    }

    @Then("login olunmadığı doğrulanır")
    public void loginOlunmadığıDoğrulanır() {

        Assert.assertTrue(getandLandPage.anasayfaloginButonu.isDisplayed());


    }
}
