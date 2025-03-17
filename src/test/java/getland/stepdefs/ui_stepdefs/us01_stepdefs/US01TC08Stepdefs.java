package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC08Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();

    @And("Enters the different password in the confirm password field")
    public void entersTheDifferentPasswordInTheConfirmPasswordField() {
        getlandEstateRegisterPage.confirmPassword.sendKeys(ConfigReader.getProperty("customerPassword2"));

    }

    @And("Click the I understand and agree checkbox")
    public void clickTheIUnderstandAndAgreeCheckbox() {
        getlandEstateRegisterPage.termsClick.click();
    }

    @Then("Verify that the error message Passwords do not match is displayed")
    public void verifyThatTheErrorMessagePasswordsDoNotMatchIsDisplayed() {
        Assert.assertTrue (getlandEstateRegisterPage.confirmPasswordFormFeedback.isDisplayed());
    }
}
