package getland.stepdefs.ui_stepdefs.US09_stepdefs;

import getland.pages.US05_Pages.US05_LoginPage;
import getland.pages.US09_Pages.US09_AdvertsPage;
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

public class us09_tc01_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    US09_AdvertsPage us09AdvertsPage = new US09_AdvertsPage();

    @Given("The admin is logged into the system 01.")
    public void theAdminIsLoggedIntoTheSystem() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(2);
    }

    @When("Click on the Adverts button 01.")
    public void clickOnTheAdvertsButton() {
        us09AdvertsPage.AdvertsPageNavigate.click();
    }

    @When("Enter a keyword 'ev' in the search field 01.")
    public void enterAKeywordInTheSearchField() {
        us09AdvertsPage.AdvertsSearchField.sendKeys("ev");
    }

    @When("Click on the Search button 01.")
    public void clickOnTheSearchButton() {
        us09AdvertsPage.AdvertsSearchButton.click();
        ReusableMethods.waitForSecond(2);
    }

    @Then("The system displays advertisements that match the entered keyword without fail message 01.")
    public void theSystemDisplaysAdvertisementsThatMatchTheEnteredKeyword() {
        JSUtils.JSscrollIntoView(us09AdvertsPage.AdvertTable);
        Assert.assertTrue(us09AdvertsPage.AdvertTable.isDisplayed());
    }

    @And("Close the browser 01.")
    public void closeTheBrowser() {
        Driver.closeDriver();
    }
}
