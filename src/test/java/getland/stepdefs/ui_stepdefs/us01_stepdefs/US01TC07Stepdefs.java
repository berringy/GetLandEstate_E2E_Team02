package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC07Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();

    @And("Enter a password consisting of eight characters, six digits, one uppercase letter and one lowercase letter")
    public void enterAPasswordConsistingOfEightCharactersSixDigitsOneUppercaseLetterAndOneLowercaseLetter() {
        getlandEstateRegisterPage.password.sendKeys(ConfigReader.getProperty("digitsUpperAndLowerPassword"));
    }

    @Then("Verify that the error message One special character is displayed")
    public void verifyThatTheErrorMessageOneSpecialCharacterIsDisplayed() {
        Assert.assertEquals("One special character", getlandEstateRegisterPage.passwordFormFeedback.getText());
    }
}
