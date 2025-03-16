package getland.stepdefs.ui_stepdefs.us21_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import getland.pages.US21_AdminContactMessagesDisplayPage;
import getland.utilities.*;

public class US21TC04StepDefs {

    US21_AdminContactMessagesDisplayPage messageDisplayPage = new US21_AdminContactMessagesDisplayPage();

    @When("User enters {string} into the search box")
    public void userEntersIntoTheSearchBox(String keyword) {
        WaitUtils.waitForVisibility(messageDisplayPage.searchBox, 10);
        Assert.assertTrue("Search box aktif degil!", messageDisplayPage.searchBox.isEnabled());
        messageDisplayPage.searchBox.sendKeys(keyword);
        WaitUtils.waitFor(1);
    }

    @And("User clicks the search button")
    public void userClicksTheSearchButton() {
        Assert.assertTrue("Search button aktif degil!", messageDisplayPage.searchButton.isEnabled());
        messageDisplayPage.searchButton.click();
        WaitUtils.waitFor(1);
    }

    @Then("Messages containing {string} should be displayed")
    public void messagesContainingShouldBeDisplayed(String keyword) throws InterruptedException {

        Assert.assertTrue(messageDisplayPage.messageContent.getText().contains(keyword));
        WaitUtils.waitFor(1);
        }
}