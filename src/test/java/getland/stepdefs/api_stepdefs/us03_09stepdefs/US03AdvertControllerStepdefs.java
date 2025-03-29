package getland.stepdefs.api_stepdefs.us03_09stepdefs;

import getland.pojos.AdvertControllerPojo;
import getland.pojos.AdvertsAdminPojo;
import getland.pojos.LocationPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;


public class US03AdvertControllerStepdefs {


    /*
{
  "id": 3,
  "title": "Modern Office",
  "description": "Modern amenities for your comfort.",
  "price": 300000,
  "statusForAdvert": "ACTIVATED",
  "builtIn": true,
  "viewCount": 6,
  "location": {
    "lat": 37.8537655,
    "lng": 27.7235028
  }
 */

    RequestSpecification customerSpec = CustomerHook.spec;
    RequestSpecification adminSpec = AdminHook.spec;
    Response response;
    LocationPojo locationPojo=new LocationPojo(0,0);
    AdvertsAdminPojo expectedData=new AdvertsAdminPojo(3,"Modern Office","Modern amenities for your comfort.",300000,"ACTIVATED",true,6,locationPojo);
  /*  AdvertControllerPojo expectedData =new AdvertControllerPojo("string","string",0,0,0,0,0,locationPojo,"string",true,"string");
    @Given("Database baglantisi saglandi")
    public void database_baglantisi_saglandi() {
        adminSpec.pathParams("first","adverts","second","auth","third",7);
    }

    @And("Guncellenecek veri gonderilir")
    public void guncellenecekVeriGonderilir() {
        response=given(adminSpec)
                .body(expectedData)
                .when()
                .put("{first}/{second}/{third}");
        response.prettyPrint();
    }



    @Then("Gelen cevap dogrulanir")
    public void gelen_cevap_dogrulanir() {

        AdvertControllerPojo actualData=response.as(AdvertControllerPojo.class);
        assertEquals(expectedData.getTitle(),actualData.getTitle());
        Assert.assertFalse(expectedData.getDesc(), Boolean.parseBoolean(actualData.getDesc()));
        assertFalse(expectedData.getPrice(),actualData.getPrice());
        assertFalse(expectedData.getAdvertTypeId(),actualData.getAdvertTypeId());
        assertFalse(expectedData.getCountryId(),actualData.getCountryId());
        assertFalse(expectedData.getCityId(),actualData.getCityId());
        assertFalse(expectedData.getDistrictId(),actualData.getDistrictId());



        assertFalse(expectedData.getLocation().getLat(),actualData.getLocation().getLat());
        //assertFalse(locationPojo.getLat());
        assertTrue(expectedData.getLocation().getLng(),actualData.getLocation().getLng());

    }

    private void assertTrue(int lng, int lng1) {
    }

   private void assertFalse(int price, int price1) {
    }
*/


    @Given("Database baglantisi saglandi\\(f13)")
    public void database_baglantisi_saglandi_f13() {
        adminSpec.pathParams("first", "adverts", "second", "admin");
    }
    @Given("Guncellenecek veri gonderilir\\(f13)")
    public void guncellenecek_veri_gonderilir_f13() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("Gelen cevap dogrulanir\\(f13)")
    public void gelen_cevap_dogrulanir_f13() {
        Assert.assertFalse(response.asString().contains("favoriteId"));
        Assert.assertFalse(response.asString().contains("advertId"));
    }

    @Given("Database connection saglandi\\(f12)")
    public void database_connection_saglandi_f12() {
        adminSpec.pathParams("first", "adverts", "second", "auth");

    }
    @Given("Sorgu gonderildi\\(f12)")
    public void sorgu_gonderildi_f12() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("Gelen cevap dogrulandi\\(f12)")
    public void gelen_cevap_dogrulandi_f12() {
       // Assert.assertEquals(response.asString().contains("price"));
      //  Assert.assertEquals(response.asString().contains("title"));
    }

    @Given("Database connection saglandi\\(f11)")
    public void database_connection_saglandi_f11() {
        adminSpec.pathParams("first","adverts","second","categories");
    }
    @Given("Sorgu gonderildi\\(f11)")
    public void sorgu_gonderildi_f11() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("Gelen cevap dogrulandi\\(f11)")
    public void gelen_cevap_dogrulandi_f11() {
        Assert.assertFalse(response.asString().contains("categoryId"));
    }


    @Given("Database connection saglandi\\(f10)")
    public void database_connection_saglandi_f10() {
        adminSpec.pathParams("first","adverts","second","cities","third",3);
    }
    @Given("Sorgu gonderildi\\(f10)")
    public void sorgu_gonderildi_f10() {
        response=given(adminSpec)
                .when()
                .get("{first}/{second/{third}");
        response.prettyPrint();
    }
    @Then("Gelen cevap dogrulandi\\(f10)")
    public void gelen_cevap_dogrulandi_f10() {
        Assert.assertFalse(response.asString().contains("cityId"));

    }

    @Given("Database connection saglandi\\(f9)")
    public void database_connection_saglandi_f9() {
        adminSpec.pathParams("first","adverts","second","getAll","third",5);
    }
    @Given("Sorgu gonderildi\\(f9)")
    public void sorgu_gonderildi_f9() {
        response=given(adminSpec)
                .when()
                .get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("Gelen cevap dogrulandi\\(f9)")
    public void gelen_cevap_dogrulandi_f9() {
        AdvertControllerPojo actualData=response.as(AdvertControllerPojo.class);
        Assert.assertFalse(response.asString().contains("advertId"));
    }


    @Given("Database connection saglandi\\(f8)")
    public void database_connection_saglandi_f8() {
        customerSpec.pathParams("first","adverts","second","search");
    }
    @Given("Sorgu gonderildi\\(f8)")
    public void sorgu_gonderildi_f8() {
        response=given()
                .when()
                .get("{first}/{second}");
        response.prettyPrint();
    }
    @Then("Gelen cevap dogrulandi\\(f8)")
    public void gelen_cevap_dogrulandi_f8() {
       // Assert.assertFalse(response.asString().contains("price"));
    }

    @Given("Database connection saglandi\\(f7)")
    public void database_connection_saglandi_f7() {
        adminSpec.pathParams("first","adverts","second",2,"third","admin");
    }
    @Given("Sorgu gonderildi\\(f7)")
    public void sorgu_gonderildi_f7() {
        response=given()
                .when()
                .get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("Gelen cevap dogrulandi\\(f7)")
    public void gelen_cevap_dogrulandi_f7() {
            AdvertsAdminPojo actualData=response.as(AdvertsAdminPojo.class);
            assertEquals(expectedData.getPrice(),actualData.getPrice());
            assertEquals(expectedData.getTitle(),actualData.getTitle());

    }








}
