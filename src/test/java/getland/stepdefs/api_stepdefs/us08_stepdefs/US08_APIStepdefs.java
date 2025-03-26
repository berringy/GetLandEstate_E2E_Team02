package getland.stepdefs.api_stepdefs.us08_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

import static getland.stepdefs.api_stepdefs.us08_stepdefs.ApiAdminHook.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US08_APIStepdefs {
    Response response ;
    JsonPath jsonPath;

    @Given("A Get request is sent logs controller")
    public void aGetRequestIsSentLogsController() {
        //set the url  http://64.227.123.49:8092/logs/3782
       // spec.pathParams("first", "logs","second", "3782");

        spec.pathParams("first", "logs", "second", 20)
                .queryParams("page", "0", "size", "20", "sort", "message", "type", "asc");

        //set the expected data

        //send request get response
        response = given(spec).when().get("{first}/{second}");



    }

    @Then("Is the response status code 200")
    public void isTheResponseStatusCode200() {
        //do assertion
        assertEquals(200, response.statusCode());
        response.prettyPrint();

    }

    @And("Validate pageable.pageNumber and pageable.pageSize")
    public void validatePageablePageNumberAndPageablePageSize() {
        jsonPath = response.jsonPath();

        // pageable.pageNumber ve pageable.pageSize kontrolü
        int pageNumber = jsonPath.getInt("pageable.pageNumber");
        int pageSize = jsonPath.getInt("pageable.pageSize");

        assertEquals("❌ pageNumber beklenen 0 değil!", 0, pageNumber);
        assertEquals("❌ pageSize beklenen 20 değil!", 20, pageSize);


    }

    @And("Check the content field")
    public void checkTheContentField() {
        jsonPath = response.jsonPath();
        // content alanını kontrol et
         List<Object> contentList = jsonPath.getList("content");

        assertNotNull("❌ content null geldi!", contentList);
        assertTrue("❌ content boş geldi! Beklenen: Dolu içerik.", contentList.size() > 0);

        System.out.println("✔️ JsonPath ile tüm doğrulamalar başarılı.");

    }
}
