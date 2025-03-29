package getland.stepdefs.ui_stepdefs.us17_20;

import getland.pages.GetLandEstatePage;
import getland.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static getland.utilities.ReusableMethods.visibleWait;


public class US17_20_Stepdefs  {

    GetLandEstatePage getLandEstatePage = new GetLandEstatePage();


    @Given("GetLandEstate sayfasına gidilir")
    public void get_land_estate_sayfasına_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }
    @When("Manager olarak giris yapilir")
    public void manager_olarak_giris_yapilir() {
        getLandEstatePage.HomePageLoginButton.click();
        getLandEstatePage.LoginPageEmailField.sendKeys(ConfigReader.getProperty("managerEmail"));
        getLandEstatePage.LoginPagePasswordField.sendKeys(ConfigReader.getProperty("managerPassword"));
        getLandEstatePage.LoginPageLoginButton.click();
    }
    @When("Reports sayfasina gidilir")
    public void reports_sayfasina_gidilir() {
        getLandEstatePage.ReportsDashboard.click();
    }
    @When("StartDate alanina gecerli bir tarih girilir")
    public void start_date_alanina_gecerli_bir_tarih_girilir() {
        getLandEstatePage.AdvertsStartDate.sendKeys("12.03.2025");
    }
    @When("EndDate alanina gecerli bir tarih girilir")
    public void end_date_alanina_gecerli_bir_tarih_girilir() {
        getLandEstatePage.AdvertEndDate.sendKeys("15.03.2025");
    }
    @When("Rapor oluştur butonuna tıklanır.")
    public void rapor_oluştur_butonuna_tıklanır() {
        getLandEstatePage.AdvertsReportCreate.click();
    }
    @Then("Raporun başarıyla oluştuğu doğrulanır")
    public void raporun_başarıyla_oluştuğu_doğrulanır() {
        visibleWait(getLandEstatePage.ReportSuccessfullyDownloaded,5);
        Assert.assertTrue(getLandEstatePage.ReportSuccessfullyDownloaded.isDisplayed());
    }

    @When("MOST POPULAR PROPERTIES alaninda amount degeri girilir")
    public void most_popular_propertıes_alaninda_amount_degeri_girilir() {
        getLandEstatePage.Amount.sendKeys("1");
    }
    @When("MOST POPULAR PROPERTIES alanindaki rapor oluştur butonuna tıklanır.")
    public void most_popular_propertıes_alanindaki_rapor_oluştur_butonuna_tıklanır() {
        getLandEstatePage.MostPopularPropertiesReportCreate.click();
    }

    @When("Users alaninda role olarak manager secilir.")
    public void users_alaninda_role_olarak_manager_secilir() {
        getLandEstatePage.UsersRoleManager.click();
    }
    @When("Users alanindaki rapor oluştur butonuna tıklanır.")
    public void users_alanindaki_rapor_oluştur_butonuna_tıklanır() {
        getLandEstatePage.UsersRoleReportCreate.click();


    }

    @Then("Authentication Raporun başarıyla oluştuğu doğrulanır")
    public void authentication_raporun_başarıyla_oluştuğu_doğrulanır() {
        visibleWait(getLandEstatePage.AuthenticationError,5);
        Assert.assertTrue(getLandEstatePage.AuthenticationError.isDisplayed());
    }

    @When("Tour Request alanindaki Start Date degeri girilir")
    public void tour_request_alanindaki_start_date_degeri_girilir() {
        getLandEstatePage.TourRequestsStartDate.sendKeys("13.03.2025");
    }
    @When("Tour Request alanindaki End Date degeri girilir")
    public void tour_request_alanindaki_end_date_degeri_girilir() {
        getLandEstatePage.TourRequestsEndDate.sendKeys("15.03.2025");
    }
    @When("Tour Request alanindaki rapor oluştur butonuna tıklanır.")
    public void tour_request_alanindaki_rapor_oluştur_butonuna_tıklanır() {
        getLandEstatePage.TourRequestsReportCreate.click();
    }

    @When("ContactMessages sayfasina gidilir")
    public void contact_messages_sayfasina_gidilir() {
        getLandEstatePage.ContactMessagesButton.click();
    }
    @When("Herhangi bir mesaja tıklanır")
    public void herhangi_bir_mesaja_tıklanır() {
        getLandEstatePage.ContactMessagesFirstMessage.click();

    }
    @When("Tiklanan mesaj silinir")
    public void tiklanan_mesaj_silinir() {
        getLandEstatePage.ContactMessagesDeleteButton.click();

    }
    @Then("mesajın silindiği dogrulanir")
    public void mesajın_silindiği_dogrulanir() {
        Assert.assertTrue(getLandEstatePage.ContactMessagesAll.isDisplayed());

    }


    @And("Tiklanan okundu olarak isaretlenir")
    public void tiklanan_okundu_olarak_isaretlenir() {
        getLandEstatePage.MarkAsReadButton.click();
    }
    @Then("Mesajın okundu olarak isaretlendigi dogrulanir")
    public void mesajın_okundu_olarak_isaretlendigi_dogrulanir() {
        String backgroundColor = getLandEstatePage.ForColor.getCssValue("background-color");
        String expectedColor = "rgba(241, 241, 241, 1)";
        Assert.assertEquals(expectedColor,backgroundColor);
    }

    @And("Searchboxa mesaj yazılır")
    public void searchboxa_mesaj_yazılır() throws InterruptedException {

        getLandEstatePage.ContactMessagesSearchButton.sendKeys("Bu bir TEST mesajıdır");

    }
    @When("Searchbox ile arama yapilir")
    public void searchbox_ile_arama_yapilir() {
        getLandEstatePage.ContactMessagesSearchBox.click();
    }


    @Then("Yapilan arama dogrulanir")
    public void yapilan_arama_dogrulanir() {

        visibleWait(getLandEstatePage.searchContainer,5);
        String resultText = getLandEstatePage.searchContainer.getText();
        System.out.println("Arama Sonucu: " + resultText);

        Assert.assertTrue("Arama sonucu bulunamadı!", resultText.contains("Bu bir TEST mesajıdır."));


    }

    @When("Tarih girilir")
    public void tarih_girilir() {
        getLandEstatePage.ContactMessagesFilterButton.click();
        getLandEstatePage.ContactMessagesStartDate.sendKeys("13.03.2025");
        getLandEstatePage.ContactMessagesEndDate.sendKeys("18.03.2025");
    }
    @When("Arama yapilir")
    public void arama_yapilir() {
        getLandEstatePage.ContactMessagesApplyButton.click();

    }
    @Then("Yapilan tarih aramasi dogrulanir")
    public void yapilan_tarih_aramasi_dogrulanir() {
        Assert.assertTrue("Filtre aktif değil!", getLandEstatePage.activeFilterBadge.isDisplayed());

    }

}

