package getland.stepdefs.ui_stepdefs.us21_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import getland.pages.US21_AdminContactMessagesDisplayPage;
import getland.utilities.*;

public class US21TC01StepDefs {

    US21_AdminContactMessagesDisplayPage messageDisplayPage = new US21_AdminContactMessagesDisplayPage();

    @Given("User is on the homepage")
    public void userIsOnTheHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("getlandUrl"));
        messageDisplayPage.languageButton.click();
        messageDisplayPage.turkishButton.click();
    }

    @When("User clicks on the -Giris Yap- link")
    public void userClicksOnTheGirisYapLink() {
        messageDisplayPage.loginButton.click();
        Assert.assertTrue("Linke tıklanamıyor!", messageDisplayPage.loginButton.isDisplayed());
    }

    @And("User enters a valid email in the Email field")
    public void userEntersAValidEmailInTheEmailField() {
        messageDisplayPage.emailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        Assert.assertTrue("Email alanı aktif değil!", messageDisplayPage.emailField.isEnabled());
    }

    @And("User enters a valid password in the Sifre field")
    public void userEntersAValidPasswordInTheSifreField() {
        messageDisplayPage.passwordField.sendKeys(ConfigReader.getProperty("adminPassword"));
        Assert.assertTrue("Sifre alanı aktif değil!", messageDisplayPage.passwordField.isEnabled());
    }

    @And("User clicks on the -GIRIS- button")
    public void userClicksOnTheGIRISButton() {
        Assert.assertTrue("Gönder butonu aktif değil!", messageDisplayPage.submitButton.isEnabled());
        messageDisplayPage.submitButton.click();
    }

    @And("User clicks on the -iletisim Mesajlari- link")
    public void userClicksOnTheIletisimMesajlariLink() {
        messageDisplayPage.contactMessagesLink.click();
        Assert.assertTrue("İletişim Mesajları linki aktif değil!", messageDisplayPage.contactMessagesLink.isEnabled());
    }

    @Then("User should see the list of received messages")
    public void userShouldSeeTheListOfReceivedMessages() {
        Assert.assertTrue("Mesajlar görüntülenemiyor!", messageDisplayPage.messageItemArea.isDisplayed());
    }

    @And("User clicks on the message")
    public void userClicksOnTheMessage() {

        messageDisplayPage.messageItem.click();
        Assert.assertTrue("Mesaj Yok!", messageDisplayPage.messageItem.isDisplayed());
        WaitUtils.waitForVisibility(messageDisplayPage.messageContent, 10);
    }
}
