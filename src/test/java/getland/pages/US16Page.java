package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US16Page {

    public US16Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSubmit;


    @FindBy(xpath = "//span[.='Reports']")
    public WebElement reports;

    @FindBy(xpath = "(//input[@id='startDate'])[1]")
    public WebElement reportsAdvertsStartDate;

    @FindBy(xpath = "(//input[@id='startDate'])[2]")
    public WebElement reportsTourRequestsStartDate;

    @FindBy(xpath = "(//input[@id='endDate'])[1]")
    public WebElement reportsAdvertsEndDate;

    @FindBy(xpath = "(//input[@id='endDate'])[2]")
    public WebElement reportsTourRequestsEndDate;

    @FindBy(xpath = "(//select[@id='status'])[2]")
    public WebElement reportsTourRequestsStatus;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    public WebElement reportsAdvertsStatus;

    @FindBy(xpath = "//select[@id='category']")
    public WebElement reportsAdvertsCategory;

    @FindBy(xpath = "//select[@id='type']")
    public WebElement reportsAdvertsAdvertType;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[1]")
    public WebElement reportsAdvertsReportsCreate;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[2]")
    public WebElement reportsPropertiesReportsCreate;

    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[3]")
    public WebElement reportsUsersReportsCreate;

    @FindBy(xpath = "//select[@id='role']")
    public WebElement reportsUsersSelectRoles;

    @FindBy(xpath = "//*[@class='p-toast-message p-toast-message-error p-toast-message-enter-done']")
    public WebElement reportsUsersSelectRolesVerify;





    @FindBy(xpath = "(//div[@class='admin-report-button-wrapper'])[4]")
    public WebElement reportsTourRequestsReportsCreate;

    @FindBy(xpath = "//*[@class='p-toast p-component p-toast-top-right p-ripple-disabled']")
    public WebElement reportsTourAdvertsVerify;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement reportsMostPopularPropertiesAmount;










}
