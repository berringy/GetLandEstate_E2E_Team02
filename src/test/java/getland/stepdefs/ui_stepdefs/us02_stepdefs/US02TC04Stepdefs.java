package getland.stepdefs.ui_stepdefs.us02_stepdefs;

import getland.pages.GetandLandPage;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US02TC04Stepdefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    GetandLandPage getandLandPage = new GetandLandPage();
    Actions action = new Actions(Driver.getDriver());

    @Then("e-mail alanı boş bırakılır")
    public void eMailAlanıBoşBırakılır() {

        getandLandPage.email.sendKeys("");



    }
}
