package getland.stepdefs.api_stepdefs.us04_stepdefs;

import getland.pojos.adverttypespojos.AdvertTypesPostPojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static getland.stepdefs.api_stepdefs.us04_stepdefs.Hook.spec;
import static io.restassured.RestAssured.given;

public class US04PostStepdefs {

    Response response;

    AdvertTypesPostPojo expectedData = new AdvertTypesPostPojo(1,"godfather",true);

    @Given("Database ile bağlantısı kurulur")
    public void databaseIleBağlantısıKurulur() {

        spec.pathParams("first","advert-types");
    }

    @And("Databese veri gönderilir")
    public void databeseVeriGönderilir() {

        response = given(spec).contentType(ContentType.JSON).body(expectedData).when().post("{first}");
        response.prettyPrint();
    }

    @Then("Advert types oluşturduğu doğrulanır")
    public void advertTypesOluşturduğuDoğrulanır() {

        AdvertTypesPostPojo actualData = response.as(AdvertTypesPostPojo.class);

        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getTitle(),actualData.getTitle());
        Assert.assertEquals(expectedData.getisBuiltIn(),actualData.getisBuiltIn());
    }
}
