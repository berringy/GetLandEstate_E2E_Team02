package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class US01TC01StepDefs {
    public static String customerEmail = Faker.instance().internet().emailAddress();

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();

    @Given("Navigate to the {string} web site")
    public void navigateToTheWebSite(String baseUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(baseUrl));
    }

    @When("The user clicks on the register button")
    public void theUserClicksOnTheRegisterButton() {
        getlandEstateRegisterPage.registerButton.click();
    }

    @And("Enters valid first name in the first name field")
    public void entersValidFirstNameInTheFirstNameField() {
        Name name = Faker.instance().name();
        name.firstName();
        getlandEstateRegisterPage.firstName.sendKeys(name.firstName());

    }

    @And("Enters the valid  last name in the  last name field")
    public void entersTheValidLastNameInTheLastNameField() {
        Name name = Faker.instance().name();
        name.lastName();

    getlandEstateRegisterPage.lastName.sendKeys(name.lastName());

    }

    @And("Enters the valid phone number in the phone number field")
    public void entersTheValidPhoneNumberInThePhoneNumberField() {
        getlandEstateRegisterPage.phone.click();
        String number = Faker.instance().phoneNumber().phoneNumber();
        getlandEstateRegisterPage.phone.sendKeys(number);
    }

    @And("Enters the valid email in the email field")
    public void entersTheValidEmailInTheEmailField() {

       getlandEstateRegisterPage.email.sendKeys(customerEmail);
        System.out.println("customerEmail = " + customerEmail);

    }

    @And("Enters the password in the password field")
    public void entersThePasswordInThePasswordField() {
        getlandEstateRegisterPage.password.sendKeys(ConfigReader.getProperty("customerPassword"));
    }

    @And("Enters the confirm password in the confirm password field")
    public void entersTheConfirmPasswordInTheConfirmPasswordField() {
        getlandEstateRegisterPage.confirmPassword.sendKeys(ConfigReader.getProperty("customerPassword"));
        getlandEstateRegisterPage.confirmPassword.sendKeys(Keys.TAB);
    }

    @And("Click the 'I understand and agree' checkbox")
    public void clickTheIUnderstandAndAgreeCheckbox() {

     getlandEstateRegisterPage.termsClick.click();
    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        getlandEstateRegisterPage.registerSubmitButton.click();
    }

    @Then("verify that the registration is successful")
    public void verifyThatTheRegistrationIsSuccessful() {
        WaitUtils.waitForVisibility(getlandEstateRegisterPage.successMessage, 10);
        Assert.assertTrue(getlandEstateRegisterPage.successMessage.isDisplayed());

    }


    @And("closes the application")
    public void closesTheApplication() {
        Driver.closeDriver();
    }
}
