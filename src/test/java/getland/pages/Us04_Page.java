package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us04_Page {

    public Us04_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle nav-link']")
    public WebElement DilSecenekleriButtonu;

    @FindBy(xpath ="//*[text()='Deutsch']")
    public WebElement AlmancaButtonu;

    @FindBy(xpath ="//*[text()='Français']")
    public WebElement FransizcaButtonu;

    @FindBy(xpath ="//*[text()='English']")
    public WebElement EnglishButtonu;

    @FindBy(xpath ="//*[text()='Türkçe']")
    public WebElement TürkçeButtonu;

    @FindBy(xpath ="//*[text()='Español']")
    public WebElement EspañolButtonu;

 @FindBy(xpath ="//a[text()='Anmelden']")
    public WebElement SayfaninAlmancaOldugununkaniti;

 @FindBy(xpath ="//a[text()='Login']")
    public WebElement SayfaninIngilizceOldugununkaniti;

 @FindBy(xpath ="//a[text()='Giriş Yap']")
    public WebElement SayfaninTürkceOldugununkaniti;

    @FindBy(xpath ="//a[text()='Se connecter']")
    public WebElement SayfaninFransizcaOldugununkaniti;

    @FindBy(xpath ="//a[text()='Iniciar sesión']")
    public WebElement SayfaninIspanyoncaOldugununkaniti;

    @FindBy(xpath ="//*[.='About']")
    public WebElement HakkindaSayfasingilizceAbout;

    @FindBy(xpath ="//*[text()='ABOUT US']")
    public WebElement HakkimizdaABOUTUS;

    @FindBy(xpath ="//*[text()='Gizlilik Politikası']")
    public WebElement GizlilikPolitikasiButton;

    @FindBy(xpath ="//*[text()='Datenschutzbestimmungen']")
    public WebElement GizlilikPolitikasiButtonAlmanca;

    @FindBy(xpath ="//*[text()='PRIVACY POLICY']")
    public WebElement GizlilikPolitikasiSayfaDili;

    @FindBy(xpath ="//*[text()='Términos y Condiciones']")
    public WebElement SartlarVeKosullarButonuIsponyolca;

    @FindBy(xpath ="//h1[.='TERMS OF USE']")
    public WebElement SartlarVeKosullarIsponyolcaOlmadigininkaniti;

    @FindBy(xpath ="//input[@name='email']")
    public WebElement mailalani;
    @FindBy(xpath ="//input[@name='password']")
    public WebElement pasaportalani;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement KayitolmaButtonu;

    @FindBy(xpath ="(//img[@alt class='user-pic'])[1]")
    public WebElement Kayitdancikmakicinilkadim;

    @FindBy(xpath ="//a[text()='Abmelden']")
    public WebElement Kayitdancikmakicinikinciadim;
@FindBy(xpath ="//span[text()='Ja']")
    public WebElement KayitdancikmakicinUcüncüadim;

    @FindBy(xpath ="//a[@class='side-menu-link back-site nav-link']")
    public WebElement KayitolduktansonraAnasayfayaDönmeButtonu;
    @FindBy(xpath ="//a[text()='Términos y Condiciones']")
    public WebElement SartlarveKosullarIspolyolcaButton;

    @FindBy(xpath ="//h1[.='PRIVACY POLICY']")
    public WebElement SartlarVeKosullarAlmancacaOlmadigininkaniti;














}
