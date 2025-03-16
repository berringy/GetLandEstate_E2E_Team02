package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Us01TC09Stepdefs {

    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();

    @Then("Verify that the Submit Register button is not clickable")
    public void verifyThatTheSubmitRecordButtonIsNotClickable() {
        Assert.assertFalse(getlandEstateRegisterPage.registerSubmitButton.isEnabled());
    }
}
