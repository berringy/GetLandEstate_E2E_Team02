package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US01TC06Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();

    @And("Enter a password of eight characters, seven digits and one capital letter")
    public void enterAPasswordOfEightCharactersSevenDigitsAndOneCapitalLetter() {
        getlandEstateRegisterPage.password.sendKeys(ConfigReader.getProperty("digitsACapitalPassword"));
    }

    @Then("Verify that the error message One lowercase char is displayed")
    public void verifyThatTheErrorMessageOneLowercaseCharIsDisplayed() {
        Assert.assertEquals("One lowercase char", getlandEstateRegisterPage.passwordFormFeedback.getText());
    }
}
