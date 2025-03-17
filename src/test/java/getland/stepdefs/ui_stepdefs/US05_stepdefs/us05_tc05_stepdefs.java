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

public class us05_tc05_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    US05_UsersPage us05UsersPage = new US05_UsersPage();

    @Given("Navigate to the login page 05.")
    public void navigateToTheLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
    }

    @When("Enter valid admin email and password 05.")
    public void enterValidAdminEmailAndPassword() {
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @When("Click on the login button 05.")
    public void clickOnTheLoginButton() {
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(5);
    }

    @When("Click on the Users button to navigate Users page 05.")
    public void clickOnTheUsersButtonToNavigateUsersPage() {
        ReusableMethods.waitForSecond(1);
        us05UsersPage.UsersPageNavigate.click();
    }

    @When("Select a user and click the pen button at the bottom of the Action title 05.")
    public void selectAUserAndClickThePenButtonAtTheBottomOfTheActionTitle() {
        ReusableMethods.waitForSecond(2);
        us05UsersPage.PenButton.click();
    }

    @Then("Click on the Update button 05.")
    public void clickOnTheUpdateButton() {
        us05UsersPage.UpdateButton.click();
    }

    @Then("System displays fail message 05.")
    public void systemDisplaysFailMessage() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("cannot be updated."));
    }
    @And("Close the browser 05.")
    public void CloseTheBrowserOne() {
        Driver.closeDriver();
    }
}
