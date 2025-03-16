package getland.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import getland.utilities.*;

public class US21_AdminContactMessagesDisplayPage {
    WebDriver driver;

    public US21_AdminContactMessagesDisplayPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    public  WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    public  WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'submit-button')]")
    public  WebElement submitButton;

    @FindBy(xpath = "//div[contains(@class, 'language-dropdown')]")
    public WebElement languageButton; //anasayfadaki dil seçenekleri butonu

    @FindBy(xpath = "//img[contains(@src, 'tr.png')][1]")
    public WebElement turkishButton; //dil seçeneklerinden Türkçe linki

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton; //anasayfadaki Login butonu

    @FindBy(xpath = "//img[contains(@src,'profile/user')][1]']")
    public WebElement profilePicButton; //Login olduktan sonra sayfanın sağ üstteki Profile botonu

    @FindBy(xpath = "//a[@href='/dashboard']") //profilePicButton'a tıklayınca açılan menüdeki "Kontrol Paneli" linki
    public WebElement controlPanel;

    @FindBy(xpath = "//input[contains(@class,'search-input')]") //Kontrol Panel'deki arama kutusu
    public WebElement searchBox;

    @FindBy(xpath = "//button[contains(@class,'search-button')]") //Kontrol Panel'deki Ara butonu
    public WebElement searchButton;  //select[@class='form-control']

    @FindBy(xpath = "//button[contains(@class,'filter-button')]")
    public WebElement filterButton;

    @FindBy(xpath = "//select[@id='status']")
    public WebElement selectMessageStatus;

    @FindBy(xpath = "//input[@id='startDate']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@id='endDate']")
    public WebElement endDate;

    @FindBy(xpath = "//button[contains(@class,'done-button')]")
    public WebElement applyFilterButton;

    @FindBy(xpath = "//a[@href='/dashboard/contact-messages']")//kontrol panelde sol menüdeki "İletişim Mesajları" linki
    public WebElement contactMessagesLink;

    @FindBy(xpath = "//button[contains(@class,'accordion-button')][1]") //ilk mesaj
    public WebElement messageItem;

    @FindBy(xpath = "//button[contains(@class,'accordion-button')]") //mesajların oldugu alan
    public WebElement messageItemArea;

    @FindBy(xpath = "//div[@class='accordion-body']//p[normalize-space()]") //mesaja tıklayınca açılan mesaj içeriği
    public WebElement messageContent;

    @FindBy(xpath = "//span[contains(@class,'create-time')][1]") //mesajın tarihi
    public WebElement messageDate;

    @FindBy(xpath = "//button[contains(@title,'Delete')][1]") //mesajın içindeki delete ikonu
    public WebElement deleteMessageIcon;

    @FindBy(xpath = "//button[@title='Mark as read'][1]")
    public WebElement markAsReadIcon;

    @FindBy(xpath = "//button[contains(@class,'read')][1]")
    public WebElement markAsUnreadIcon;



}
