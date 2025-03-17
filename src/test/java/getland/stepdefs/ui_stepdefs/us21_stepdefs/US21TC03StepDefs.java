package getland.stepdefs.ui_stepdefs.us21_stepdefs;

import io.cucumber.java.en.And;
import getland.pages.US21_AdminContactMessagesDisplayPage;
import getland.utilities.*;

public class US21TC03StepDefs {

    US21_AdminContactMessagesDisplayPage messageDisplayPage = new US21_AdminContactMessagesDisplayPage();

    @And("User clicks on the -Read- icon")
    public void userClicksOnTheReadIcon() {
        WaitUtils.waitFor(1);
        messageDisplayPage.markAsReadIcon.click();
        WaitUtils.waitFor(1);
        messageDisplayPage.markAsUnreadIcon.click();
        WaitUtils.waitFor(2);

    }
}




