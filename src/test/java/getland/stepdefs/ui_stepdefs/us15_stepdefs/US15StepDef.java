package getland.stepdefs.ui_stepdefs.us15_stepdefs;

import getland.pages.US15Page;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US15StepDef {
    US15Page us15Page=new US15Page();

    @Given("User login as a manager")
    public void UserLoginAsAManager() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        us15Page.login.click();
        us15Page.email.sendKeys(ConfigReader.getProperty("adminEmail"));
        us15Page.password.sendKeys(ConfigReader.getProperty("adminPassword"));
        us15Page.loginSubmit.click();
    }



    @When("Navigate to the Categories page")
    public void navigateToTheCategoriesPage() {

        us15Page.categories.click();


    }
    @When("Click on the {string} button")
    public void clickOnTheButton(String arg0) {
        us15Page.categoriesAddNew.click();

    }

    @And("Enter category name in the input field")
    public void enterCategoryNameInTheInputField() {
        us15Page.categoriesTitle.sendKeys("Housemms");
        us15Page.categoriesSequence.sendKeys("1");
        us15Page.categoriesIcon.sendKeys("h");
        us15Page.categoriesActive.click();



    }

    @Then("Click on the Save button Categories")
    public void clickOnTheSaveButtonCategories() {
        us15Page.categoriesCreate.click();
    }

    @Then("Verify that categories has created")
    public void verifyThatCategoriesHasCreated() {
        us15Page.VerifyCategoriesCreated.isDisplayed();
    }

    @Then("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }

    @When("Navigate to the Advert Types page")
    public void navigateToTheAdvertTypesPage() {
        us15Page.advertTypes.click();
    }


    @When("Click on the Add New Advert Type button")
    public void clickOnTheAddNewAdvertTypeButton() {
        us15Page.advertTypesAddNew.click();




    }

    @When("Enter advert type name in the input field")
    public void enterAdvertTypeNameInTheInputField() {
        us15Page.advertTypesTitle.sendKeys("Propert");
    }

    @When("Click on the Save button Advert Type")
    public void clickOnTheSaveButtonAdvertType() {
        us15Page.advertTypesCreateButton.click();
    }

    @Then("Verify that new Advert Type has created")
    public void verifyThatNewAdvertTypeHasCreated() {
        us15Page.advertTypesVerifyCreated.isDisplayed();
    }

    @When("Navigate to the User Management page")
    public void navigateToTheUserManagementPage() {
        us15Page.users.click();
    }

    @When("Enter a username or email in the search bar")
    public void enterAUsernameOrEmailInTheSearchBar() {
        us15Page.usersSearchBox.sendKeys("John",Keys.ENTER);
        
    }

    @When("Verify that username is exist")
    public void verifyThatUsernameIsExist() {
        us15Page.usersVerifyName.isDisplayed();
    }

    @When("Search for the user")
    public void searchForTheUser() {
        us15Page.usersSearchBox.sendKeys("John");
        us15Page.usersSearchBoxSubmit.click();
    }

    @When("Click the Edit button next to the user")
    public void clickTheEditButtonNextToTheUser(String arg0) {
        us15Page.usersEdit.click();
    }

    @When("Modify user details name")
    public void modifyUserDetailsName() {
        us15Page.usersEditFirstName.sendKeys("Johns Doe");
        us15Page.usersEditUpdate.click();

    }

    @When("Click Save modified user")
    public void clickSaveModifiedUser() {
        us15Page.usersErrorMessages.isDisplayed();
    }

    @When("Select a new role from the dropdown")
    public void selectANewRoleFromTheDropdown() {
        ReusableMethods.ddmIndex(us15Page.usersAdminSelect,2);
    }

    @When("Navigate to the Tour Request page")
    public void navigateToTheTourRequestPage() {
        us15Page.tourRequests.click();

    }

    @When("Check the list of Tour Requests")
    public void checkTheListOfTourRequests() {
        us15Page.tourRequestsApprovedVerify.isDisplayed();
    }
}
