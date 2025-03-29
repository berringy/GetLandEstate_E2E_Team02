package getland.stepdefs.api_stepdefs.us04_stepdefs;

import getland.pojos.adverttypespojos.AdvertTypesGetPojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static getland.stepdefs.api_stepdefs.us04_stepdefs.Hook.spec;
import static io.restassured.RestAssured.given;

public class US04GetStepdefs {

    Response response;

    AdvertTypesGetPojo expectedData = new AdvertTypesGetPojo(1,"Rent",true);

    @Given("Database ile bağlantı kurulur")
    public void databaseIleBağlantıKurulur() {
        spec.pathParams("first","advert-types","second",1);
    }

    @And("Sorgu gönderilir")
    public void sorguGönderilir() {

        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Advert type doğrulanır")
    public void advertTypeDoğrulanır() {
        AdvertTypesGetPojo actualData = response.as(AdvertTypesGetPojo.class);

        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getTitle(),actualData.getTitle());
        Assert.assertEquals(expectedData.getisBuiltIn(),actualData.getisBuiltIn());

    }
}
