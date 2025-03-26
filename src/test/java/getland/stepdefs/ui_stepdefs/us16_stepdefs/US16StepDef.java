
package getland.stepdefs.ui_stepdefs.us16_stepdefs;


import getland.pages.US16Page;
import getland.utilities.ReusableMethods;
import io.cucumber.java.en.When;

public class US16StepDef {
    US16Page us16Page=new US16Page();

    @When("Navigate to the report generation page")
    public void NavigateToTheReportGenerationPage() {
        us16Page.reports.click();





    }

    @When("wait two seconds")
    public void waitTwoSeconds() {
        ReusableMethods.waitForSecond(2);
    }

    @When("Select filters: start date, end date, category, advert type, and status")
    public void selectFiltersStartDateEndDateCategoryAdvertTypeAndStatus() {
        us16Page.reportsAdvertsStartDate.sendKeys("01-01-2025");
        us16Page.reportsAdvertsEndDate.sendKeys("01-03-2025");
       ReusableMethods.ddmIndex(us16Page.reportsAdvertsCategory,1);
       ReusableMethods.ddmIndex(us16Page.reportsAdvertsAdvertType,1);
       ReusableMethods.ddmIndex(us16Page.reportsAdvertsStatus,1);


    }

    @When("Click Generate Adverts Report")
    public void clickGenerateAdvertsReport() {
        us16Page.reportsUsersReportsCreate.click();
        ReusableMethods.takeScreenShot();

        us16Page.reportsTourAdvertsVerify.isDisplayed();

    }


    @When("Select Popular Ads report type")
    public void selectPopularAdsReportType() {
        us16Page.reportsMostPopularPropertiesAmount.sendKeys("1");
    }

    @When("Click Generate Most Popular Properties Report")
    public void clickGenerateMostPopularPropertiesReport() {
        us16Page.reportsPropertiesReportsCreate.click();
    }

    @When("Select users role: Admin")
    public void selectUsersRoleAdmin() {
        ReusableMethods.ddmIndex(us16Page.reportsUsersSelectRoles,1);

    }

    @When("Click Generate users")
    public void clickGenerateUsers() {
        us16Page.reportsUsersReportsCreate.click();

        us16Page.reportsUsersSelectRolesVerify.isDisplayed();

    }

    @When("Select Tour Requests report type")
    public void selectTourRequestsReportType() {

        us16Page.reportsTourRequestsStartDate.sendKeys("01-01-2025");
        us16Page.reportsTourRequestsEndDate.sendKeys("01-03-2025");
       ReusableMethods.ddmIndex(us16Page.reportsTourRequestsStatus,1);

    }

    @When("Click Generate Tour Requests")
    public void clickGenerateTourRequests() {

        us16Page.reportsTourRequestsReportsCreate.click();
        us16Page.reportsTourAdvertsVerify.isDisplayed();
    }
}
