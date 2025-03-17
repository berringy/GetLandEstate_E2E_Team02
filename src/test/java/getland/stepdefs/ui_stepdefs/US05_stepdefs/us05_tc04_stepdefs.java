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

public class us05_tc04_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    US05_UsersPage us05UsersPage = new US05_UsersPage();

    @Given("Navigate to the login page 04.")
    public void navigate_to_the_login_page_04() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
    }
    @When("Enter valid admin email and password 04.")
    public void enter_valid_admin_email_and_password_04() {
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
    @When("Click on the login button 04.")
    public void click_on_the_login_button_04() {
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(5);
    }
    @When("Click on the Users button to navigate Users page 04.")
    public void click_on_the_users_button_to_navigate_users_page_04() {
        ReusableMethods.waitForSecond(1);
        us05UsersPage.UsersPageNavigate.click();
    }
    @When("Select a user and click the pen button at the bottom of the Action title 04.")
    public void select_a_user_and_click_the_pen_button_at_the_bottom_of_the_action_title_04() {
        us05UsersPage.SearchField.click();
        us05UsersPage.SearchField.sendKeys("Mayola");
        us05UsersPage.SearchSendField.click();
        ReusableMethods.waitForSecond(2);
        us05UsersPage.PenButton.click();
    }
    @Then("Click on the Update button 04.")
    public void click_on_the_update_button() {
        us05UsersPage.UpdateButton.click();
    }
    @Then("System displays success message 04.")
    public void system_displays_message() {
        ReusableMethods.visibleWait(us05UsersPage.MessageBox,2);
        Assert.assertTrue(us05UsersPage.MessageBox.getText().contains("successfully"));
    }
    @And("Close the browser 04.")
    public void CloseTheBrowserOne() {
        Driver.closeDriver();
    }
}
