package getland.stepdefs.ui_stepdefs.us19_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import getland.pages.US19_ContactFormPage;
import getland.utilities.*;

import java.util.regex.Pattern;

public class US19TC04StepDefs {

    US19_ContactFormPage contactFormPage = new US19_ContactFormPage();

    @When("User enters invalid {string} in the First Name field")
    public void userEntersInvalidInTheFirstNameField(String firstname) {
        WaitUtils.waitForVisibility(contactFormPage.iframeField, 50);
        ReusableMethods.waitForSecond(1);
        ReusableMethods.scroll(contactFormPage.sendButton);

        contactFormPage.firstNameField.sendKeys(firstname);
        contactFormPage.lastNameField.click();

        //Assert.assertTrue("GEÇERSİZ KARAKTER girildiğinde uyarı mesajı vermedi!",contactFormPage.feedbackFirstName.getText().contains("Geçersiz"));

    }

    @And("User enters invalid {string} in the Last Name field")
    public void userEntersInvalidInTheLastNameField(String lastname) {
        contactFormPage.lastNameField.sendKeys(lastname);
        contactFormPage.emailField.click();
        //Assert.assertTrue(contactFormPage.feedbackLastName.getText().contains("Geçersiz"));
    }

    @And("User enters invalid {string} in the Email field")
    public void userEntersInvalidInTheEmailField(String email) {
        contactFormPage.emailField.sendKeys(email);
        contactFormPage.messageField.click();
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isValidEmail = Pattern.compile(emailRegex).matcher(email).matches();
        //Assert.assertTrue("Invalid email format: " + email, isValidEmail);
        //Assert.assertTrue(contactFormPage.feedbackEmail.getText().contains("Geçersiz"));
    }

    @And("User enters invalid {string} in the Message field")
    public void userEntersInvalidInTheMessageField(String message) {
        contactFormPage.messageField.sendKeys(message);
        contactFormPage.emailField.click();
        WaitUtils.waitFor(1);
        ReusableMethods.takeScreenShot();
        Assert.assertTrue(contactFormPage.feedbackMessageField.getText().contains("Geçersiz"));
    }

} //Driver.getDriver().quit();