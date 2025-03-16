package getland.stepdefs.ui_stepdefs.us21_stepdefs;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;
import getland.pages.US21_AdminContactMessagesDisplayPage;
import getland.utilities.*;

public class US21TC05StepDefs {

    US21_AdminContactMessagesDisplayPage messageDisplayPage = new US21_AdminContactMessagesDisplayPage();

    @And("User clicks the filter button")
    public void userClicksTheFilterButton() {
        messageDisplayPage.filterButton.click();
    }

    @And("User selects start date {string}")
    public void userSelectsStartDate(String startDate) {
        WaitUtils.waitFor(1);
        messageDisplayPage.startDate.sendKeys(startDate);
    }

    @And("User selects end date {string}")
    public void userSelectsEndDate(String endDate) {
        messageDisplayPage.endDate.sendKeys(endDate);
        WaitUtils.waitFor(1);
    }

    @And("User selects message status {string}")
    public void userSelectsMessageStatus(String status) {
        WaitUtils.waitFor(1);
        Select statusDropdown = new Select(messageDisplayPage.selectMessageStatus);
        statusDropdown.selectByVisibleText(status);
    }

    @And("User clicks on the Apply button")
    public void userClicksOnTheApplyButton() {
        messageDisplayPage.applyFilterButton.click();
    }

}
