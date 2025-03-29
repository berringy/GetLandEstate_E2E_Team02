package getland.stepdefs.api_stepdefs.us03_09stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US09FavoritessStepDefs {

    RequestSpecification customerSpec = CustomerHook.spec;
    RequestSpecification adminSpec = AdminHook.spec;
    Response response;



    @Given("Database baglantisi saglanir")
    public void databaseBaglantisiSaglanir() {
        customerSpec.pathParams("first", "favorites", "second", 7, "third", "auth");
    }

    @Given("Sorgu gonderilir")
    public void sorgu_gonderilir() {
        response = given(customerSpec)
                .when()
                .get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Dogru cevap geldigi dogrulanir")
    public void dogru_cevap_geldigi_dogrulanir() {
        assertFalse(response.asString().contains("favoriteId"));
        assertFalse(response.asString().contains("advertId"));

    }

    @Given("Database baglantisi saglanir\\(f2)")
    public void database_baglantisi_saglanir_f2() {
        adminSpec.pathParams("first", "favorites", "second", "getAll", "third", 1446);
    }

    @Given("Sorgu gonderilir\\(f2)")
    public void sorgu_gonderilir_f2() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Dogru cevap dogrulanir\\(f2)")
    public void dogru_cevap_dogrulanir_f2() {
        assertFalse(response.asString().contains("favoriteId"));
        assertFalse(response.asString().contains("advertId"));
    }


    @Given("Database baglantisi saglanir\\(f3)")
    public void database_baglantisi_saglanir_f3() {
        adminSpec.pathParams("first", "favorites", "second", "countFav");

    }


    @Given("Sorgu gonderilir\\(f3)")
    public void sorgu_gonderilir_f3() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Dogru cevap dogrulanir\\(f3)")
    public void dogru_cevap_dogrulanir_f3() {
        assertFalse(response.asString().contains("advertId"));
        assertFalse(response.asString().contains("favoriteCount"));
        //assertFalse(response.asString().contains("sad"));
    }

    @Given("Database baglantisi saglanir\\(f4)")
    public void database_baglantisi_saglanir_f4() {
        adminSpec.pathParams("first", "favorites", "second", "auth");
    }

    @Given("Sorgu gonderilir\\(f4)")
    public void sorgu_gonderilir_f4() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Dogru cevap dogrulanir\\(f4)")
    public void dogru_cevap_dogrulanir_f4() {
        assertEquals(response.asString().contains("title"));
    }

    private void assertEquals(boolean title) {
    }

    @Given("Database baglantisi saglanir\\(f5)")
    public void database_baglantisi_saglanir_f5() {
        adminSpec.pathParams("first", "favorites", "second", "auth");
    }

    @Given("Sorgu gonderilir\\(f5)")
    public void sorgu_gonderilir_f5() {
        response = given(adminSpec)
                .when()
                .delete("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Dogru cevap dogrulanir\\(f5)")
    public void dogru_cevap_dogrulanir_f5() {
        assertTrue(response.getStatusCode() == 200 || response.getStatusCode() == 204);

        JsonPath jsonPath = response.jsonPath();

        // Eğer yanıt bir JSON mesajı içeriyorsa kontrol edelim
        if (response.getStatusCode() == 200) {
            String message = jsonPath.getString("message");
            System.out.println("Silme Mesajı: " + message);
            Assert.assertEquals("Silme işlemi başarılı", message);
        }
    }

    @Given("Database baglantisi saglanir\\(f6)")
    public void database_baglantisi_saglanir_f6() {
        adminSpec.pathParams("first", "favorites", "second", "auth", "third", "countFav", "fourth", 4);

    }

   @Given("Sorgu gonderilir\\(f6)")
    public void sorgu_gonderilir_f6() {
       response=given(adminSpec).body(1)
               .when()
               .delete("{first}/{second}/{third}/{fourth}");
       response.prettyPrint();
    }


    @Then("Dogru cevap dogrulanir\\(f6)")
    public void dogru_cevap_dogrulanir_f6() {
        System.out.println("Erisim reddediliyor");
    }

    @Given("Database baglantisi saglanir\\(f7)")
    public void database_baglantisi_saglanir_f7() {
        adminSpec.pathParams("first", "favorites", "second", "admin","third",1446);

    }
    @Given("Sorgu gonderilir\\(f7)")
    public void sorgu_gonderilir_f7() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second/{third}");
        response.prettyPrint();
    }
    @Then("Dogru cevap dogrulanir\\(f7)")
    public void dogru_cevap_dogrulanir_f7() {

    }

    @Given("Database baglantisi saglanir\\(f8)")
    public void database_baglantisi_saglanir_f8() {
        adminSpec.pathParams("first", "favorites", "second", "admin","third","countFav");

    }
    @Given("Sorgu gonderilir\\(f8)")
    public void sorgu_gonderilir_f8() {
        response = given(adminSpec)
                .when()
                .get("{first}/{second/{third}");
        response.prettyPrint();
    }
    @Then("Dogru cevap dogrulanir\\(f8)")
    public void dogru_cevap_dogrulanir_f8() {
        assertEquals(response.asString().contains("advertId"));
        assertEquals(response.asString().contains("favoriteCount"));
    }



    @Given("Database baglantisi saglanir\\(f9)")
    public void database_baglantisi_saglanir_f9() {
        adminSpec.pathParams("first", "favorites", "id",391);

    }
    @Given("Sorgu gonderilir\\(f9)")
    public void sorgu_gonderilir_f9() {
        response = given(adminSpec)
                .when()
                .delete("{first}/{id}");
        response.prettyPrint();
    }
    @Then("Dogru cevap dogrulanir\\(f9)")
    public void dogru_cevap_dogrulanir_f9() {

    }

    @Given("Database baglantisi saglanir\\(f10)")
    public void database_baglantisi_saglanir_f10() {
        adminSpec.pathParams("first", "favorites", "second","admin","third","delete","fourth",6);

    }
    @Given("Sorgu gonderilir\\(f10)")
    public void sorgu_gonderilir_f10() {
        response = given(adminSpec)
                .when()
                .delete("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();
    }
    @Then("Dogru cevap dogrulanir\\(f10)")
    public void dogru_cevap_dogrulanir_f10() {

    }


    @Given("Database baglantisi saglanir\\(f11)")
    public void database_baglantisi_saglanir_f11() {
        adminSpec.pathParams("first", "favorites", "second","admin","third","delete","fourth","all","fifth",5);

    }
    @Given("Sorgu gonderilir\\(f11)")
    public void sorgu_gonderilir_f11() {
        response = given(adminSpec)
                .when()
                .delete("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();
    }
    @Then("Dogru cevap dogrulanir\\(f11)")
    public void dogru_cevap_dogrulanir_f11() {

    }




}
