package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ConfigReader;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC03Stepdefs {
    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @And("Enters the invalid email in the email field")
    public void entersTheInvalidEmailInTheEmailField() {
        getlandEstateRegisterPage.email.sendKeys(ConfigReader.getProperty("invalidEmail1"));
    }

    @And("Click password field")
    public void clickPasswordField() {
        getlandEstateRegisterPage.password.click();

        reusableMethods.takeScreenShot();


    }



    @Then("Verify that the error message invaild emmail is displayed")
    public void verifyThatTheErrorMessageInvaildEmmailIsDisplayed() {

       Assert.assertTrue(getlandEstateRegisterPage.emailFormFeedback.isDisplayed());


          }



}
