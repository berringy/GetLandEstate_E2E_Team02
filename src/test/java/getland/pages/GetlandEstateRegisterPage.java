package getland.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import getland.utilities.Driver;


public class GetlandEstateRegisterPage {


    public GetlandEstateRegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[@href='/register']")
    public WebElement registerButton;

    @FindBy (xpath = "//input [@name='firstName']")
    public WebElement firstName;

    @FindBy (xpath = "//input [@name='lastName']")
    public WebElement lastName;

    @FindBy (xpath = "//input [@name='phone']")
    public WebElement phone;

    @FindBy (xpath = "//input [@name='email']")
    public WebElement email;

    @FindBy (xpath = "//input [@name='password']")
    public WebElement password;

    @FindBy (xpath = " //input [@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='terms']")
    public WebElement termsClick;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//span[@class='p-toast-summary']")
    public WebElement successMessage;


    @FindBy(xpath = "(//*[@class='form-feedback invalid-feedback'])[1]")
    public WebElement firstNameFormFeedback;

    @FindBy(xpath = "(//*[@class='form-feedback invalid-feedback'])[2]")
    public WebElement lastNameFormFeedback;

    @FindBy(xpath = "(//*[@class='form-feedback invalid-feedback'])[3]")
    public WebElement phoneNumberFormFeedback;

    @FindBy(xpath = "(//*[@class='form-feedback invalid-feedback'])[4]")
    public WebElement emailFormFeedback;

    @FindBy(xpath = "(//*[@class='form-feedback invalid-feedback'])[5]")
    public WebElement passwordFormFeedback;

    @FindBy(xpath = "(//*[@class='form-feedback invalid-feedback'])[6]")
    public WebElement confirmPasswordFormFeedback;




}
