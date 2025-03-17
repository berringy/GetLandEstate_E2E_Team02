package getland.stepdefs.ui_stepdefs.us12_stepdefs;

import getland.pages.Us12_Page;
import getland.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us12stepdefs {

    Us12_Page us12Page=new Us12_Page();
    @Given("Sayfayı aç")
    public void sayfayıAç() {
        Driver.getDriver().get("http://64.227.123.49/");
    }

    @When("Arama çubuğuna house yaz ve ara")
    public void aramaÇubuğunaHouseYazVeAra() {
        us12Page.AnaSayfaSearchAlani.sendKeys("House");
        us12Page.AnaSayfaSearchButonu.click();


    }

    @Then("Listelenen ilanları incele")
    public void listelenenIlanlarıIncele() {
        Assert.assertTrue(us12Page.HauseIlanlarininGörülmesininKaniti.isDisplayed());
    }

    @And("İlanlar açılmalı")
    public void i̇lanlarAçılmalı() {
        Assert.assertTrue(us12Page.HauseIlanlarindaCankayaAnkaraEvi.isDisplayed());
    }

    @Given("Sayfayı aç ve arama filtresine gir")
    public void sayfayıAçVeAramaFiltresineGir() {
        us12Page.HomePageButton.click();
        us12Page.AnaSayfaSearchAlani.sendKeys("House");
        us12Page.AnaSayfaSearchButonu.click();

    }

    @When("Price Range, Category, City seç ve ara. Besyüzbin Euro, house, Antalya")
    public void priceRangeCategoryCitySeçVeAraBesyüzbinEuroHouseAntalya() {
        WaitUtils.waitForVisibility(us12Page.HauseIlanlarininDetaylariMaximumParagirisAlani,10);
        us12Page.HauseIlanlarininDetaylariMaximumParagirisAlani.sendKeys("500000");
       us12Page.HauseIlanlarininDetaylariMimumParagirisAlani.sendKeys("500");

     ReusableMethods.ddmVisibleText(us12Page.HauseIlanlarininDetaylariCatogaryDrobdwn,"House");
     ReusableMethods.ddmVisibleText(us12Page.HauseIlanlarininDetaylariCountryDrobdwn,"Türkiye");
        ActionsUtils.scrollDown();
     ReusableMethods.ddmVisibleText(us12Page.HauseIlanlarininDetaylariCityDrobdwn,"Antalya");
        ActionsUtils.scrollDown();
        JSUtils.JSscrollAllTheWayDown();
        WaitUtils.waitFor(15);
        us12Page.HauseIlanlarininDetaylariGirildiktenSonraTiklananButton.click();



    }

    @Then("İlanları inceleyerek detaylarını kontrol et")
    public void i̇lanlarıInceleyerekDetaylarınıKontrolEt() {
Assert.assertTrue(us12Page.HauseIlanlarininGörülmesininKaniti.isDisplayed());
    }

    @And("Sonuçlar listelenmeli İlanlar açılmalı")
    public void sonuçlarListelenmeliİlanlarAçılmalı() {
        WaitUtils.waitForVisibility(us12Page.HauseIlanlarinDetayliAramaKonyaaltiAntaylaEvi,10);
        Assert.assertTrue(us12Page.HauseIlanlarinDetayliAramaKonyaaltiAntaylaEvi.isDisplayed());
    }

    @Given("Sayfayı aç ve bir ilana tıkla")
    public void sayfayıAçVeBirIlanaTıkla() {
        us12Page.HomePageButton.click();
        us12Page.AnaSayfaSearchAlani.sendKeys("House");
        us12Page.AnaSayfaSearchButonu.click();
        WaitUtils.waitForVisibility(us12Page.HauseIlanlarindaCankayaAnkaraEvi,10);

        us12Page.HauseIlanlarindaCankayaAnkaraEvi.click();
    }

    @Then("Description bilgilerini kontrol et")
    public void descriptionBilgileriniKontrolEt() {
        Assert.assertTrue(us12Page.CankayaAnkaraEviDescriptionVarligi.isDisplayed());

    }

    @When("Details sekmesini aç")
    public void detailsSekmesiniAç() {
        Assert.assertTrue(us12Page.CankayaAnkaraEviDetailsEkranininVarligi.isDisplayed());


    }

    @And("Location sekmesine geç")
    public void locationSekmesineGeç() {
        JSUtils.JSscrollAllTheWayDown();
        Assert.assertTrue(us12Page.CankayaAnkaraEviLocationEkranininVarligi.isDisplayed());
        WaitUtils.waitForVisibility(us12Page.CankayaAnkaraEviLocationEkranininVarligi,10);
    }

    @And("İlan resimlerini kontrol et")
    public void i̇lanResimleriniKontrolEt() {
        ActionsUtils.scrollUp();
        Assert.assertTrue(us12Page.CankayaAnkaraEvinResimEkranininVarligi.isDisplayed());
    }

    @And("Tüm bilgiler eksiksiz olmalı")
    public void tümBilgilerEksiksizOlmalı() {
        String value = us12Page.CankayaAnkaraEviDescriptionBilgilerinineksikligi.getText().trim();
        Assert.assertFalse("Year of Build is empty! This is a bug!", value.isEmpty());
    }

    @When("Contact Number butonuna tıkla")
    public void contactNumberButonunaTıkla() {
        ActionsUtils.scrollUp();
        WaitUtils.waitForVisibility(us12Page.CankayaAnkaraEvicontactNumberButonu,10);
        us12Page.CankayaAnkaraEvicontactNumberButonu.click();

    }

    @Then("Kullanıcı giriş yapmamışsa uyarı mesajını bekle")
    public void kullanıcıGirişYapmamışsaUyarıMesajınıBekle() {

    }

    @When("Don't have an account? Create one now! mesajını kontrol et")
    public void donTHaveAnAccountCreateOneNowMesajınıKontrolEt() {
        Assert.assertTrue(us12Page.CankayaAnkaraAcontUyariMesaji.isDisplayed());
    }

    @And("Popup açılmalı Uyarı çıkmalı")
    public void popupAçılmalıUyarıÇıkmalı() {
        Assert.assertTrue(us12Page.CankayaAnkaraAcontUyariMesaji.isDisplayed());
        us12Page.CankayaAnkaraAcontUyariMesajindanCikis.click();

    }

    @When("Schedule a tour bölümününe git")
    public void scheduleATourBölümününeGit() {

    }

    @Then("Randevu için tarih ve saat gir")
    public void randevuIçinTarihVeSaatGir() {
        us12Page.CankayaAnkaraEViDateSecmeAlanai.sendKeys("10122025");
      ReusableMethods.ddmIndex(  us12Page.CankayaAnkaraEViDateSaatSecmeAlanai,15);

    }

    @And("Submit a tour request butonuna tikla")
    public void submitATourRequestButonunaTikla() {
        us12Page.CankayaAnkaraAcontsubmitATourRequestButonu.click();
    }

    @And("Randevu talebinin olusturuldugunu kontrol et")
    public void randevuTalebininOlusturuldugunuKontrolEt() {
        Assert.assertFalse(us12Page.CankayaAnkaraAcontUyariMesaji.isDisplayed());
        WaitUtils.waitFor(2);
        us12Page.CankayaAnkaraAcontUyariMesajindanCikis.click();

    }

    @And("Log in for tour request ve Don't have an account? Create one now! mesajlarını kontrol et")
    public void logInForTourRequestVeDonTHaveAnAccountCreateOneNowMesajlarınıKontrolEt() {
        Assert.assertTrue(us12Page.CankayaAnkaraAcontUyariMesaji.isDisplayed());
    }

    @When("Create one now! metnine tıkla")
    public void createOneNowMetnineTıkla() {
        us12Page.CankayaAnkaraAcontOlusturmaButonu.click();
        WaitUtils.waitFor(2);


    }

    @And("Register sayfasında oldugunu dogrula")
    public void registerSayfasındaOldugunuDogrula() {
        Assert.assertTrue(us12Page.RegisterSayfasindaliCreatbuttonu.isDisplayed());
    }





}