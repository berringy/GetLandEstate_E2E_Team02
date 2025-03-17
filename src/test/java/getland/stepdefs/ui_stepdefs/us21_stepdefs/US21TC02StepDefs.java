package getland.stepdefs.ui_stepdefs.us21_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import getland.pages.US21_AdminContactMessagesDisplayPage;
import getland.utilities.*;

public class US21TC02StepDefs {

    US21_AdminContactMessagesDisplayPage messageDisplayPage = new US21_AdminContactMessagesDisplayPage();


    @Given("User is on the same page")
    public void userIsOnTheSamePage() {
        Driver.getDriver().navigate().refresh();
    }

    @When("User clicks on the -Sil- icon")
    public void userClicksOnTheSilIcon() {

        WaitUtils.waitForVisibility(messageDisplayPage.messageDate,20);
        String date=messageDisplayPage.messageDate.getText().trim();

        messageDisplayPage.deleteMessageIcon.click();

        WaitUtils.waitForVisibility(messageDisplayPage.messageDate,20);
        //Assert.assertNotEquals("Mesaj silindi", messageDisplayPage.messageDate.getText().trim(), date);
        //WaitUtils.waitFor(1);
    }



}




