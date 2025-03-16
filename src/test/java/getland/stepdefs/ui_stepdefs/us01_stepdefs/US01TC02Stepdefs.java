package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC02Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();


    @And("Click Register Submit without entering any data")
    public void clickRegisterSubmitWithoutEnteringAnyData()  {
        getlandEstateRegisterPage.registerSubmitButton.click();


    }

    @Then("Verify that the error message is displayed for all mandatory fields")
    public void verifyThatTheErrorMessageIsDisplayedForAllMandatoryFields() {
        Assert.assertTrue(getlandEstateRegisterPage.firstNameFormFeedback.isDisplayed());
        Assert.assertTrue(getlandEstateRegisterPage.lastNameFormFeedback.isDisplayed());
        Assert.assertTrue(getlandEstateRegisterPage.phoneNumberFormFeedback.isDisplayed());
        Assert.assertTrue(getlandEstateRegisterPage.emailFormFeedback.isDisplayed());

    }

    @And("close the browser")
    public void closeTheBrowser() {
        Driver.closeDriver();
    }
}
