package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GetandLandPage {
    public GetandLandPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement anasayfaloginButonu;

    @FindBy(xpath = "//input[@placeholder='Email'] ")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Enter password'] ")
    public WebElement password;

    @FindBy(xpath = "//button[@class='submit-button btn btn-secondary'] ")
    public WebElement loginButonu;

    @FindBy(xpath = "/html/body/div/div[1]/nav/div/div[2]/div/div/img")
    public WebElement anasayfaLogo;

    @FindBy(xpath = "//div[.='Profile updated successfully']")
    public WebElement errorText;

    @FindBy(xpath = "//div[@class='form-feedback invalid-feedback']")
    public WebElement invalidMailText;


    @FindBy(xpath = "/html/body/div/div[1]/nav/div/div[2]/div/div/div/div/a[1]/span[1]")
    public WebElement myProfilebutonu;


    @FindBy(xpath = "/html/body/div/div[1]/nav/div/div[2]/div/div/div/div/a[5]")
    public WebElement logoutbutonu;


    @FindBy(xpath = "//button[@aria-label='Yes']")
    public WebElement logoutyesbutonu;


    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailGüncelleme;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[3]/div/div[1]/div/div/div[1]/div/form/div[5]/button")
    public WebElement updateButton;


    @FindBy(xpath = "/html/body/div/div[1]/div/div[3]/ul/li[2]/button/p")
    public WebElement changePassword;

    @FindBy(xpath = "//input[@placeholder='Current Password']")
    public WebElement currentpassword;

    @FindBy(xpath = "//input[@placeholder='New Password']")
    public WebElement newpassword;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement confirmpassword;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[3]/div/div[2]/div/div/div[2]/div/form/div[4]/button")
    public WebElement changebutton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[3]/ul/li[3]/button/p")
    public WebElement profilephoto;

    @FindBy(xpath = "//button[@class='select-button btn btn-primary']")
    public WebElement selectbutton;

    @FindBy(xpath = "//button[@class='edit-button btn btn-primary']")
    public WebElement editbutton;

    @FindBy(xpath = "//button[@class='done-button btn btn-primary']")
    public WebElement donebutton;

    @FindBy(xpath = "//button[@class='save-button btn btn-secondary']")
    public WebElement savebutton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[3]/ul/li[4]/button/p")
    public WebElement deleteaccount;

    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    public WebElement deleteaccountbox;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[3]/div/div[4]/div/div/div[2]/div/form/div[2]/button")
    public WebElement deleteaccountbutton;

    @FindBy(xpath = "//button[@aria-label='Yes']")
    public WebElement yesbutton;

    @FindBy(xpath = "/html/body/div/div[1]/nav/div/div[2]/div/div/div/div/div/h5")
    public WebElement customerisim;

}

