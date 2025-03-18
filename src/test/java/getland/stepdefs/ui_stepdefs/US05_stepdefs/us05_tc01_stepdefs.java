package getland.stepdefs.ui_stepdefs.US05_stepdefs;

import getland.pages.US05_Pages.US05_LoginPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.ReusableMethods;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class us05_tc01_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();

    @Given("Navigate to the login page.")
    public void navigate_to_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();

    }
    @When("Enter valid admin email.")
    public void enter_valid_admin_email() {
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));

    }
    @When("Enter valid admin password.")
    public void enter_valid_admin_password() {
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
    @Then("Click on the login button.")
    public void click_on_the_login_button() {
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(5);

    }
    @And("Admin is logged in and redirected to the dashboard page.")
    public void adminIsLoggedInAndRedirectedToTheDashboardPage() {
       String actualURL = Driver.getDriver().getCurrentUrl();
       Assert.assertTrue("/dashboard", Objects.requireNonNull(actualURL).contains("/dashboard"));
        }
    @And ("Close the browser.")
    public void CloseTheBrowserOne() {
        Driver.closeDriver();
    }
    }
