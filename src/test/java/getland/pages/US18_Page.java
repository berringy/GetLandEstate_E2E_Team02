package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US18_Page {
    public US18_Page(){
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

    @FindBy(xpath = "//*[.='My Tour Requests']")
    public WebElement myTourRequestsLink;

    @FindBy(xpath = "//button[@class='nav-link']")
    public WebElement myResponsesPage;

    @FindBy(xpath = "(//div[@class='text'])[3]")
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

    @FindBy(xpath = "//*[@class='p-toast-message-content']")
    public WebElement tourRequestErrorMassage;

}
