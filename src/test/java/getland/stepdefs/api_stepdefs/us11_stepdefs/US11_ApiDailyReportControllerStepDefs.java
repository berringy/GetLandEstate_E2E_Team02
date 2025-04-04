package getland.stepdefs.api_stepdefs.us11_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getland.stepdefs.api_stepdefs.us11_stepdefs.US11_ApiAdminHook.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US11_ApiDailyReportControllerStepDefs {

    Response response;


    @Given("Get daily reports için URL hazırlanır.")
    public void getDailyReportsIçinURLHazırlanır() {
        spec.pathParam("first","daily-report");
    }

    @When("Daily report icin GET request düzenlenir ve response alınır.")
    public void dailyReportIcinGETRequestDüzenlenirVeResponseAlınır() {
        response = given(spec).when().get("{first}");
        response.prettyPrint();
    }

    @And("Get daily reports icin Status kodunun {int} oldugu dogrulanir")
    public void getDailyReportsIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
}
