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

public class us05_tc07_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    US05_UsersPage us05UsersPage = new US05_UsersPage();

    @Given("Navigate to the login page 07.")
    public void navigateToTheLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
    }

    @When("Enter valid admin email and password 07.")
    public void enterValidAdminEmailAndPassword() {
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @When("Click on the login button 07.")
    public void clickOnTheLoginButton() {
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(5);
    }

    @When("Click on the Users button to navigate Users page 07.")
    public void clickOnTheUsersButtonToNavigateUsersPage() {
        ReusableMethods.waitForSecond(1);
        us05UsersPage.UsersPageNavigate.click();
    }

    @When("Select a user and click the pen button at the bottom of the Action title 07.")
    public void selectAUserAndClickThePenButtonAtTheBottomOfTheActionTitle() {
        us05UsersPage.PenButton.click();
    }

    @When("Click on the menu at the bottom of the Roles title 07.")
    public void clickOnTheMenuAtTheBottomOfTheRolesTitle() {
        us05UsersPage.RolesDropdownMenu.click();
        ReusableMethods.waitForSecond(1);
    }

    @When("Select the Admin role 07.")
    public void selectTheAdminRole() {
        us05UsersPage.AdminRole.click();
    }

    @When("Click on the Update button for Admin 07.")
    public void clickOnTheUpdateButtonForAdmin() {
        us05UsersPage.UpdateButton.click();
    }

    @When("System displays fail message for Admin 07.")
    public void systemDisplaysFailMessageForAdmin() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("cannot be updated"));
    }

    @When("Select the Customer role 07.")
    public void selectTheCustomerRole() {
        us05UsersPage.RolesDropdownMenu.click();
        ReusableMethods.waitForSecond(1);
        us05UsersPage.CustomerRole.click();
    }

    @When("Click on the Update button for Customer 07.")
    public void clickOnTheUpdateButtonForCustomer() {
        us05UsersPage.UpdateButton.click();
    }

    @When("System displays fail message for Customer 07.")
    public void systemDisplaysFailMessageForCustomer() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("cannot be updated"));

    }

    @When("Select the Manager role 07.")
    public void selectTheManagerRole() {
        us05UsersPage.RolesDropdownMenu.click();
        ReusableMethods.waitForSecond(1);
        us05UsersPage.ManagerRole.click();
    }

    @Then("Click on the Update button for Manager 07.")
    public void clickOnTheUpdateButtonForManager() {
        us05UsersPage.UpdateButton.click();
    }

    @And("System displays fail message for Manager 07.")
    public void systemDisplaysFailMessageForManager() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("cannot be updated"));
    }
    @And("Close the browser 07.")
    public void CloseTheBrowserOne() {
        Driver.closeDriver();
    }
}
