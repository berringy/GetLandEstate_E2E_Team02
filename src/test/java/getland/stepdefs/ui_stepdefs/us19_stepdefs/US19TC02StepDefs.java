package getland.stepdefs.ui_stepdefs.us19_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import getland.pages.US19_ContactFormPage;
import getland.utilities.*;


public class US19TC02StepDefs {

    US19_ContactFormPage contactFormPage = new US19_ContactFormPage();

    @When("User leaves the First Name field empty")
    public void user_leaves_the_first_name_field_empty() {
        ActionsUtils.dragAndDropBy(contactFormPage.sendButton, 350, 10);
        contactFormPage.firstNameField.click();
        contactFormPage.lastNameField.click();
        Assert.assertTrue("Ad alanı boş değil.", contactFormPage.firstNameField.getText().isEmpty());
        Assert.assertTrue(contactFormPage.feedbackFirstName.getText().contains("zorunludur"));
    }

    @When("User leaves the Last Name field empty")
    public void user_leaves_the_last_name_field_empty() {
        contactFormPage.emailField.click();
        contactFormPage.lastNameField.click();
        Assert.assertTrue("Soyad alanı boş değil.", contactFormPage.lastNameField.getText().isEmpty());
        Assert.assertTrue(contactFormPage.feedbackLastName.getText().contains("zorunludur"));
    }

    @When("User leaves the Email field empty")
    public void user_leaves_the_email_field_empty() {
        contactFormPage.emailField.click();
        contactFormPage.messageField.click();
        Assert.assertTrue("Email alanı boş değil.", contactFormPage.emailField.getText().isEmpty());
        Assert.assertTrue(contactFormPage.feedbackEmail.getText().contains("zorunludur"));
    }

    @When("User leaves the Message field empty")
    public void user_leaves_the_message_field_empty() {
        contactFormPage.emailField.click();
        contactFormPage.messageField.click();
        Assert.assertTrue("Mesaj alanı boş değil.", contactFormPage.messageField.getText().isEmpty());
        Assert.assertTrue(contactFormPage.feedbackMessageField.getText().contains("zorunludur"));
    }

    @Then("User should see that the Send button is disabled")
    public void user_should_see_that_the_send_button_is_disabled() {
        ReusableMethods.waitForSecond(1);
        Assert.assertFalse("Gönder butonu aktif.", contactFormPage.sendButton.isEnabled());
        ReusableMethods.waitForSecond(1);
    }



} //Driver.getDriver().quit();