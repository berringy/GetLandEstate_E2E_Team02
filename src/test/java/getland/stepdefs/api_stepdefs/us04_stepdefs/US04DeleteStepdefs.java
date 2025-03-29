package getland.stepdefs.api_stepdefs.us04_stepdefs;

import getland.pojos.adverttypespojos.AdvertTypesDeletePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static getland.stepdefs.api_stepdefs.us04_stepdefs.Hook.spec;
import static io.restassured.RestAssured.given;

public class US04DeleteStepdefs {

    Response response;

    AdvertTypesDeletePojo expectedData = new AdvertTypesDeletePojo(1,"Rent",true);

    @Given("Database ile bağlantıı kurulur")
    public void databaseIleBağlantııKurulur() {

        spec.pathParams("first","advert-types","second",1);
    }

    @And("Databese silinecek veri gönderilir")
    public void databeseSilinecekVeriGönderilir() {

        response = given(spec).contentType(ContentType.JSON).body(expectedData).when().put("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Verinin silindiği doğrulanır")
    public void verininSilindiğiDoğrulanır() {

        AdvertTypesDeletePojo actualData = response.as(AdvertTypesDeletePojo.class);

        Assert.assertNull(actualData.getId());
        Assert.assertNull(actualData.getTitle());
        Assert.assertNull(actualData.getisBuiltIn());
    }
}
