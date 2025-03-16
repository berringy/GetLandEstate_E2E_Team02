package getland.stepdefs.ui_stepdefs.us01_stepdefs;

import getland.pages.GetlandEstateRegisterPage;
import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;

public class US01TC04Stepdefs {
    GetlandEstateRegisterPage getlandEstateRegisterPage = new GetlandEstateRegisterPage();
    @And("Enters the other invalid email in the email field")
    public void entersTheOtherInvalidEmailInTheEmailField() {
        getlandEstateRegisterPage.email.sendKeys(ConfigReader.getProperty("invalidEmail2"));
    }


}
