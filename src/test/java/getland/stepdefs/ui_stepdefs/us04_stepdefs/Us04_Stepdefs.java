package getland.stepdefs.ui_stepdefs.us04_stepdefs;

import getland.pages.Us04_Page;
import getland.utilities.Driver;
import getland.utilities.JSUtils;
import getland.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us04_Stepdefs {

    Us04_Page us04Pages=new Us04_Page();
    @Given("Ana sayfayı aç")
    public void anaSayfayıAç() {

        Driver.getDriver().get("http://64.227.123.49/");

    }

    @And("Dil değiştirme butonunu bul")
    public void dilDeğiştirmeButonunuBul() {
        Assert.assertTrue(us04Pages.DilSecenekleriButtonu.isDisplayed());
    }

    @When("Butona tıklayarak açılır menüyü kontrol et")
    public void butonaTıklayarakAçılırMenüyüKontrolEt() {
        us04Pages.DilSecenekleriButtonu.click();


    }

    @And("Tüm diller görünmeli")
    public void tümDillerGörünmeli() {
        Assert.assertTrue(us04Pages.EnglishButtonu.isDisplayed());
        Assert.assertTrue(us04Pages.AlmancaButtonu.isDisplayed());
        Assert.assertTrue(us04Pages.FransizcaButtonu.isDisplayed());
        Assert.assertTrue(us04Pages.TürkçeButtonu.isDisplayed());
        Assert.assertTrue(us04Pages.EspañolButtonu.isDisplayed());
        WaitUtils.waitFor(3);


    }

    @Given("Dil menüsünü aç")
    public void dilMenüsünüAç() {

    }

    @And("Almanca seçeneğini seç")
    public void almancaSeçeneğiniSeç() {
        us04Pages.AlmancaButtonu.click();



    }

    @And("Sayfa Almanca olmalı")
    public void sayfaAlmancaOlmalı() {
        Assert.assertTrue(us04Pages.SayfaninAlmancaOldugununkaniti.isDisplayed());
        WaitUtils.waitForVisibility(us04Pages.SayfaninAlmancaOldugununkaniti,10);

    }

    @Given("Dil menüsünü aç ve İngilizce'yi seç")
    public void dilMenüsünüAçVeİngilizceYiSeç() {
        us04Pages.DilSecenekleriButtonu.click();
        us04Pages.EnglishButtonu.click();
        Assert.assertTrue(us04Pages.SayfaninIngilizceOldugununkaniti.isDisplayed());
        WaitUtils.waitFor(2);





    }

    @Then("Hakkında sayfasına git")
    public void hakkındaSayfasınaGit() {
        us04Pages.HakkindaSayfasingilizceAbout.click();

    }

    @When("Sayfa dilinin İngilizce olup olmadığını kontrol et")
    public void sayfaDilininİngilizceOlupOlmadığınıKontrolEt() {
        Assert.assertTrue(us04Pages.SayfaninIngilizceOldugununkaniti.isDisplayed());

    }

    @And("Sayfa ingilizce olmalı")
    public void sayfaIngilizceOlmalı() {
        Assert.assertTrue(us04Pages.HakkimizdaABOUTUS.isDisplayed());
    }

    @Given("Dil menüsünü aç ve Fransızca'yı seç")
    public void dilMenüsünüAçVeFransızcaYıSeç() {
        us04Pages.DilSecenekleriButtonu.click();
     WaitUtils.waitFor(2);
        us04Pages.FransizcaButtonu.click();

    }

    @Then("Tarayıcıyı kapat ve tekrar aç")
    public void tarayıcıyıKapatVeTekrarAç() {



    }

    @When("Sayfa dilinin Fransızca olup olmadığını kontrol et")
    public void sayfaDilininFransızcaOlupOlmadığınıKontrolEt() {


    }

    @And("Sayfa Fransızca olmalı")
    public void sayfaFransızcaOlmalı() {
    }

    @Given("Dil menüsünü aç ve Türkçe'yi seç")
    public void dilMenüsünüAçVeTürkçeYiSeç() {
        us04Pages.DilSecenekleriButtonu.click();
        us04Pages.TürkçeButtonu.click();
        WaitUtils.waitFor(1);

    }

    @When("Gizlilik Politikası bağlantısına tıkla")
    public void gizlilikPolitikasıBağlantısınaTıkla() {
        JSUtils.JSscrollAllTheWayDown();
us04Pages.GizlilikPolitikasiButton.click();

    }

    @And("Sayfa dilini kontrol et türkce omalai")
    public void sayfaDiliniKontrolEt() {
        Assert.assertTrue(us04Pages.GizlilikPolitikasiSayfaDili.isDisplayed());
    }

    @And("Sayfanin DiliTürkçe olmalı")
    public void sayfaninDiliTürkçeOlmalı() {
        Assert.assertTrue(us04Pages.GizlilikPolitikasiSayfaDili.getText().contains("Gizlilik Politikası"));
    }

    @Given("Dil menüsünü aç ve İspanyolca'yı seç")
    public void dilMenüsünüAçVeİspanyolcaYıSeç() {
        us04Pages.DilSecenekleriButtonu.click();
        us04Pages.EspañolButtonu.click();

    }

    @Then("Şartlar ve Koşullar bağlantısına tıkla")
    public void şartlarVeKoşullarBağlantısınaTıkla() {
        JSUtils.JSscrollAllTheWayDown();
        us04Pages.SartlarVeKosullarButonuIsponyolca.click();



    }

    @And("Sayfa İspanyolca olmalı")
    public void sayfaİspanyolcaOlmalı() {
        Assert.assertTrue(us04Pages.SartlarVeKosullarIsponyolcaOlmadigininkaniti.getText().contains("Términos y Condiciones"));
    }



    @Given("Dil menüsünü aç ve Almanca'yı seç")
    public void dilMenüsünüAçVeAlmancaYıSeç() {
        us04Pages.DilSecenekleriButtonu.click();
        us04Pages.AlmancaButtonu.click();


    }


    @And("Gizlilik Politikası Sayfasi Almanca olmalı")
    public void gizlilikPolitikasıSayfasiAlmancaOlmalı() {
        Assert.assertTrue(us04Pages.SartlarVeKosullarAlmancacaOlmadigininkaniti.getText().contains("Datenschutzbestimmungen"));
        WaitUtils.waitFor(3);
        us04Pages.Kayitdancikmakicinilkadim.click();
        WaitUtils.waitFor(5);
        us04Pages.Kayitdancikmakicinikinciadim.click();
        WaitUtils.waitFor(1);
        us04Pages.KayitdancikmakicinUcüncüadim.click();






    }

    @Then("Admin olarak ispanyolca dilinde  giriş yapilir")
    public void adminOlarakIspanyolcaDilindeGirişYapilir() {
        us04Pages.DilSecenekleriButtonu.click();
        us04Pages.SayfaninIspanyoncaOldugununkaniti.click();
        us04Pages.mailalani.sendKeys("admin@gmail.com");
        us04Pages.pasaportalani.sendKeys("admin123!");
        us04Pages.KayitolmaButtonu.click();
        WaitUtils.waitFor(1);
        us04Pages.KayitolduktansonraAnasayfayaDönmeButtonu.click();


    }

    @Then("Admin olarak Almanca dilinde  giriş yapilir")
    public void adminOlarakAlmancaDilindeGirişYapilir() {

        us04Pages.SayfaninAlmancaOldugununkaniti.click();
        us04Pages.mailalani.sendKeys("admin@gmail.com");
        us04Pages.pasaportalani.sendKeys("admin123!");
        us04Pages.KayitolmaButtonu.click();
        WaitUtils.waitFor(1);
        us04Pages.KayitolduktansonraAnasayfayaDönmeButtonu.click();



    }

    @Then("Şartlar ve Koşullar bağlantısına ispanyolca dilinde tıkla")
    public void şartlarVeKoşullarBağlantısınaIspanyolcaDilindeTıkla() {
        JSUtils.JSscrollAllTheWayDown();
        us04Pages.SartlarveKosullarIspolyolcaButton.click();




    }

    @And("Gizlilik Politikası sayfasına Almanca dilinde  tıkla")
    public void gizlilikPolitikasıSayfasınaAlmancaDilindeTıkla() {
        JSUtils.JSscrollAllTheWayDown();
        us04Pages.GizlilikPolitikasiButtonAlmanca.click();


    }

    @When("Sayfa dilini kontrol et dil ispanyolca olmali")
    public void sayfaDiliniKontrolEtDilIspanyolcaOlmali() {
        
    }



}
