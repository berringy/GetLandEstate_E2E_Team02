package getland.stepdefs.ui_stepdefs.us13_stepdefs;

import getland.pages.US13_Page;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13StepDefs {


    US13_Page us13Page = new US13_Page();

    @Given("Sayfaya gidilir.")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Login linkine tıklanır.")
    public void loginLinkineTıklanır() {
        WaitUtils.waitForPageToLoad(10);
        us13Page.loginLink.click();

    }

    @And("Geçerli email ve şifre ile sisteme giriş yapılır.")
    public void geçerliEmailVeŞifreIleSistemeGirişYapılır() {
        us13Page.emailTextBox.sendKeys(ConfigReader.getProperty("saitManagerEmail"));
        us13Page.passwordTextBox.sendKeys(ConfigReader.getProperty("saitManagerPassword"));
        us13Page.loginButton.click();

    }

    @And("Back to site linkine tıklanır.")
    public void backToSiteLinkineTıklanır() {
        WaitUtils.waitForVisibility(us13Page.backToSiteButton, 5);
        us13Page.backToSiteButton.click();
    }

    @And("User logo üzerine tıklanıp menu açılır.")
    public void userLogoÜzerineTıklanıpMenuAçılır() {
        WaitUtils.waitForVisibility(us13Page.profileButton, 5);
        us13Page.profileButton.click();
    }


    @And("Açılan menü üzerinden MY TOUR REQUEST linkine tıklanır.")
    public void açılanMenüÜzerindenMYTOURREQUESTLinkineTıklanır() {
        us13Page.myTourRequestsLink.click();
    }

    @And("Açılan sayfada bulunan MY RESPONSES sekmesine tıklanır.")
    public void açılanSayfadaBulunanMYRESPONSESSekmesineTıklanır() {
        us13Page.myResponsesPage.click();

    }

    @And("Manager'ın göderilen randevu isteklerini görüntüleyebildiği doğrulanır.")
    public void managerInGöderilenRandevuIstekleriniGörüntüleyebildiğiDoğrulanır() {
        WaitUtils.waitForVisibility(us13Page.randevuIstegiGoruntuleme, 5);
        Assert.assertTrue(us13Page.randevuIstegiGoruntuleme.isDisplayed());
    }

    @And("Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu ONAY butonu tıklanır.")
    public void managerInGönderilenRandevuIsteklerininDetaylarındaBulunanRandevuONAYButonuTıklanır() {
        us13Page.randevuOnayButonu.click();
    }

    @And("Randevu onay doğrulama sorusunda YES butonu tıklanarak onaylanır.")
    public void randevuOnayDoğrulamaSorusundaYESButonuTıklanarakOnaylanır() {
        WaitUtils.waitForVisibility(us13Page.randevuOnayYesButonu, 5);
        us13Page.randevuOnayYesButonu.click();


    }

    @And("Manager'ın randevu isteğini kabul edebildiği doğrulanır.")
    public void managerInRandevuIsteğiniKabulEdebildiğiDoğrulanır() {
        WaitUtils.waitForVisibility(us13Page.randevuApprovedAndDeclineMessage, 5);
        us13Page.randevuApprovedAndDeclineMessage.isDisplayed();


    }

    @And("Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu RED butonu tıklanır.")
    public void managerInGönderilenRandevuIsteklerininDetaylarındaBulunanRandevuREDButonuTıklanır() {
        WaitUtils.waitFor(3);
        us13Page.randevuRedButonu.click();

    }

    @And("Randevu red işlemi doğrulama sorusunda YES butonu tıklanarak onaylanır.")
    public void randevuRedIşlemiDoğrulamaSorusundaYESButonuTıklanarakOnaylanır() {
        WaitUtils.waitForVisibility(us13Page.randevuRedYesButonu, 5);
        us13Page.randevuRedYesButonu.click();
    }

    @And("Manager'ın randevu isteğini reddedebildiği doğrulanır.")
    public void managerInRandevuIsteğiniReddedebildiğiDoğrulanır() {

        WaitUtils.waitForVisibility(us13Page.randevuApprovedAndDeclineMessage, 5);
        us13Page.randevuApprovedAndDeclineMessage.isDisplayed();


    }

    @And("Sayfa Kapatılır.")
    public void sayfaKapatılır() {
        Driver.closeDriver();
    }
}
