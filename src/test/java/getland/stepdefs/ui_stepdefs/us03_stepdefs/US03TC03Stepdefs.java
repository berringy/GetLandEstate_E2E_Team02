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

public class US03TC03Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());

    @When("phonenumber kısmına yeni phonenumber girilir")
    public void phonenumberKısmınaYeniPhonenumberGirilir() {

        getandLandPage.phone.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        getandLandPage.phone.sendKeys("4567891231");
        getandLandPage.updateButton.click();


    }

    @Then("uptade kısmına tıklanır ve phonenumberın değiştiği doğrulanır")
    public void uptadeKısmınaTıklanırVePhonenumberınDeğiştiğiDoğrulanır() {

        Assert.assertEquals((ConfigReader.getProperty("uptadePhone")),("4567891236"));

    }
}
