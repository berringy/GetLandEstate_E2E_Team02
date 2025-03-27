package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetLandEstatePage {




    public GetLandEstatePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-rr-ui-event-key='5']")
    public WebElement HomePageLoginButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement LoginPageEmailField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement LoginPagePasswordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LoginPageLoginButton;

    @FindBy(xpath = "//a[@title='Reports']")
    public WebElement ReportsDashboard;

    @FindBy(xpath ="(//input[@name='startDate'])[1]" )
    public WebElement AdvertsStartDate;

    @FindBy(xpath = "(//input[@id='endDate'])[1]")
    public WebElement AdvertEndDate;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[1]")
    public WebElement AdvertsReportCreate;

    @FindBy(xpath = "//div[.='Report successfully exported to excel file']")
    public WebElement ReportSuccessfullyDownloaded;

    @FindBy(id ="amount")
    public WebElement Amount;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[2]")
    public WebElement MostPopularPropertiesReportCreate;

   @FindBy(xpath = "//select[@name='role']")
    public WebElement UsersRole;

    @FindBy(xpath = "//select[@id='role']/option[@value='MANAGER']")
    public WebElement UsersRoleManager;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[3]")
    public WebElement UsersRoleReportCreate;

   @FindBy(xpath = "//div[.='Full authentication is required to access this resource']")
    public WebElement AuthenticationError;

    @FindBy(xpath = "(//input[@id='startDate'])[2]")
    public WebElement TourRequestsStartDate;

    @FindBy(xpath = "(//input[@id='endDate'])[2]")
    public WebElement TourRequestsEndDate;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[4]")
    public WebElement TourRequestsReportCreate;

    @FindBy(xpath = "//span[.='ContactMessages']")
    public WebElement ContactMessagesButton;

    @FindBy(xpath = "(//div[@class='accordion-item'])[1]")
    public WebElement ContactMessagesFirstMessage;

    @FindBy(xpath = "(//button[@class='message-delete-btn message-button btn btn-primary'])[1]")
    public  WebElement ContactMessagesDeleteButton;

    @FindBy(xpath = "//div[@class='admin-contact-message-container']")
    public WebElement ContactMessagesAll;

    @FindBy(xpath = "(//button[contains(@class, 'read-toggle-btn')])[1]")
    public WebElement MarkAsReadButton;

    @FindBy(xpath = "(//div[@class='accordion-item'])[5]")
    public WebElement ContactMessagesReadMessage;

    @FindBy(xpath = "(//div[@class='accordion-body'])[1]")
    public  WebElement ForColor;

    @FindBy(xpath = "//input[@class='search-input form-control']")
    public WebElement ContactMessagesSearchBox;

    @FindBy(xpath = "//input[@class='search-input form-control']")
    public WebElement ContactMessagesSearchButton;

    @FindBy(xpath = "//div[contains(@class, 'admin-contact-message-container')]")
    public WebElement searchContainer;

    @FindBy(xpath = "//button[@class='filter-button btn btn-primary']")
    public WebElement ContactMessagesFilterButton;

    @FindBy(id = "startDate")
    public WebElement ContactMessagesStartDate;

    @FindBy(id = "endDate")
    public WebElement ContactMessagesEndDate;

    @FindBy(xpath = "//button[@class='done-button modal-button btn btn-primary']")
    public WebElement ContactMessagesApplyButton;

    @FindBy(xpath = "//p[text()='Bu bir TEST mesajıdır.']")
    public WebElement ContactMessagesSentence;

    @FindBy(xpath = "//span[@class='active-filter-badge badge bg-primary']")
    public WebElement activeFilterBadge;






}
