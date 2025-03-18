package getland.stepdefs.ui_stepdefs.us03_stepdefs;

import getland.pages.GetandLandPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US03TC06Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());


    @When("delete account sekmesine tıklanır")
    public void deleteAccountSekmesineTıklanır() {

        getandLandPage.deleteaccount.click();


    }

    @And("geçerli şifre girilir")
    public void geçerliŞifreGirilir() {


        getandLandPage.deleteaccountbox.sendKeys(ConfigReader.getProperty("customerYeniPassword"));

    }

    @And("delete account butonuna tıklanır")
    public void deleteAccountButonunaTıklanır() {

        getandLandPage.deleteaccountbutton.click();
        getandLandPage.yesbutton.click();
    }

    @Then("hesabın silindiği doğrulanır")
    public void hesabınSilindiğiDoğrulanır() throws InterruptedException {


        Thread.sleep(10);
        wait.until(ExpectedConditions.visibilityOf(getandLandPage.anasayfaloginButonu));
        Assert.assertTrue(getandLandPage.anasayfaloginButonu.isDisplayed());


    }

    @When("kullanıcı yeni şifre ile giriş yapar")
    public void kullanıcıYeniŞifreIleGirişYapar() {


        getandLandPage.password.sendKeys("123456789Tt!");
    }
}
