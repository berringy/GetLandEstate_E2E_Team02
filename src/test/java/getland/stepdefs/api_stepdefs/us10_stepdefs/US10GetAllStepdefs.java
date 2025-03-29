package getland.stepdefs.api_stepdefs.us10_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static getland.stepdefs.api_stepdefs.us04_stepdefs.Hook.spec;
import static io.restassured.RestAssured.given;

public class US10GetAllStepdefs {

    Response response;


    @Given("Database ile bağlantı kurulurrrrr")
    public void databaseIleBağlantıKurulurrrrr() {

        spec.pathParams("first","districts","second","all");
    }

    @And("Sorgu gönderili")
    public void sorguGönderili() {

        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Bütün verilerin geldiği doğrulanır")
    public void bütünVerilerinGeldiğiDoğrulanır() {
        Assert.assertTrue(response.asString().contains("id"));
        Assert.assertTrue(response.asString().contains("title"));
        Assert.assertTrue(response.asString().contains("location"));
        Assert.assertTrue(response.asString().contains("lat"));
        Assert.assertTrue(response.asString().contains("idlng"));
    }
}
