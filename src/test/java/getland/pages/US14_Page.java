package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US14_Page {

    public US14_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//*[@class='submit-button btn btn-secondary']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Back to Site']")
    public WebElement backToSiteButton;

    @FindBy(xpath = "(//*[@class='user-pic'])[1]")
    public  WebElement profileButton;


    //US08 Page

    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public  WebElement myAdvertsLink;

    @FindBy(xpath = "(//div[@class='text'])[1]")
    public  WebElement firstAdvert; //görüntülenecek ilan

    @FindBy(xpath = "(//div[@class='text'])[2]")
    public  WebElement secondAdvert; //düzenlenecek ilan

    @FindBy(xpath = "(//div[@class='text'])[3]")
    public  WebElement thirdAdvert; //silinecek ilan

    @FindBy(xpath = "(//*[@class='btn-link btn btn-primary'])[4]")
    public  WebElement advertEditButton;

    @FindBy(tagName = "h1")
    public  WebElement editAdvertTitle;

    @FindBy(xpath = "//*[@class='dynamic-button auto-wide btn btn-primary']")
    public  WebElement editAdvertUpdateButton;

    @FindBy(xpath = "//*[.='Advert updated successfully']")
    public  WebElement editAdvertSuccessMessage;

    @FindBy(xpath = "(//*[@class='btn-link btn btn-primary'])[5]")
    public  WebElement advertDeleteButton;

    @FindBy(xpath = "(//*[@class='p-button-label p-c'])[2]")
    public  WebElement advertDeleteYesButton;

    @FindBy(xpath = "//*[.='']")
    public  WebElement advertDeleteMessage;

    @FindBy(xpath = "(//*[.='Date Published'])[3]")
    public  WebElement datePublishedTitle;

    @FindBy(xpath = "(//*[.='Status'])[3]")
    public  WebElement statusTitle;

    @FindBy(xpath = "(//*[.='View-Like-Tour'])[3]")
    public  WebElement viewLikeTourTitle;

    @FindBy(xpath = "(//td[@class='my-custom-column'])[1]")
    public  WebElement datePublishedIcon;

    @FindBy(xpath = "(//span[@class='p-tag p-component'])[1]")
    public  WebElement statusIcon ;

    @FindBy(xpath = "(//*[@class='icons-wrapper'])[1]")
    public  WebElement viewLikeTourIcon;


    //US13 page

    @FindBy(xpath = "//*[.='My Tour Requests']")
    public WebElement myTourRequestsLink;

    @FindBy(xpath = "//button[@class='nav-link']")
    public WebElement myResponsesPage;

    @FindBy(xpath = "(//div[@class='text'])[2]")
    public  WebElement randevuIstegiGoruntuleme;

    @FindBy(xpath = "//button[@class='btn-link approve-button btn btn-primary']")
    public WebElement randevuOnayButonu;

    @FindBy(xpath = "(//span[@class='p-button-label p-c'])[2]")
    public WebElement randevuOnayYesButonu;

    @FindBy(xpath = "//button[@class='btn-link decline-button btn btn-primary']")
    public WebElement randevuRedButonu;

    @FindBy(xpath = "(//span[@class='p-button-label p-c'])[2]")
    public WebElement randevuRedYesButonu;

    @FindBy(xpath = "//div[@class='p-toast-message-content']")
    public WebElement randevuApprovedAndDeclineMessage;


    //US14 Page
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@class=' text-decoration-none']")
    public WebElement aramaSayfasindaCikanIlkIlaninLinki;

    @FindBy(xpath = "//*[@id='tourDate']")
    public WebElement tourDateSelectBox;

    @FindBy(xpath = "//select[@id='tourTime']")
    public WebElement tourTimeDDM;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitTourRequestButton;

    @FindBy(xpath = "//*[@class='advert-details-tour-request-container container']")
    public WebElement scheduleTourTable;

    @FindBy(xpath = "//*[@class='p-toast-message-content']")
    public WebElement tourRequestCreatedSuccessfullyMassage;

    @FindBy(xpath = "//*[@class='btn-link btn btn-primary']")
    public WebElement myRequestsDeleteButton;

    @FindBy(xpath = "(//span[@class='p-button-label p-c'])[2]")
    public WebElement myRequestsDeleteYesButton;

    @FindBy(xpath = "//button[@class='nav-link active']")
    public WebElement myRequestsPage;

    @FindBy(xpath = "(//span[@class='p-tag p-component'])[1]")
    public WebElement myRequestsStatusIcon;

    @FindBy(xpath = "//*[@class='p-toast-message-content']")
    public WebElement tourRequestErrorMassage;







}
