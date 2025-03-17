package getland.stepdefs.ui_stepdefs.US05_stepdefs;

import com.github.javafaker.Faker;
import getland.pages.US05_Pages.US05_LoginPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class us05_tc02_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    Faker faker = new Faker();

    @Given("Navigate to the login page")
    public void navigate_to_the_login_page_02() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
    }
    @When("Enter valid admin email")
    public void enter_valid_admin_email_02() {
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
    }
    @When("Enter invalid admin password")
    public void enter_invalid_admin_password_02() {
        us05LoginPage.PasswordField.sendKeys(faker.internet().password(10,15));
    }
    @Then("Click on the login button")
    public void click_on_the_login_button_02() {
        us05LoginPage.LoginButton.click();
    }
    @Then("System displays error message")
    public void system_displays_error_message_02() {
        ReusableMethods.visibleWait(us05LoginPage.ErrorMessage,1);
        String expectedError = "Invalid email or password. Please check your credentials and try again.";
        Assert.assertTrue(us05LoginPage.ErrorMessage.getText().contains(expectedError));
    }
    @And("Close the browser 02.")
    public void CloseTheBrowserOne() {
        Driver.closeDriver();
    }
}
