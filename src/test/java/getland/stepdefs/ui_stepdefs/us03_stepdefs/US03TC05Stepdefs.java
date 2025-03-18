package getland.stepdefs.ui_stepdefs.us03_stepdefs;

import getland.pages.GetandLandPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US03TC05Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());


    @When("change password sekmesine tıklanır")
    public void changePasswordSekmesineTıklanır() {


        getandLandPage.changePassword.click();
    }


    @And("şu anki password girilir")
    public void şuAnkiPasswordGirilir() {


        getandLandPage.currentpassword.sendKeys(ConfigReader.getProperty("customerPassword"));

    }

    @And("yeni password girilir")
    public void yeniPasswordGirilir() {

        getandLandPage.newpassword.sendKeys(ConfigReader.getProperty("customerYeniPassword"));

    }

    @And("yeni password doğrulanır")
    public void yeniPasswordDoğrulanır() {

        getandLandPage.confirmpassword.sendKeys(ConfigReader.getProperty("customerYeniPassword"));

    }

    @And("change butonuna basılır")
    public void changeButonunaBasılır() throws InterruptedException {

        getandLandPage.changebutton.click();
        Thread.sleep(20);
        wait.until(ExpectedConditions.visibilityOf(getandLandPage.anasayfaloginButonu));

    }

    @Then("şifrenin değiştiği doğrulanır")
    public void şifreninDeğiştiğiDoğrulanır() {

        Assert.assertTrue(getandLandPage.anasayfaloginButonu.isDisplayed());
        //getandLandPage.email.sendKeys(ConfigReader.getProperty("customerEmail"));
        //getandLandPage.password.sendKeys(ConfigReader.getProperty("customerYeniPassword"));


    }
}
