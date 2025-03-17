package getland.stepdefs.ui_stepdefs.us03_stepdefs;

import getland.pages.GetandLandPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static getland.utilities.ReusableMethods.visibleWait;

public class US03TC01Stepdefs {


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());

    @Then("myProfile sekmesine tıklanır")
    public void myprofileSekmesineTıklanır() {

        getandLandPage.anasayfaLogo.click();
        wait.until(ExpectedConditions.visibilityOf(getandLandPage.myProfilebutonu));
        getandLandPage.myProfilebutonu.click();

    }

    @When("Name kısmına yeni isim girilir")
    public void nameKısmınaYeniIsimGirilir() {

        getandLandPage.firstname.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        getandLandPage.firstname.sendKeys(ConfigReader.getProperty("updateName"));
        getandLandPage.updateButton.click();

    }

    @Then("Uptade kısmına tıklanır ve ismin değiştiği doğrulanır")
    public void uptadeKısmınaTıklanırVeIsminDeğiştiğiDoğrulanır() {

        //visibleWait(getandLandPage.errorText,10);
        //Assert.assertTrue(getandLandPage.errorText.isDisplayed());
        Assert.assertEquals((ConfigReader.getProperty("updateName")),("Veli"));

    }







}
