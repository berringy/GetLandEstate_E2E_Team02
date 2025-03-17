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

public class us09_tc04_stepdefs {

    WebDriver driver;
    US05_LoginPage us05LoginPage = new US05_LoginPage();
    US09_AdvertsPage us09AdvertsPage = new US09_AdvertsPage();

    @Given("The admin is logged into the system 04.")
    public void theAdminIsLoggedIntoTheSystem() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        ReusableMethods.visibleWait(us05LoginPage.NavigateLoginPageButton,1);
        us05LoginPage.NavigateLoginPageButton.click();
        us05LoginPage.EmailField.sendKeys(ConfigReader.getProperty("adminEmail"));
        us05LoginPage.PasswordField.sendKeys(ConfigReader.getProperty("adminPassword"));
        us05LoginPage.LoginButton.click();
        ReusableMethods.waitForSecond(2);
    }

    @When("Click on the Adverts button 04.")
    public void clickOnTheAdvertsButton() {
        us09AdvertsPage.AdvertsPageNavigate.click();
    }

    @When("Enter a keyword 'ev' in the search field 04.")
    public void enterAKeywordEvInTheSearchField() {
        us09AdvertsPage.AdvertsSearchField.sendKeys("ev");
    }

    @When("Click on the Search button 04.")
    public void clickOnTheSearchButton() {
        us09AdvertsPage.AdvertsSearchButton.click();
        ReusableMethods.waitForSecond(2);
    }

    @When("Click on the 'House' advert 04.")
    public void clickOnTheHouseAdvert() {
        us09AdvertsPage.AdvertPenButton.click();
    }

    @When("Select 'Activated' from dropdown menu bottom of the 'status' title 04.")
    public void selectActivatedFromDropdownMenuBottomOfTheStatusTitle() {
        us09AdvertsPage.ActivatedDropdownButton.click();
        ReusableMethods.waitForSecond(2);
    }

    @And("Click on the Update button for Activated 04.")
    public void clickOnTheUpdateButtonForActivated() {
        JSUtils.JSscrollIntoView(us09AdvertsPage.AdvertUpdateButton);
        us09AdvertsPage.AdvertUpdateButton.click();
    }

    @And("System displays update success message for Activated 04.")
    public void systemDisplaysUpdateSuccessMessageForActivated() {
        ReusableMethods.visibleWait(us09AdvertsPage.AdvertMessageBox,2);
        Assert.assertTrue(us09AdvertsPage.AdvertMessageBox.getText().contains("successfully"));
    }

    @When("Select 'Rejected' from dropdown menu bottom of the 'status' title 04.")
    public void selectRejectedFromDropdownMenuBottomOfTheStatusTitle() {
        JSUtils.JSscrollIntoView(us09AdvertsPage.AdvertsSearchField);
        us09AdvertsPage.AdvertsSearchField.sendKeys("ev");
        us09AdvertsPage.AdvertsSearchButton.click();
        ReusableMethods.waitForSecond(2);
        us09AdvertsPage.AdvertPenButton.click();
        us09AdvertsPage.RejectedDropdownButton.click();
    }

    @And("Click on the Update button for Rejected 04.")
    public void clickOnTheUpdateButtonForRejected() {
        JSUtils.JSscrollIntoView(us09AdvertsPage.AdvertUpdateButton);
        us09AdvertsPage.AdvertUpdateButton.click();
    }

    @Then("System displays update success message for Rejected 04.")
    public void systemDisplaysUpdateSuccessMessageForRejected() {
        ReusableMethods.visibleWait(us09AdvertsPage.AdvertMessageBox,2);
        Assert.assertTrue(us09AdvertsPage.AdvertMessageBox.getText().contains("successfully"));

    }

    @Then("Close the browser 04.")
    public void close_the_browser() {
        Driver.closeDriver();
    }
}
