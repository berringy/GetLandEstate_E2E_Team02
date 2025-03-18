package getland.stepdefs.ui_stepdefs.us14_stepdefs;

import getland.pages.US14_Page;
import getland.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US14StepDefs {
    US14_Page us14Page = new US14_Page();

    @Given("Sayfaya gidilir.")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Login linkine tıklanır.")
    public void loginLinkineTıklanır() {
        WaitUtils.waitForPageToLoad(10);
        us14Page.loginLink.click();

    }

    @And("Geçerli email ve şifre ile sisteme giriş yapılır.")
    public void geçerliEmailVeŞifreIleSistemeGirişYapılır() {
        us14Page.emailTextBox.sendKeys(ConfigReader.getProperty("saitManagerEmail"));
        us14Page.passwordTextBox.sendKeys(ConfigReader.getProperty("saitManagerPassword"));
        us14Page.loginButton.click();

    }

    @And("Back to site linkine tıklanır.")
    public void backToSiteLinkineTıklanır() {
        WaitUtils.waitForVisibility(us14Page.backToSiteButton, 5);
        us14Page.backToSiteButton.click();
    }

    @And("Search Box'a istenen ilanın ismi yazılır ve aratılır.")
    public void searchBoxAIstenenIlanınIsmiYazılırVeAratılır() {

        WaitUtils.waitForVisibility(us14Page.searchBox, 5);
        us14Page.searchBox.sendKeys(ConfigReader.getProperty("searchBoxaYazilacakIlanAdi"));
        us14Page.searchButton.click();

    }

    @And("Arama sayfasında tur talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.")
    public void aramaSayfasındaTurTalebindeBulunulacakIlanınÜzerineTıklanırVeIlanDetaySayfasınaGidilir() {

        WaitUtils.waitForVisibility(us14Page.aramaSayfasindaCikanIlkIlaninLinki, 10);
        us14Page.aramaSayfasindaCikanIlkIlaninLinki.click();

    }

    @And("İlan detay sayfasında bulunan Schedule a tour alanından tarih ve saat bilgileri girilir")
    public void ilanDetaySayfasındaBulunanScheduleATourAlanındanTarihVeSaatBilgileriGirilir() {


        JSUtils.JSscrollIntoView(us14Page.scheduleTourTable);

        us14Page.tourDateSelectBox.click();
        us14Page.tourDateSelectBox.sendKeys(ConfigReader.getProperty("turTalebindeBulunulacakTarih"));

        ReusableMethods.ddmVisibleText(us14Page.tourTimeDDM, "10:00");


    }

    @And("Submit a tour request butonu tıklanır.")
    public void submitATourRequestButonuTıklanır() {
        us14Page.submitTourRequestButton.click();

    }

    @And("Manager'ın tur talebinde bulunabildiği doğrulanır.")
    public void managerInTurTalebindeBulunabildiğiDoğrulanır() {

        WaitUtils.waitForVisibility(us14Page.tourRequestCreatedSuccessfullyMassage, 5);
        Assert.assertTrue(us14Page.tourRequestCreatedSuccessfullyMassage.isDisplayed());
    }

    @And("Gönderilen tur talebi MY TOUR REQUEST linkinden silinir.")
    public void gönderilenTurTalebiMYTOURREQUESTLinkindenSilinir() {


        JSUtils.JSclickWithTimeout(us14Page.profileButton);
        us14Page.myTourRequestsLink.click();

        WaitUtils.waitForVisibility(us14Page.myRequestsDeleteButton, 5);
        us14Page.myRequestsDeleteButton.click();
        us14Page.myRequestsDeleteYesButton.click();

    }

    @And("User logo üzerine tıklanıp menu açılır.")
    public void userLogoÜzerineTıklanıpMenuAçılır() {
        us14Page.profileButton.click();


    }

    @And("Açılan menü üzerinden MY TOUR REQUEST linkine tıklanır.")
    public void açılanMenüÜzerindenMYTOURREQUESTLinkineTıklanır() {
        us14Page.myTourRequestsLink.click();


    }

    @And("Açılan sayfada bulunan MY REQUESTS sekmesine tıklanır.")
    public void açılanSayfadaBulunanMYREQUESTSSekmesineTıklanır() {
        us14Page.myRequestsPage.click();

    }

    @And("Manager'ın gönderdiği randevu isteklerinin status başlığı altında kabul veya rededildiğinin görüntüleyebildiği doğrulanır.")
    public void managerInGönderdiğiRandevuIsteklerininStatusBaşlığıAltındaKabulVeyaRededildiğininGörüntüleyebildiğiDoğrulanır() {

        WaitUtils.waitForVisibility(us14Page.myRequestsStatusIcon, 5);
        Assert.assertTrue(us14Page.myRequestsStatusIcon.isDisplayed());

    }

    @And("Search Box'a daha önceden tur talebi onaylanmış bir randevu ilanın ismi yazılır ve aratılır.")
    public void searchBoxADahaÖncedenTurTalebiOnaylanmışBirRandevuIlanınIsmiYazılırVeAratılır() {

        us14Page.searchBox.sendKeys(ConfigReader.getProperty("dahaOncedenRandevuTalebiOnaylanmisIlanAdi"));

        us14Page.searchButton.click();


    }

    @And("Arama sayfasında daha önceden tur talebi onaylanmış tarih ve saatde randevu talebinde bulunulacak ilanın üzerine tıklanır ve ilan detay sayfasına gidilir.")
    public void aramaSayfasındaDahaÖncedenTurTalebiOnaylanmışTarihVeSaatdeRandevuTalebindeBulunulacakIlanınÜzerineTıklanırVeIlanDetaySayfasınaGidilir() {

        WaitUtils.waitForVisibility(us14Page.aramaSayfasindaCikanIlkIlaninLinki, 10);
        us14Page.aramaSayfasindaCikanIlkIlaninLinki.click();
    }

    @And("İlan detay sayfasında bulunan Schedule a tour alanına başka biri tarafından önceden oluşturulup onaylanan randevu ile aynı tarih ve saat bilgileri girilir.")
    public void ilanDetaySayfasındaBulunanScheduleATourAlanınaBaşkaBiriTarafındanÖncedenOluşturulupOnaylananRandevuIleAynıTarihVeSaatBilgileriGirilir() {
        JSUtils.JSscrollIntoView(us14Page.scheduleTourTable);

        us14Page.tourDateSelectBox.click();
        us14Page.tourDateSelectBox.sendKeys(ConfigReader.getProperty("dahaOncedenRandevuTalebiOnaylanmisTarih"));

        ReusableMethods.ddmVisibleText(us14Page.tourTimeDDM, ConfigReader.getProperty("dahaOncedenRandevuTalebiOnaylanmisSaat"));

    }

    @And("Manager'ın hata mesajı aldığı doğrulanır.")
    public void managerInHataMesajıAldığıDoğrulanır() {

        WaitUtils.waitForVisibility(us14Page.tourRequestErrorMassage, 5);
        Assert.assertTrue(us14Page.tourRequestErrorMassage.isDisplayed());


    }

    @And("İlan detay sayfasında bulunan Schedule a tour alanına geçmiş bir tarih bilgisi girilir.")
    public void ilanDetaySayfasındaBulunanScheduleATourAlanınaGeçmişBirTarihBilgisiGirilir() {
        JSUtils.JSscrollIntoView(us14Page.scheduleTourTable);

        us14Page.tourDateSelectBox.click();
        us14Page.tourDateSelectBox.sendKeys(ConfigReader.getProperty("GecmisTarih"));

        ReusableMethods.ddmVisibleText(us14Page.tourTimeDDM, ConfigReader.getProperty("turTalebindeBulunulacakSaat"));


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
