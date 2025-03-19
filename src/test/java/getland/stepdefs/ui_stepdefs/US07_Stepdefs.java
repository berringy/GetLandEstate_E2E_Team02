package getland.stepdefs.ui_stepdefs;

import getland.pages.US07_Page;
import getland.pages.US07_Page;
import getland.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;

import java.io.File;

import static getland.utilities.BrowserUtils.*;


public class US07_Stepdefs {
    ReusableMethods reusableMethods = new ReusableMethods();
    WaitUtils waitUtils = new WaitUtils();


    US07_Page us07Page = new US07_Page();

    //TC01
    @Given("Manager Sayfasina Gider")
    public void manager_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        WaitUtils.waitForPageToLoad(5);
        us07Page.loginRegisterButton.click();
        us07Page.emailTextBox.sendKeys(ConfigReader.getProperty("managerEmail"));
        us07Page.passwordTextBox.sendKeys(ConfigReader.getProperty("managerPassword"));
        us07Page.loginButton.click();
        us07Page.backToSiteButton.click();
    }

    @When("Ilan ekle butonuna tiklar")
    public void ilan_ekle_butonuna_tiklar() {
        us07Page.createPropertyButton.click();
    }

    @Then("Tüm bilgiler doldurur")
    public void tümBilgilerDoldurulur() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Create butonuna tiklanir")
    public void createButonunaTiklanir() {
        us07Page.createButton.click();
    }

    @Then("Create butonuna tiklanildiginda ilan olusturulur")
    public void CreateButonunaTiklanildigindaIlanOlusturulur() {
        WaitUtils.waitForPageToLoad(5);
        verifyElementDisplayed(us07Page.advertCheck);
    }

    @And("Sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
        WaitUtils.waitForPageToLoad(5);
    }

    @Then("Title alani bos birakilarak diger alanlar doldurulur")
    public void title_alani_bos_birakilarak_diger_alanlar_doldurulur() throws InterruptedException {
        us07Page.titleTextBox.click();
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Enter Title alani bos birakildiginda uyari mesaji gorulur")
    public void enter_title_bos_birakildiginda_uyari_mesaji_gorulur() {

        verifyElementDisplayed(us07Page.alertTitle);
        verifyExpectedAndActualTextMatch("Enter a title", us07Page.alertTitle);

    }

    @Then("Description alani bos birakilarak diger alanlar doldurulur")
    public void description_alani_bos_birakilarak_diger_alanlar_doldurulur() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.click();
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Description alani bos birakildiginda uyari mesaji gorulur")
    public void Description_alani_bos_birakildiginda_uyari_mesaji_gorulur() {

        verifyElementDisplayed(us07Page.alertDescription);
        verifyExpectedAndActualTextMatch("Enter a description", us07Page.alertDescription);
    }

    @When("Address alani bos birakilmali")
    public void addressAlaniBosBirakilmali() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.click();
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Address alani bos birakildiginda uyari mesaji gorulur")
    public void addressAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us07Page.alertAdrress);
        verifyExpectedAndActualTextMatch("newAdvertPageTranslations.requiredAddress", us07Page.alertAdrress);
    }

    @When("Resim Ekle butonuna tiklar")
    public void resimEkleButonunaTiklar() {
        us07Page.imageClick.click();
    }

    @When("Geçerli bir resim yüklendi")
    public void geçerliBirResimYüklendi() {
        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Resim Ekleme - Geçerli bir resim yüklendiğinde dogrulama")
    public void resimEklemeGeçerliBirResimYüklendiğindeDogrulama() {
        Assert.assertTrue(us07Page.truePicture.isDisplayed());
    }

    @When("{int} MB'tan büyük resim yüklendi")
    public void mbTanBüyükResimYüklendi(int arg0) {
        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\EV.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Resim Ekleme - {int} MB'tan büyük resim yüklenemedigi uyari mesaji gorulur")
    public void resimEklemeMBTanBüyükResimYüklenemedigiUyariMesajiGorulur(int arg0) {
        Assert.assertTrue(us07Page.alertPictureSize.isDisplayed());
    }

    @Then("Price alanına deger gir diğer alanları doldur.")
    public void priceAlanınaDegerGirDiğerAlanlarıDoldur() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("0");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);

    }

    @And("Price alani bos birakildiginda uyari mesaji gorulur")
    public void priceAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us07Page.alertPrice);
        verifyExpectedAndActualTextMatch("Price must be positive", us07Page.alertPrice);

    }

    @Then("Advert Type alanını boş bırak, diğer alanları doldur.")
    public void advertTypeAlanınıBoşBırakDiğerAlanlarıDoldur() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);

    }

    @And("Advert Type alani bos birakildiginda uyari mesaji gorulur")
    public void advertTypeAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us07Page.alertAdvertType);
        verifyExpectedAndActualTextMatch("Advert Type must be selected", us07Page.alertAdvertType);

    }

    @When("Country alanı bos birakilir")
    public void countryAlanıBosBirakilir() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Country alani bos birakildiginda uyari mesaji gorulur")
    public void countryAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us07Page.alertCountry);
        Driver.closeDriver();
    }

    @When("Size alani bos birakilmali")
    public void sizeAlaniBosBirakilmali() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.click();
        us07Page.bedroomTextBox.sendKeys("2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }
    @Then("Size alani bos birakildiginda uyari mesaji gorulur")
    public void sizeAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us07Page.alertSize);
    }
    @When("Bedrooms alanı negatif girildi")
    public void bedroomsAlanıNegatifGirildi() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("-2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }
    @Then("Bedrooms alani negatif girildiginda uyari mesaji gorulur")
    public void bedroomsAlaniNegatifGirildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us07Page.alertBedroom);
    }
    @When("Year of build alani bos birakilmali")
    public void yearOfBuildAlaniBosBirakilmali() throws InterruptedException {
        us07Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us07Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us07Page.priceTextBox.clear();
        us07Page.priceTextBox.sendKeys("10.000.000");
        Thread.sleep(2000);
        dropdownSelectByVisibleText(us07Page.advertTypeDropdown, "Sale");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.categoryDropdown, "House");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.countryDropdown, "Türkiye");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.cityDropdown, "Denizli");
        Thread.sleep(1000);
        dropdownSelectByVisibleText(us07Page.districtDropdown, "Çal");
        Thread.sleep(1000);
        us07Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us07Page.sizeTextBox.sendKeys("180");
        us07Page.bedroomTextBox.sendKeys("-2");
        us07Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us07Page.garageDropdown, "Yes");
        us07Page.yearOfBuildTextBox.click();
        dropdownSelectByVisibleText(us07Page.furnitureDropdown, "Yes");
        us07Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us07Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us07Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us07Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\house.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }
    @Then("Year of build alani bos birakildiginda uyari mesaji gorulur")
    public void yearOfBuildAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us07Page.alertYearOfBuild);

}
}