package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC10Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();


    @And("Enters the spaces in the first name field")
    public void entersTheSpacesInTheFirstNameField() {
        getlandEstateRegisterPage.firstName.sendKeys(" ");

            ReusableMethods.waitForSecond(2);

    }

    @And("Click the last name field")
    public void clickTheLastNameField()  {
        getlandEstateRegisterPage.lastName.click();
        ReusableMethods.takeScreenShot();
        ReusableMethods.addScreenShotToReport();

    }

    @Then("Verify that the error message First Name is required is displayed")
    public void verifyThatTheErrorMessageFirstNameIsRequiredIsDisplayed() {
      Assert.assertTrue(getlandEstateRegisterPage.firstNameFormFeedback.isDisplayed());
    }
}
