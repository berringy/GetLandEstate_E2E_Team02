package getland.stepdefs.api_stepdefs.us04_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static getland.stepdefs.api_stepdefs.us04_stepdefs.Hook.spec;
import static io.restassured.RestAssured.given;

public class US04GetAllStepdefs {

    Response response;

    @Given("Database ile bağlantı kurulurr")
    public void databaseIleBağlantıKurulurr() {

        spec.pathParams("first","advert-types","second","all");
    }

    @And("Databese sorgu gönderilir ve cevap alınır")
    public void databeseSorguGönderilirVeCevapAlınır() {

        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Bütün advert typelar doğrulanır")
    public void bütünAdvertTypelarDoğrulanır() {

        Assert.assertTrue(response.asString().contains("id"));
        Assert.assertTrue(response.asString().contains("title"));
        Assert.assertTrue(response.asString().contains("builtIn"));

    }
}
