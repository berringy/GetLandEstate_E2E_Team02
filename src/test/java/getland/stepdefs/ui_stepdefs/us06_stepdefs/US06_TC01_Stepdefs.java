package getland.stepdefs.ui_stepdefs.us06_stepdefs;

import getland.pages.US06_Page;
import getland.utilities.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static getland.utilities.BrowserUtils.*;


public class US06_TC01_Stepdefs {
    ReusableMethods reusableMethods = new ReusableMethods();
    WaitUtils waitUtils = new WaitUtils();



US06_Page us06Page = new US06_Page();
    @Given("Manager Sayfasina Gider")
    public void manager_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        WaitUtils.waitForPageToLoad(5);
        us06Page.loginRegisterButton.click();
        us06Page.emailTextBox.sendKeys(ConfigReader.getProperty("evrenEmail"));
        us06Page.passwordTextBox.sendKeys(ConfigReader.getProperty("evrenPassword"));
        us06Page.loginButton.click();
        us06Page.backToSiteButton.click();

    }
    @When("Ilan ekle butonuna tiklar")
    public void ilan_ekle_butonuna_tiklar() {
        us06Page.createPropertyButton.click();

    }
    @Then("Title alani bos birakilarak diger alanlar doldurulur")
    public void title_alani_bos_birakilarak_diger_alanlar_doldurulur() {
        us06Page.titleTextBox.click();
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100.000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.sendKeys("180");
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);

    }
    @Then("Enter Title alani bos birakildiginda uyari mesaji gorulur")
    public void enter_title_bos_birakildiginda_uyari_mesaji_gorulur() {

        verifyElementDisplayed(us06Page.alertTitle);
        verifyExpectedAndActualTextMatch("Enter a title", us06Page.alertTitle);


    }

    @Then("Description alani bos birakilarak diger alanlar doldurulur")
    public void description_alani_bos_birakilarak_diger_alanlar_doldurulur() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us06Page.descriptionTextBox.click();
        us06Page.priceTextBox.sendKeys("100.000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.sendKeys("180");
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);

    }
    @Then("Description alani bos birakildiginda uyari mesaji gorulur")
    public void Description_alani_bos_birakildiginda_uyari_mesaji_gorulur() {

        verifyElementDisplayed(us06Page.alertDescription);
        verifyExpectedAndActualTextMatch("Enter a description", us06Page.alertDescription);

    }


    @Then("Price alanına deger gir diğer alanları doldur.")
    public void priceAlanınaDegerGirDiğerAlanlarıDoldur() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.sendKeys("0");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.sendKeys("180");
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);



    }

    @And("Price alani bos birakildiginda uyari mesaji gorulur")
    public void priceAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertPrice);
        verifyExpectedAndActualTextMatch("Price must be positive", us06Page.alertPrice);

    }

    @Then("Advert Type alanını boş bırak, diğer alanları doldur.")
    public void advertTypeAlanınıBoşBırakDiğerAlanlarıDoldur() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.sendKeys("180");
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Create butonuna tiklanir")
    public void createButonunaTiklanir() {
        us06Page.createButton.click();
    }

    @And("Advert Type alani bos birakildiginda uyari mesaji gorulur")
    public void advertTypeAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertAdvertType);
        verifyExpectedAndActualTextMatch("Advert Type must be selected", us06Page.alertAdvertType);

    }

    @Then("Title, Description, Price, Advert Type, Category alanlarını doldur.")
    public void titleDescriptionPriceAdvertTypeCategoryAlanlarınıDoldur() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
    }

    @And("Title, Description, Price, Advert Type, Category alanlarını doldu oldugu dogrulanir")
    public void titleDescriptionPriceAdvertTypeCategoryAlanlarınıDolduOlduguDogrulanir() {
        verifyElementDisplayed(us06Page.titleTextBox);
        verifyElementDisplayed(us06Page.descriptionTextBox);
        verifyElementDisplayed(us06Page.priceTextBox);
        verifyElementDisplayed(us06Page.advertTypeSelect);
        verifyElementDisplayed(us06Page.categoryDropdown);


    }

    @When("Country alanı bos birakilir")
    public void countryAlanıBosBirakilir() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");        us06Page.categoryDropdown.click();
        us06Page.addressTextBox.click();
        us06Page.sizeTextBox.sendKeys("180");
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Country alani bos birakildiginda uyari mesaji gorulur")
    public void countryAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertCountry);
        Driver.closeDriver();

    }

    @When("Address alani bos birakilmali")
    public void addressAlaniBosBirakilmali() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.click();
        us06Page.sizeTextBox.sendKeys("180");
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Address alani bos birakildiginda uyari mesaji gorulur")
    public void addressAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertAdrress);
        verifyExpectedAndActualTextMatch("newAdvertPageTranslations.requiredAddress", us06Page.alertAdrress);
    }

    @And("Sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
        WaitUtils.waitForPageToLoad(5);
    }


    @When("Country, City, District, Address alanlarını doldur.")
    public void countryCityDistrictAddressAlanlarınıDoldur() {
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");;
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
    }

    @Then("Country, City, District, Address alanlarını doldu oldugu dogrulanir")
    public void countryCityDistrictAddressAlanlarınıDolduOlduguDogrulanir() {
        verifyElementDisplayed(us06Page.countryDropdown);
        verifyElementDisplayed(us06Page.cityDropdown);
        verifyElementDisplayed(us06Page.districtDropdown);
        verifyElementDisplayed(us06Page.addressTextBox);

    }

    @When("Size alani bos birakilmali")
    public void sizeAlaniBosBirakilmali() throws InterruptedException {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");;
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Size alani bos birakildiginda uyari mesaji gorulur")
    public void sizeAlaniBosBirakildigindaUyariMesajiGorulur() {
    verifyElementDisplayed(us06Page.alertSize);
    }


    @When("Bedrooms alani bos birakilmali")
    public void bedroomsAlaniBosBirakilmali() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.click();
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Bedrooms alani bos birakildiginda uyari mesaji gorulur")
    public void bedroomsAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertBedroom);
    }

    @When("Bathrooms alani bos birakilmali")
    public void bathroomsAlaniBosBirakilmali() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("-2");
        us06Page.bathroomTextBox.click();
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Bathrooms alani bos birakildiginda uyari mesaji gorulur")
    public void bathroomsAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertBathroom);
    }

    @When("Bedrooms alanı negatif girildi")
    public void bedroomsAlanıNegatifGirildi() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("-2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Bedrooms alani negatif girildiginda uyari mesaji gorulur")
    public void bedroomsAlaniNegatifGirildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertBedroom);
    }

    @When("Bathrooms alanı negatif girildi")
    public void bathroomsAlanıNegatifGirildi() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("-2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Bathrooms alani negatif girildiginda uyari mesaji gorulur")
    public void bathroomsAlaniNegatifGirildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertBathroom);
    }

    @When("Year of build alani bos birakilmali")
    public void yearOfBuildAlaniBosBirakilmali() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("-2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.click();
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Year of build alani bos birakildiginda uyari mesaji gorulur")
    public void yearOfBuildAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertYearOfBuild);
    }

    @When("Year of build alanı negatif girildi")
    public void yearOfBuildAlanıNegatifGirildi() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("-2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("-2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Year of build alani negatif girildiginda uyari mesaji gorulur")
    public void yearOfBuildAlaniNegatifGirildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertYearOfBuild);
    }

    @When("Maintenance Fee alani bos birakilmali")
    public void maintenanceFeeAlaniBosBirakilmali() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("-2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.click();
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Maintenance Fee alani bos birakildiginda uyari mesaji gorulur")
    public void maintenanceFeeAlaniBosBirakildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertMaintenanceFee);
    }

    @When("Maintenance Fee alanı negatif girildi")
    public void maintenanceFeeAlanıNegatifGirildi() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli baglar mevkisinde doga ile ic ice klimali merkezi isitmali ev");
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.click();
        us06Page.priceTextBox.clear();
        us06Page.priceTextBox.sendKeys("100000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("-2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("-200");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        us06Page.imageClick.click();
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Maintenance Fee alani negatif girildiginda uyari mesaji gorulur")
    public void maintenanceFeeAlaniNegatifGirildigindaUyariMesajiGorulur() {
        verifyElementDisplayed(us06Page.alertMaintenanceFee);
    }

    @When("Properties alanlarını doldur.")
    public void propertiesAlanlarınıDoldur() {
        us06Page.sizeTextBox.click();
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("-2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("-2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");

    }

    @Then("Properties alanlarını doldu oldugu dogrulanir")
    public void propertiesAlanlarınıDolduOlduguDogrulanir() {
        verifyElementDisplayed(us06Page.sizeTextBox);
        verifyElementDisplayed(us06Page.bedroomTextBox);
        verifyElementDisplayed(us06Page.bathroomTextBox);
        verifyElementDisplayed(us06Page.garageDropdown);
        verifyElementDisplayed(us06Page.yearOfBuildTextBox);
        verifyElementDisplayed(us06Page.furnitureDropdown);
        verifyElementDisplayed(us06Page.maintenanceTextBox);
        verifyElementDisplayed(us06Page.terraceDropdown);
        verifyElementDisplayed(us06Page.flatDropdown);
        verifyElementDisplayed(us06Page.gardenDropdown);
        verifyElementDisplayed(us06Page.flowerGardenDropdown);
        verifyElementDisplayed(us06Page.centralAcDropdown);
        verifyElementDisplayed(us06Page.centralHeatingDropdown);
        verifyElementDisplayed(us06Page.flattDropdown);
        verifyElementDisplayed(us06Page.flattisaDropdown);
        verifyElementDisplayed(us06Page.flatt5Dropdown);
        verifyElementDisplayed(us06Page.flatt6Dropdown);
        verifyElementDisplayed(us06Page.flatt7Dropdown);
    }

    @When("Resim Ekle butonuna tiklar")
    public void resimEkleButonunaTiklar() {
        us06Page.imageClick.click();
    }

    @When("Geçerli bir resim yüklendi")
    public void geçerliBirResimYüklendi() {
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Resim Ekleme - Geçerli bir resim yüklendiğinde dogrulama")
    public void resimEklemeGeçerliBirResimYüklendiğindeDogrulama() {
        Assert.assertTrue(us06Page.truePicture.isDisplayed());
    }

    @When("{int} MB'tan büyük resim yüklendi")
    public void mbTanBüyükResimYüklendi(int arg0) {
        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\high3mb.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);
    }

    @Then("Resim Ekleme - {int} MB'tan büyük resim yüklenemedigi uyari mesaji gorulur")
    public void resimEklemeMBTanBüyükResimYüklenemedigiUyariMesajiGorulur(int arg0) {
        Assert.assertTrue(us06Page.alertPictureSize.isDisplayed());
    }

    @Then("Tüm bilgiler doldurur")
    public void tümBilgilerDoldurulur() {
        us06Page.titleTextBox.sendKeys("Mustakil bahceli Ev");
        us06Page.descriptionTextBox.sendKeys("Mustakil bahceli, merkezi isitma ve klimali ev");
        us06Page.priceTextBox.sendKeys("100.000");
        dropdownSelectByVisibleText(us06Page.advertTypeDropdown, "Rent");
        dropdownSelectByVisibleText(us06Page.categoryDropdown, "House");
        dropdownSelectByVisibleText(us06Page.countryDropdown, "Türkiye");
        dropdownSelectByVisibleText(us06Page.cityDropdown, "Denizli");
        dropdownSelectByVisibleText(us06Page.districtDropdown, "Çal");
        us06Page.addressTextBox.sendKeys("Kisik bolgesinde baglar mevkisinde");
        us06Page.sizeTextBox.sendKeys("180");
        us06Page.bedroomTextBox.sendKeys("2");
        us06Page.bathroomTextBox.sendKeys("2");
        dropdownSelectByVisibleText(us06Page.garageDropdown, "Yes");
        us06Page.yearOfBuildTextBox.sendKeys("2020");
        dropdownSelectByVisibleText(us06Page.furnitureDropdown, "Yes");
        us06Page.maintenanceTextBox.sendKeys("Yok");
        dropdownSelectByVisibleText(us06Page.terraceDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.gardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flowerGardenDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralAcDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.centralHeatingDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flattisaDropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt5Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt6Dropdown, "Yes");
        dropdownSelectByVisibleText(us06Page.flatt7Dropdown, "Yes");
        ActionsUtils.scrollDown();
        us06Page.imageClick.click();

        String pathOfFile1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Ev.jpg\\";
        reusableMethods.uploadFile(pathOfFile1);

        
    }

    @Then("Create butonuna tiklanildiginda ilan olusturulur")
    public void CreateButonunaTiklanildigindaIlanOlusturulur() {
        WaitUtils.waitForPageToLoad(5);
        verifyElementDisplayed(us06Page.advertCheck);
    }


}

