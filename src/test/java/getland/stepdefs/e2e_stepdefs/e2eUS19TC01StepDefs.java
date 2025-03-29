package getland.stepdefs.e2e_stepdefs;

import getland.pages.US19_ContactFormPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.regex.Pattern;

public class e2eUS19TC01StepDefs {

    US19_ContactFormPage contactFormPage = new US19_ContactFormPage();

    @Given("User is on the Contact page")
    public void user_is_on_the_contact_page() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        contactFormPage.languageButton.click();
        contactFormPage.turkishButton.click();
        contactFormPage.contactButton.click();
        //driver.navigate().refresh();
        }

    @When("User enters valid {string} in the First Name field")
    public void user_enters_valid_first_name(String firstName) {
        contactFormPage.firstNameField.sendKeys(firstName);
        Assert.assertTrue("Ad alanı aktif değil", contactFormPage.firstNameField.isEnabled());
        //Assert.assertEquals("First Name input field is not accepting text!", firstName, contactFormPage.firstNameField.getDomProperty("value"));
    }

    @When("User enters valid {string} in the Last Name field")
    public void user_enters_valid_last_name(String lastName) {
        contactFormPage.lastNameField.sendKeys(lastName);
        Assert.assertTrue("Soyad alanı aktif değil.", contactFormPage.lastNameField.isEnabled());
    }

    @When("User enters valid {string} in the Email field")
    public void user_enters_valid_email(String email) {
        contactFormPage.emailField.sendKeys(email);
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isValidEmail = Pattern.compile(emailRegex).matcher(email).matches();
        Assert.assertTrue("Geçersiz email format: " + email, isValidEmail);
        Assert.assertTrue("Email alanı aktif değil..", contactFormPage.emailField.isEnabled());
    }

    @When("User enters a message {string}")
    public void user_enters_a_message(String message) {
        contactFormPage.messageField.sendKeys(message);
        Assert.assertTrue("Mesaj alanı aktif değil.", contactFormPage.messageField.isEnabled());
    }

    @When("User clicks on the Send button")
    public void user_clicks_on_the_send_button() {
        Assert.assertTrue("Gönder butonu aktif değil.", contactFormPage.sendButton.isEnabled());
        contactFormPage.sendButton.click();
    }

    @Then("User should see a confirmation message {string}")
    public void user_should_see_a_confirmation_message(String expectedMessage) {
        ReusableMethods.visibleWait(contactFormPage.confirmationMessage, 10);
        Assert.assertEquals(expectedMessage, contactFormPage.getConfirmationMessage());
        ReusableMethods.waitForSecond(1);
    }

    @And("User closes the browser")
    public void userClosesTheBrowser() {
        Driver.closeDriver();
    }
} //  Driver.getDriver().close(); ve  Driver.getDriver().quit(); ==> oturumu tamamen kapatır.
  //  Driver.closeDriver(); ==> driver’ı null yaparak yeni bir oturum başlatılmasına izin verir.