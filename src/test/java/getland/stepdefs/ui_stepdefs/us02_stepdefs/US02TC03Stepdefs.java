package getland.stepdefs.ui_stepdefs.us02_stepdefs;

import getland.pages.GetandLandPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US02TC03Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());

    @And("password alanı boş bırakılır")
    public void passwordAlanıBoşBırakılır() {
        getandLandPage.password.sendKeys("");

    }

    @And("login butonuna işlevsiz olduğu doğrulanır")
    public void loginButonunaIşlevsizOlduğuDoğrulanır() {

        Assert.assertTrue(!getandLandPage.loginButonu.isEnabled());

    }
}
