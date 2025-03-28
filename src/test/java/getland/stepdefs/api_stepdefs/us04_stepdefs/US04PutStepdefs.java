package getland.stepdefs.api_stepdefs.us04_stepdefs;

import getland.pojos.adverttypespojos.AdvertTypesGetPojo;
import getland.pojos.adverttypespojos.AdvertTypesPutPojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static getland.Hook.spec;
import static io.restassured.RestAssured.given;

public class US04PutStepdefs {

    Response response;

    AdvertTypesPutPojo expectedData = new AdvertTypesPutPojo(1,"selam",true);


    @Given("Database ile bağlantı kurulurrr")
    public void databaseIleBağlantıKurulurrr() {

        spec.pathParams("first","advert-types","second",1);
    }

    @And("Databese güncellenecek veri gönderilir")
    public void databeseGüncellenecekVeriGönderilir() {

        response = given(spec).contentType(ContentType.JSON).body(expectedData).when().put("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Advert types güncellendiği doğrulanır")
    public void advertTypesGüncellendiğiDoğrulanır() {

        AdvertTypesPutPojo actualData = response.as(AdvertTypesPutPojo.class);

        Assert.assertEquals(expectedData.getId(),actualData.getId());
        Assert.assertEquals(expectedData.getTitle(),actualData.getTitle());
        Assert.assertEquals(expectedData.getisBuiltIn(),actualData.getisBuiltIn());


    }
}
