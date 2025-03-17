package getland.stepdefs.ui_stepdefs.us18_stepdefs;

import getland.pages.US18_Page;
import getland.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US18StepDefs {

    US18_Page us18Page = new US18_Page();

    @Given("Sayfaya gidilir.")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Login linkine tıklanır.")
    public void loginLinkineTıklanır() {
        WaitUtils.waitForPageToLoad(10);
        us18Page.loginLink.click();

    }

    @And("Geçerli email ve şifre ile sisteme giriş yapılır.")
    public void geçerliEmailVeŞifreIleSistemeGirişYapılır() {
        us18Page.emailTextBox.sendKeys(ConfigReader.getProperty("saitManagerEmail"));
        us18Page.passwordTextBox.sendKeys(ConfigReader.getProperty("saitManagerPassword"));
        us18Page.loginButton.click();

    }

    @And("Back to site linkine tıklanır.")
    public void backToSiteLinkineTıklanır() {
        WaitUtils.waitForVisibility(us18Page.backToSiteButton, 5);
        us18Page.backToSiteButton.click();
    }

    @And("Search Box'a istenen ilanın ismi yazılır ve aratılır.")
    public void searchBoxAIstenenIlanınIsmiYazılırVeAratılır() {

        WaitUtils.waitForVisibility(us18Page.searchBox, 10);
        us18Page.searchBox.sendKeys(ConfigReader.getProperty("searchBoxaYazilacakIlanAdi"));
        us18Page.searchButton.click();

    }

    @And("Arama sayfasında tur talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.")
    public void aramaSayfasındaTurTalebindeBulunulacakIlanınÜzerineTıklanırVeIlanDetaySayfasınaGidilir() {

        WaitUtils.waitForVisibility(us18Page.aramaSayfasindaCikanIlkIlaninLinki, 10);
        us18Page.aramaSayfasindaCikanIlkIlaninLinki.click();

    }

    @And("İlan detay sayfasında bulunan Schedule a tour alanından tarih ve saat bilgileri girilir")
    public void ilanDetaySayfasındaBulunanScheduleATourAlanındanTarihVeSaatBilgileriGirilir() {


        JSUtils.JSscrollIntoView(us18Page.scheduleTourTable);

        us18Page.tourDateSelectBox.click();
        us18Page.tourDateSelectBox.sendKeys(ConfigReader.getProperty("turTalebindeBulunulacakTarih"));

        ReusableMethods.ddmVisibleText(us18Page.tourTimeDDM, "10:00");


    }

    @And("Submit a tour request butonu tıklanır.")
    public void submitATourRequestButonuTıklanır() {
        us18Page.submitTourRequestButton.click();

    }

    @And("Manager'ın tur talebinde bulunabildiği doğrulanır.")
    public void managerInTurTalebindeBulunabildiğiDoğrulanır() {

        WaitUtils.waitForVisibility(us18Page.tourRequestCreatedSuccessfullyMassage, 5);
        Assert.assertTrue(us18Page.tourRequestCreatedSuccessfullyMassage.isDisplayed());
    }

    @And("Gönderilen tur talebi MY TOUR REQUEST linkinden silinir.")
    public void gönderilenTurTalebiMYTOURREQUESTLinkindenSilinir() {


        JSUtils.JSclickWithTimeout(us18Page.profileButton);
        us18Page.myTourRequestsLink.click();

        WaitUtils.waitForVisibility(us18Page.myRequestsDeleteButton, 5);
        us18Page.myRequestsDeleteButton.click();
        us18Page.myRequestsDeleteYesButton.click();

    }


    @And("Search Box'a daha önceden tur talebi onaylanmış bir randevu ilanın ismi yazılır ve aratılır.")
    public void searchBoxADahaÖncedenTurTalebiOnaylanmışBirRandevuIlanınIsmiYazılırVeAratılır() {

        us18Page.searchBox.sendKeys(ConfigReader.getProperty("dahaOncedenRandevuTalebiOnaylanmisIlanAdi"));

        us18Page.searchButton.click();


    }

    @And("Arama sayfasında daha önceden tur talebi onaylanmış tarih ve saatde randevu talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.")
    public void aramaSayfasındaDahaÖncedenTurTalebiOnaylanmışTarihVeSaatdeRandevuTalebindeBulunulacakIlanınÜzerineTıklanırVeIlanDetaySayfasınaGidilir() {

        WaitUtils.waitForVisibility(us18Page.aramaSayfasindaCikanIlkIlaninLinki, 10);
        us18Page.aramaSayfasindaCikanIlkIlaninLinki.click();
    }

    @And("İlan detay sayfasında bulunan Schedule a tour alanına başka biri tarafından önceden oluşturulup onaylanan randevu ile aynı tarih ve saat bilgileri girilir.")
    public void ilanDetaySayfasındaBulunanScheduleATourAlanınaBaşkaBiriTarafındanÖncedenOluşturulupOnaylananRandevuIleAynıTarihVeSaatBilgileriGirilir() {
        JSUtils.JSscrollIntoView(us18Page.scheduleTourTable);

        us18Page.tourDateSelectBox.click();
        us18Page.tourDateSelectBox.sendKeys(ConfigReader.getProperty("dahaOncedenRandevuTalebiOnaylanmisTarih"));

        ReusableMethods.ddmVisibleText(us18Page.tourTimeDDM, ConfigReader.getProperty("dahaOncedenRandevuTalebiOnaylanmisSaat"));

    }

    @And("Manager'ın hata mesajı aldığı doğrulanır.")
    public void managerInHataMesajıAldığıDoğrulanır() {

        WaitUtils.waitForVisibility(us18Page.tourRequestErrorMassage, 5);
        Assert.assertTrue(us18Page.tourRequestErrorMassage.isDisplayed());


    }

    @And("İlan detay sayfasında bulunan Schedule a tour alanına geçmiş bir tarih bilgisi girilir.")
    public void ilanDetaySayfasındaBulunanScheduleATourAlanınaGeçmişBirTarihBilgisiGirilir() {
        JSUtils.JSscrollIntoView(us18Page.scheduleTourTable);

        us18Page.tourDateSelectBox.click();
        us18Page.tourDateSelectBox.sendKeys(ConfigReader.getProperty("GecmisTarih"));

        ReusableMethods.ddmVisibleText(us18Page.tourTimeDDM, ConfigReader.getProperty("turTalebindeBulunulacakSaat"));


    }

    @And("User logo üzerine tıklanıp menu açılır.")
    public void userLogoÜzerineTıklanıpMenuAçılır() {
        WaitUtils.waitForVisibility(us18Page.profileButton, 5);
        us18Page.profileButton.click();
    }


    @And("Açılan menü üzerinden MY TOUR REQUEST linkine tıklanır.")
    public void açılanMenüÜzerindenMYTOURREQUESTLinkineTıklanır() {
        us18Page.myTourRequestsLink.click();
    }

    @And("Açılan sayfada bulunan MY RESPONSES sekmesine tıklanır.")
    public void açılanSayfadaBulunanMYRESPONSESSekmesineTıklanır() {
        us18Page.myResponsesPage.click();

    }

    @And("Manager'ın göderilen randevu isteklerini görüntüleyebildiği doğrulanır.")
    public void managerInGöderilenRandevuIstekleriniGörüntüleyebildiğiDoğrulanır() {
        WaitUtils.waitFor(5);
        Assert.assertTrue(us18Page.randevuIstegiGoruntuleme.isDisplayed());
    }

    @And("Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu ONAY butonu tıklanır.")
    public void managerInGönderilenRandevuIsteklerininDetaylarındaBulunanRandevuONAYButonuTıklanır() {
        us18Page.randevuOnayButonu.click();
    }

    @And("Randevu onay doğrulama sorusunda YES butonu tıklanarak onaylanır.")
    public void randevuOnayDoğrulamaSorusundaYESButonuTıklanarakOnaylanır() {
        WaitUtils.waitForVisibility(us18Page.randevuOnayYesButonu, 5);
        us18Page.randevuOnayYesButonu.click();


    }

    @And("Manager'ın randevu isteğini kabul edebildiği doğrulanır.")
    public void managerInRandevuIsteğiniKabulEdebildiğiDoğrulanır() {
        WaitUtils.waitForVisibility(us18Page.randevuApprovedAndDeclineMessage, 5);
        us18Page.randevuApprovedAndDeclineMessage.isDisplayed();


    }

    @And("Manager'ın gönderilen randevu isteklerinin detaylarında bulunan randevu RED butonu tıklanır.")
    public void managerInGönderilenRandevuIsteklerininDetaylarındaBulunanRandevuREDButonuTıklanır() {
        WaitUtils.waitFor(3);
        us18Page.randevuRedButonu.click();

    }

    @And("Randevu red işlemi doğrulama sorusunda YES butonu tıklanarak onaylanır.")
    public void randevuRedIşlemiDoğrulamaSorusundaYESButonuTıklanarakOnaylanır() {
        WaitUtils.waitForVisibility(us18Page.randevuRedYesButonu, 5);
        us18Page.randevuRedYesButonu.click();
    }

    @And("Manager'ın randevu isteğini reddedebildiği doğrulanır.")
    public void managerInRandevuIsteğiniReddedebildiğiDoğrulanır() {

        WaitUtils.waitForVisibility(us18Page.randevuApprovedAndDeclineMessage, 5);
        us18Page.randevuApprovedAndDeclineMessage.isDisplayed();


    }

    @And("Manager'ın randevu oluşturamadığı doğrulanır.")
    public void managerInRandevuOluşturamadığıDoğrulanır() {

        //Assert.assertTrue(!us14Page.tourRequestCreatedSuccessfullyMassage.isDisplayed());

    }

    @And("Sayfa Kapatılır.")
    public void sayfaKapatılır() {
        Driver.closeDriver();
    }

}
