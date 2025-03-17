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

public class US03TC02Stepdefs {


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());

    @When("soyisim kısmına yeni soyisim girilir")
    public void soyisimKısmınaYeniSoyisimGirilir() {

        getandLandPage.lastname.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        getandLandPage.lastname.sendKeys("Kavlak");
        getandLandPage.updateButton.click();


    }

    @Then("uptade kısmına tıklanır ve soyismin değiştiği doğrulanır")
    public void uptadeKısmınaTıklanırVeSoyisminDeğiştiğiDoğrulanır() {

        //visibleWait(getandLandPage.errorText,10);
        //Assert.assertTrue(getandLandPage.errorText.isDisplayed());
        Assert.assertEquals((ConfigReader.getProperty("updateLastname")),("Kavlak"));

    }
}
