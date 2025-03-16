package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC05Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();

    @And("Enters a password shorter than eight characters")
    public void entersAPasswordShorterThanCharacters() {
        getlandEstateRegisterPage.password.sendKeys(ConfigReader.getProperty("sevendigitsPassword"));

    }

    @And("Click confirm password field")
    public void clickConfirmPasswordField() {
        getlandEstateRegisterPage.confirmPassword.click();
    }


    @Then("Verify that the error message At least eight characters is displayed")
    public void verifyThatTheErrorMessageAtLeastEightCharactersIsDisplayed() {
        Assert.assertEquals("At least 8 characters", getlandEstateRegisterPage.passwordFormFeedback.getText());

    }
}
