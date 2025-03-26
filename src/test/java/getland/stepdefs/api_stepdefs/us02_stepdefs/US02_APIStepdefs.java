package getland.stepdefs.api_stepdefs.us02_stepdefs;

import getland.pojos.category_property_key_controller.US02_CategoryPropertyKePayloadPojo;
import getland.pojos.category_property_key_controller.US02_CategoryPropertyKeyResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.List;

import static getland.stepdefs.api_stepdefs.us02_stepdefs.ApiAdminHook.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US02_APIStepdefs {

    US02_CategoryPropertyKePayloadPojo payloadPojo;
    US02_CategoryPropertyKePayloadPojo payloadPutPojo;
    US02_CategoryPropertyKeyResponsePojo responsePojo;
    List<US02_CategoryPropertyKeyResponsePojo> responseBody;
    US02_CategoryPropertyKeyResponsePojo responsePutPojo;
    Response response;
    US02_CategoryPropertyKePayloadPojo expectedData;


    @Given("a URL is created for the POST")
    public void aURLIsCreatedForThe() {
        spec.pathParams("first", "categoriesKey", "second", 1, "third", "properties");

    }

    @When("create a payload for the Post and get the response")
    public void createAPayloadForThePostAndGetTheResponse() {
        payloadPojo = new US02_CategoryPropertyKePayloadPojo("House11", "TEXT", "nice", "m2");
        response = given(spec).body(payloadPojo).when().post("{first}/{second}/{third}");
        responsePojo = response.as(US02_CategoryPropertyKeyResponsePojo.class);
        response.prettyPrint();
    }

    @Then("verify that the status code is {int}")
    public void verifyThatTheStatusCodeIs(int arg0) {
        assertEquals(200,response.statusCode());


    }

    @And("compare the payload with the response")
    public void compareThePayloadWithTheResponse() {
        assertEquals(payloadPojo.getName(), responsePojo.getName());
        assertEquals(payloadPojo.getKeyType(), responsePojo.getKeyType());
        assertEquals(payloadPojo.getPrefix(), responsePojo.getPrefix());
        assertEquals(payloadPojo.getSuffix(), responsePojo.getSuffix());
    }

    @Given("A get request is created with the previously created id")
    public void aGetRequestIsCreatedWithThePreviouslyCreatedId() {
        spec.pathParams("first", "categoriesKey", "second", responsePojo.getId(), "third", "properties");
        //set teh expected data
        expectedData = new US02_CategoryPropertyKePayloadPojo(responsePojo.getId(),payloadPojo.getName(),payloadPojo.getKeyType(),payloadPojo.getPrefix(),payloadPojo.getSuffix());
        //send request get response
        response = given(spec).when().get("{first}/{second}/{third}");
    }

     @And("Validate the data created with the post request with the response")
    public void validateTheDataCreatedWithThePostRequestWithTheResponse() {
        assertEquals(200,response.statusCode());
        assertEquals(payloadPojo.getName(), responsePojo.getName());
        assertEquals(payloadPojo.getKeyType(), responsePojo.getKeyType());
        assertEquals(payloadPojo.getPrefix(), responsePojo.getPrefix());
        assertEquals(payloadPojo.getSuffix(), responsePojo.getSuffix());
    }

    @Given("update the category property key controller with the id created with the post request")
    public void updateTheCategoryPropertyKeyControllerWithTheIdCreatedWithThePostRequest() {
        spec.pathParams("first", "categoriesKey", "second", "properties", "third", responsePojo.getId());
    }

    @When("Send PUT request for category property key controller and receive response")
    public void sendPUTRequestForCategoryPropertyKeyControllerAndReceiveResponse() {
        payloadPutPojo = new US02_CategoryPropertyKePayloadPojo("Apartment", "BOOLEAN", "", "");
        response = given(spec).body(payloadPutPojo).when().put("{first}/{second}/{third}");
        responsePutPojo = response.as(US02_CategoryPropertyKeyResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Verify response body against updated data")
    public void verifyResponseBodyAgainstUpdatedData() {
        assertEquals(200,response.statusCode());
        assertEquals(payloadPutPojo.getName(), responsePutPojo.getName());
        assertEquals(payloadPutPojo.getKeyType(), responsePutPojo.getKeyType());
        assertEquals(payloadPutPojo.getPrefix(), responsePutPojo.getPrefix());
        assertEquals(payloadPutPojo.getSuffix(), responsePutPojo.getSuffix());
    }

    @Given("delete the category property key controller with the id created with the post request")
    public void deleteTheCategoryPropertyKeyControllerWithTheIdCreatedWithThePostRequest() {
        spec.pathParams("first", "categoriesKey", "second", "properties", "third", responsePojo.getId());
    }

    @When("Send DELETE request for category property key controller and receive response")
    public void sendDELETERequestForCategoryPropertyKeyControllerAndReceiveResponse() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Verify response body against deleted data")
    public void verifyResponseBodyAgainstDeletedData() {
        assertEquals(200,response.statusCode());


    }
}
