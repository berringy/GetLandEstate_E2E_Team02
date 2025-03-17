package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC11Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();



    @And("Enters the spaces in the last name field")
    public void entersTheSpacesInTheLastNameField() {
        getlandEstateRegisterPage.lastName.sendKeys(" ");
        ReusableMethods.waitForSecond(2);

    }

    @And("Click the first name field")
    public void clickThePhoneNumberField() {
        getlandEstateRegisterPage.firstName.click();
        ReusableMethods.waitForSecond(2);
        ReusableMethods.takeScreenShot();
        ReusableMethods.addScreenShotToReport();
    }

    @Then("Verify that the error message Last Name is required is displayed")
    public void verifyThatTheErrorMessageLastNameIsRequiredIsDisplayed() {
        Assert.assertTrue(getlandEstateRegisterPage.lastNameFormFeedback.isDisplayed());
    }


}
