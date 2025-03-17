package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC12Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();


    @And("Enters the ten digits zero in the phone number field")
    public void entersTheTenDigitsZeroInThePhoneNumberField() {
        getlandEstateRegisterPage.phone.click();
        getlandEstateRegisterPage.phone.sendKeys("0000000000");
        ReusableMethods.waitForSecond(2);

    }

    @And("Click the email field")
    public void clickTheEmailField() {
        getlandEstateRegisterPage.email.click();
        ReusableMethods.takeScreenShot();
        ReusableMethods.addScreenShotToReport();

    }

    @Then("Verify that the error message invalid Phone Number is displayed")
    public void verifyThatTheErrorMessageInvalidPhoneNumberIsDisplayed() {
        Assert.assertTrue(getlandEstateRegisterPage.phoneNumberFormFeedback.isDisplayed());
    }
}
