package getland.stepdefs.ui_stepdefs.us19_stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import getland.pages.US19_ContactFormPage;
import getland.utilities.*;

import java.util.regex.Pattern;

public class US19TC03StepDefs {

    US19_ContactFormPage contactFormPage = new US19_ContactFormPage();

    @When("User enters {string} in the First Name field")
    public void userEntersInTheFirstNameField(String firstName) {

        ReusableMethods.waitForSecond(1);
        ReusableMethods.scroll(contactFormPage.sendButton);
        contactFormPage.firstNameField.sendKeys(firstName);
        contactFormPage.lastNameField.click();
        Assert.assertTrue("Ad alanı 2 karakterden az olmamalı!", firstName.length() < 2);
        Assert.assertTrue(contactFormPage.feedbackFirstName.getText().contains("En az 2"));
    }

    @And("User enters {string} in the Last Name field")
    public void userEntersInTheLastNameField(String lastName) {
        contactFormPage.lastNameField.sendKeys(lastName);
        contactFormPage.emailField.click();
        Assert.assertTrue("Soyad alanı 2 karakterden az olmamalı!", lastName.length() < 2);
        Assert.assertTrue(contactFormPage.feedbackLastName.getText().contains("En az 2"));
    }

    @And("User enters {string} in the Email field")
    public void userEntersInTheEmailField(String email) {
        contactFormPage.emailField.sendKeys(email);
        contactFormPage.messageField.click();
        Assert.assertTrue("Geçerli bir email giriniz!", email.length() < 2);
        Assert.assertTrue(contactFormPage.feedbackEmail.getText().contains("Geçersiz "));
    }

    @And("User enters {string} in the Message field")
    public void userEntersInTheMessageField(String message) {
        contactFormPage.messageField.sendKeys(message);
        contactFormPage.emailField.click();
        Assert.assertTrue("Mesaj alanı 2 karakterden az olmamalı!", message.length() < 2);
        Assert.assertTrue(contactFormPage.feedbackMessageField.getText().contains("En az 2"));
    }

} //Driver.getDriver().quit();