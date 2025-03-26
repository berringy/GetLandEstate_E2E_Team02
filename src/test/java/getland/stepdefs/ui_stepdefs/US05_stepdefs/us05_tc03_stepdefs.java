package getland.stepdefs.ui_stepdefs.US05_stepdefs;

import getland.pages.US05_Pages.US05_LoginPage;
import getland.pages.US05_Pages.US05_UsersPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class us05_tc03_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    US05_UsersPage us05UsersPage = new US05_UsersPage();

    @Given("Navigate to the login page as admin 03.")
    public void navigateToTheLoginPageAsAdmin_03() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
    }

    @When("Enter valid admin email and password 03.")
    public void enterValidAdminEmailAndPassword_03() {
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @And("Click on the login button as admin 03.")
    public void clickOnTheLoginButtonAsAdmin_03() {
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(5);
    }

    @Then("Navigate to the users page 03.")
    public void navigateToTheUsersPage_03() {
        ReusableMethods.waitForSecond(2);
        us05UsersPage.UsersPageNavigate.click();
    }

    @And("The system displays users with their details 03.")
    public void theSystemDisplaysUsersWithTheirDetails_03() {
        ReusableMethods.waitForSecond(1);
        Assert.assertTrue(us05UsersPage.UsersDetailTable.isDisplayed());
    }
    @And("Close the browser 03.")
    public void CloseTheBrowserOne() {
        Driver.closeDriver();
    }
}
