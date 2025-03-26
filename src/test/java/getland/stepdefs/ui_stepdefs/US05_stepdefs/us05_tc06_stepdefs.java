package getland.stepdefs.ui_stepdefs.US05_stepdefs;

import getland.pages.US05_Pages.US05_LoginPage;
import getland.pages.US05_Pages.US05_UsersPage;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.JSUtils;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class us05_tc06_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    US05_UsersPage us05UsersPage = new US05_UsersPage();

    @Given("Navigate to the login page 06.")
    public void navigateToTheLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
    }

    @When("Enter valid admin email and password 06.")
    public void enterValidAdminEmailAndPassword() {
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @When("Click on the login button 06.")
    public void clickOnTheLoginButton() {
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(5);
    }

    @When("Click on the Users button to navigate Users page 06.")
    public void clickOnTheUsersButtonToNavigateUsersPage() {
        ReusableMethods.waitForSecond(1);
        us05UsersPage.UsersPageNavigate.click();
    }

    @When("Select a user and click the pen button at the bottom of the Action title 06.")
    public void selectAUserAndClickThePenButtonAtTheBottomOfTheActionTitle() {
        us05UsersPage.SearchField.click();
        us05UsersPage.SearchField.sendKeys("Mayola");
        us05UsersPage.SearchSendField.click();
        ReusableMethods.waitForSecond(2);
        us05UsersPage.PenButton.click();
    }

    @When("Click on the menu at the bottom of the Roles title 06.")
    public void clickOnTheMenuAtTheBottomOfTheRolesTitle() {
        us05UsersPage.RolesDropdownMenu.click();
        ReusableMethods.waitForSecond(1);
    }

    @When("Select the Admin role 06.")
    public void selectTheAdminRole() {
        us05UsersPage.AdminRole.click();
    }

    @When("Click on the Update button for Admin 06.")
    public void clickOnTheUpdateButtonForAdmin() {
        us05UsersPage.UpdateButton.click();
    }

    @When("System displays success message for Admin 06.")
    public void systemDisplaysSuccessMessageForAdmin() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("successfully"));
    }

    @When("Select the Customer role 06.")
    public void selectTheCustomerRole() {
        us05UsersPage.SearchField.click();
        us05UsersPage.SearchField.sendKeys("Mayola");
        us05UsersPage.SearchSendField.click();
        ReusableMethods.waitForSecond(2);
        us05UsersPage.PenButton.click();
        us05UsersPage.CustomerRole.click();
    }

    @When("Click on the Update button for Customer 06.")
    public void clickOnTheUpdateButtonForCustomer() {
        us05UsersPage.UpdateButton.click();
    }

    @When("System displays success message for Customer 06.")
    public void systemDisplaysSuccessMessageForCustomer() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("successfully"));
    }

    @When("Select the Manager role 06.")
    public void selectTheManagerRole() {
        us05UsersPage.SearchField.click();
        us05UsersPage.SearchField.sendKeys("Mayola");
        us05UsersPage.SearchSendField.click();
        ReusableMethods.waitForSecond(2);
        us05UsersPage.PenButton.click();
        us05UsersPage.ManagerRole.click();
    }

    @Then("Click on the Update button for Manager 06.")
    public void clickOnTheUpdateButtonForManager() {
        us05UsersPage.UpdateButton.click();
    }

    @And("System displays success message for Manager 06.")
    public void systemDisplaysSuccessMessageForManager() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("successfully"));
    }
    @And("Close the browser 06.")
    public void CloseTheBrowserOne() {
        Driver.closeDriver();
    }
}
