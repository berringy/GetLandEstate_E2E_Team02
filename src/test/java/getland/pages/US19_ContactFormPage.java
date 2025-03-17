package getland.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import getland.utilities.*;

public class US19_ContactFormPage {
    WebDriver driver;

    public US19_ContactFormPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//iframe[contains(@src,'google.com/maps/embed')]")
    public  WebElement iframeField;

    @FindBy(xpath = "//input[@id='firstName']")
    public  WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    public  WebElement lastNameField;

    @FindBy(xpath = "//input[@id='email']")
    public  WebElement emailField;

    @FindBy(xpath = "//textarea[@id='message']")
    public  WebElement messageField;

    @FindBy(xpath = "//button[contains(@class, 'dynamic-button')]")
    public WebElement sendButton;

    @FindBy(xpath = "//div[contains(@class, 'language-dropdown')]")
    public WebElement languageButton;

    @FindBy(xpath = "//img[contains(@src, 'tr.png')][1]")
    public WebElement turkishButton;

    @FindBy(xpath = "//a[@href='/contact'][1]")
    public WebElement contactButton;

    @FindBy(xpath = "//div[@class='p-toast-detail']")
    public WebElement confirmationMessage;

    @FindBy(xpath = "(//div[contains(@class, 'invalid-feedback')])[1]") //contains "is required"
    public WebElement feedbackFirstName;

    @FindBy(xpath = "(//div[contains(@class, 'invalid-feedback')])[2]")
    public WebElement feedbackLastName;

    @FindBy(xpath = "(//div[contains(@class, 'invalid-feedback')])[3]")
    public WebElement feedbackEmail;

    @FindBy(xpath = "(//div[contains(@class, 'invalid-feedback')])[4]")
    public WebElement feedbackMessageField;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/dashboard/contact-messages']")
    public WebElement contactMessagesLink;



    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
}
