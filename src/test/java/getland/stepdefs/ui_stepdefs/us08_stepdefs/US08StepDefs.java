package getland.stepdefs.ui_stepdefs.us08_stepdefs;

import getland.pages.US08_Page;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.JSUtils;
import getland.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08StepDefs {

    US08_Page us08Page = new US08_Page();

    @Given("Sayfaya gidilir.")
    public void sayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Login linkine tıklanır.")
    public void loginLinkineTıklanır() {
        WaitUtils.waitForPageToLoad(10);
        us08Page.loginLink.click();

    }

    @And("Geçerli email ve şifre ile sisteme giriş yapılır.")
    public void geçerliEmailVeŞifreIleSistemeGirişYapılır() {
        us08Page.emailTextBox.sendKeys(ConfigReader.getProperty("saitManagerEmail"));
        us08Page.passwordTextBox.sendKeys(ConfigReader.getProperty("saitManagerPassword"));
        us08Page.loginButton.click();

    }

    @And("Back to site linkine tıklanır.")
    public void backToSiteLinkineTıklanır() {
        WaitUtils.waitForVisibility(us08Page.backToSiteButton,5);
        us08Page.backToSiteButton.click();
    }

    @And("User logo üzerine tıklanıp menu açılır.")
    public void userLogoÜzerineTıklanıpMenuAçılır() {
        WaitUtils.waitForVisibility(us08Page.profileButton,5);
        us08Page.profileButton.click();
    }

    @And("Açılan menü üzerinden My Adverts linkine tıklanır.")
    public void açılanMenüÜzerindenMyAdvertsLinkineTıklanır() {
        WaitUtils.waitForVisibility(us08Page.myAdvertsLink,5);
        us08Page.myAdvertsLink.click();

    }

    @And("Manager'ın daha önceden paylaşmış olduğu ilanların görüntülendiği doğrulanır.")
    public void managerInDahaÖncedenPaylaşmışOlduğuIlanlarınGörüntülendiğiDoğrulanır() {
        WaitUtils.waitForVisibility(us08Page.firstAdvert,5);
        Assert.assertTrue(us08Page.firstAdvert.isDisplayed());

    }

    @And("İlan detaylarından güncelle butonu tıklanır.")
    public void ilanDetaylarındanGüncelleButonuTıklanır() {
        WaitUtils.waitForVisibility(us08Page.advertEditButton,5);
        us08Page.advertEditButton.click();
    }

    @And("Manager açılan sayfada Update butonuna scrool yaparak Update butonuna tıklar.")
    public void managerAçılanSayfadaUpdateButonunaScroolYaparakUpdateButonunaTıklar() {
        WaitUtils.waitForVisibility(us08Page.editAdvertTitle,5);
        JSUtils.JSclickWithTimeout(us08Page.editAdvertUpdateButton);

    }

    @And("Manager'ın ilan güncelleyebildiği doğrulanır.")
    public void managerInIlanGüncelleyebildiğiDoğrulanır() {
        WaitUtils.waitForVisibility(us08Page.editAdvertSuccessMessage,5);
        Assert.assertTrue(us08Page.editAdvertSuccessMessage.isDisplayed());
    }

    @And("Manager ilanı sil butonuna tıklar.")
    public void managerIlanıSilButonunaTıklar() {
        // WaitUtils.waitForVisibility(us08Page.advertDeleteButton,5);
        // us08Page.advertDeleteButton.click();
        // WaitUtils.waitForVisibility(us08Page.advertDeleteYesButton,5);
        // us08Page.advertDeleteYesButton.click();

    }

    @And("İlanın silindiği doğrulanır.")
    public void ilanınSilindiğiDoğrulanır() {
         //WaitUtils.waitForVisibility(us08Page.advertDeleteMessage,5);
         //Assert.assertTrue(us08Page.advertDeleteMessage.isDisplayed());
    }

    @And("İlan detaylarında Date Published, Status ve View-Like-Tour başlıklarının ve ikonlarının görüntülendiği doğrulanır.")
    public void ilanDetaylarındaDatePublishedStatusVeViewLikeTourBaşlıklarınınVeIkonlarınınGörüntülendiğiDoğrulanır() {

        Assert.assertTrue(us08Page.datePublishedTitle.isDisplayed());
        Assert.assertTrue(us08Page.datePublishedIcon.isDisplayed());
        Assert.assertTrue(us08Page.statusTitle.isDisplayed());
        Assert.assertTrue(us08Page.statusIcon.isDisplayed());
        Assert.assertTrue(us08Page.viewLikeTourTitle.isDisplayed());
        Assert.assertTrue(us08Page.viewLikeTourIcon.isDisplayed());

    }

     @And("Sayfa Kapatılır.")
    public void sayfaKapatılır() {
        Driver.closeDriver();
    }



}
