package getland.pages;

import getland.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us12_Page {
    public Us12_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement AnaSayfaSearchAlani;

    @FindBy(xpath = "//*[@height='25']")
    public WebElement AnaSayfaSearchButonu;

    @FindBy(xpath = "//*[text()='Total found : ']")
    public WebElement HauseIlanlarininGörülmesininKaniti;

    @FindBy(xpath = "//button[@style='width: 100%; padding: 15px;']")
    public WebElement HauseIlanlarininDetaylariGirildiktenSonraTiklananButton;

     @FindBy(xpath = "//input[@id='pe']")
    public WebElement HauseIlanlarininDetaylariMaximumParagirisAlani;
     @FindBy(xpath = "//input[@id='ps']")
    public WebElement HauseIlanlarininDetaylariMimumParagirisAlani;

     @FindBy(xpath = "//input[@id='tourDate']")
    public WebElement CankayaAnkaraEViDateSecmeAlanai;
 @FindBy(xpath = "//select[@id='tourTime']")
    public WebElement CankayaAnkaraEViDateSaatSecmeAlanai;

     @FindBy(xpath = "//select[@id='c']")
    public WebElement HauseIlanlarininDetaylariCatogaryDrobdwn;
     @FindBy(xpath = "//select[@id='ctry']")
    public WebElement HauseIlanlarininDetaylariCountryDrobdwn;

 @FindBy(xpath = "//select[@id='city']")
    public WebElement HauseIlanlarininDetaylariCityDrobdwn;

 @FindBy(xpath = "//*[@alt='Scenic_Spacious_Garden_House']")
    public WebElement HauseIlanlarindaCankayaAnkaraEvi;

 @FindBy(xpath = "(//a[.='Home'])[1]")
    public WebElement HomePageButton;
@FindBy(xpath = "//button[@class='fav-button ']")
    public WebElement  HauseIlanlarinDetayliAramaKonyaaltiAntaylaEvi;

@FindBy(xpath = "//div[text()='House']")
    public WebElement CankayaAnkaraEviDescriptionVarligi;

@FindBy(xpath = "//h4[.='DETAILS']")
    public WebElement CankayaAnkaraEviDetailsEkranininVarligi;


    @FindBy(xpath = "//strong[.='Address']")
    public WebElement CankayaAnkaraEviLocationEkranininVarligi;

    @FindBy(xpath = "//*[@class='p-image p-component shown-image-wrapper p-image-preview-container']")
    public WebElement CankayaAnkaraEvinResimEkranininVarligi;

    @FindBy(xpath = "(//strong[text()='Year of Build']/following-sibling::span)[2]")
    public WebElement CankayaAnkaraEviDescriptionBilgilerinineksikligi;

 @FindBy(xpath = "(//*[@class='show-toggle btn btn-danger'])[1]")
    public WebElement CankayaAnkaraEvicontactNumberButonu;

@FindBy(xpath = "//h4[.='Log in for tour request']")
    public WebElement CankayaAnkaraAcontUyariMesaji;

@FindBy(xpath = "//button[@class='close-button btn btn-primary']")
    public WebElement CankayaAnkaraAcontUyariMesajindanCikis;

@FindBy(xpath = "//button[@type='submit']")
    public WebElement CankayaAnkaraAcontsubmitATourRequestButonu;

@FindBy(xpath = "//*[text()='Create one now!']")
    public WebElement CankayaAnkaraAcontOlusturmaButonu;
@FindBy(xpath = "//*[text()='REGISTER']")
    public WebElement RegisterSayfasindaliCreatbuttonu;





}
