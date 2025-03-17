package getland.stepdefs.ui_stepdefs.us02_stepdefs;

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

public class US02TC01Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());


    @Given("kullanici getlandestate anasayfasina gider")
    public void kullaniciGetlandestateAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("login sayfasına gidilir")
    public void loginSayfasınaGidilir() {
        getandLandPage.anasayfaloginButonu.click();
        
    }

    @And("e-mail alanı doldurulur")
    public void eMailAlanıDoldurulur() {
        getandLandPage.email.sendKeys(ConfigReader.getProperty("customerEmail"));



    }

    @And("password alanı doldurulur")
    public void passwordAlanıDoldurulur() {
        getandLandPage.password.sendKeys(ConfigReader.getProperty("customerPassword"));
    }

    @And("login butonuna basılır")
    public void loginButonunaBasılır() {
        getandLandPage.loginButonu.click();
        
    }

    @Then("getlandstate home sayfası geldiği doğrulanır")
    public void getlandstateHomeSayfasıGeldiğiDoğrulanır() {
        Assert.assertTrue(getandLandPage.anasayfaLogo.isDisplayed());
    }

    @And("kullanıcı çıkış yapar")
    public void kullanıcıÇıkışYapar() {

        getandLandPage.anasayfaLogo.click();
        getandLandPage.logoutbutonu.click();
        getandLandPage.logoutyesbutonu.click();
        wait.until(ExpectedConditions.visibilityOf(getandLandPage.anasayfaloginButonu));
    }
}
