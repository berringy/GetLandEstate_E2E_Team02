package getland.pages.US05_Pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05_LoginPage {

    public US05_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        // Sayfa elementlerini tanımlıyoruz
        @FindBy(xpath = "//a[@href='/login']")
        public WebElement NavigateLoginPageButton;

        @FindBy(xpath = "//input[@type='text']")
        public WebElement EmailField;

        @FindBy(xpath = "//input[@type='password']")
        public WebElement PasswordField;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement LoginButton;

        @FindBy(xpath = "//div[@class='p-toast-message-text']")
        public WebElement ErrorMessage;



    }
