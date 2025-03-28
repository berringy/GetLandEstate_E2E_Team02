package getland.stepdefs.api_stepdefs.us10_stepdefs;

import getland.pojos.adverttypespojos.AdvertTypesGetPojo;
import getland.pojos.districtscontrollerpojos.DistrictsControllerGetPojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static getland.Hook.spec;
import static io.restassured.RestAssured.given;

public class US10GetStepdefs {

    Response response;

    DistrictsControllerGetPojo expectedData = new DistrictsControllerGetPojo(1,"Rent",true);

    @Given("Database ile bağlantı kurulurrrr")
    public void databaseIleBağlantıKurulurrrr() {

        spec.pathParams("first","districts","second","search","third",1);
    }

    @And("Sorgu gönderilirr")
    public void sorguGönderilirr() {

        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Doğru verilerin geldiği doğrulanır")
    public void doğruVerilerinGeldiğiDoğrulanır() {


        DistrictsControllerGetPojo actualData = response.as(DistrictsControllerGetPojo.class);

        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getTitle(),actualData.getTitle());
        Assert.assertEquals(expectedData.getisBuiltIn(),actualData.getisBuiltIn());




    }
}
