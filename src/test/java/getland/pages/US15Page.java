package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US15Page {

    public US15Page() {
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

    @FindBy(xpath = "//span[.='Categories']")
    public WebElement categories;
    @FindBy(xpath = "//button[@title='Add New']")
    public WebElement categoriesAddNew;
    @FindBy(xpath = "//input[@id='title']")
    public WebElement categoriesTitle;

    @FindBy(xpath = "//input[@id='seq']")
    public WebElement categoriesSequence;

    @FindBy(xpath = "//input[@id='category-switch']")
    public WebElement categoriesActive;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement categoriesCreate;

    @FindBy(xpath = "//span[.='Category created']")
    public WebElement VerifyCategoriesCreated;

    @FindBy(xpath = "//input[@id='icon']")
    public WebElement categoriesIcon;






    @FindBy(xpath = "//span[.='Advert Types']")
    public WebElement advertTypes;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement advertTypesSearchBox;

    @FindBy(xpath = "//button[@class='search-button btn btn-outline-secondary']")
    public WebElement advertTypesSearchBoxSubmit;
    @FindBy(xpath = "//button[@class='add-new-btn btn btn-primary']")
    public WebElement advertTypesAddNew;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement advertTypesTitle;

    @FindBy(xpath = "//span[@class='p-toast-summary']")
    public WebElement advertTypesVerifyCreated;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement advertTypesCreateButton;














    @FindBy(xpath = "//a[@href='/dashboard/users']")
    public WebElement users;
    @FindBy(xpath = "//*[.='Error']")
    public WebElement usersErrorMessage;

    @FindBy(xpath = "//select[@id='role']")
    public WebElement usersAdminSelect;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement usersSearchBox;
    @FindBy(xpath = "//*[@class='search-button btn btn-outline-secondary']")
    public WebElement usersSearchBoxSubmit;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[1]")
    public WebElement usersVerifyName;

    @FindBy(xpath = "(//button[@class='btn-link btn btn-primary'])[2]")
    public WebElement usersEdit;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement usersEditFirstName;

    @FindBy(xpath = "//button[@class='update-button btn btn-primary']")
    public WebElement usersEditUpdate;

    @FindBy(xpath = "//div[@class='p-toast-detail']")
    public WebElement usersErrorMessages;





















    @FindBy(xpath = "//a[@href='/dashboard/tour-requests']")
    public WebElement tourRequests;

    @FindBy(xpath = "//span[.='APPROVED']")
    public WebElement tourRequestsApprovedVerify;


    @FindBy(xpath = "//span[.='PENDING']")
    public WebElement tourRequestsPendingVerify;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement tourRequestsSearchBox;









}
