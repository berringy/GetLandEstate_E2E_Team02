package getland.stepdefs.api_stepdefs.us01_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import getland.pojos.tour_requests_controller.TourDatePojo;
import getland.pojos.tour_requests_controller.TourTimePojo;
import getland.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static getland.stepdefs.api_stepdefs.us07_stepdefs.US07_API_ReportController_Stepdefs.getAuthToken;

/* {
  "tourDate": "2025-03-29",
  "tourTime": {
    "hour": 13,
    "minute": 0,
    "second": 0,
    "nano": 0
  },
  "advertId": 360
} */

public class US01_API_TourReqController_Stepdefs {

    private static Integer id;
    private Response response;
    String token = getAuthToken(ConfigReader.getProperty("adminEmail"), ConfigReader.getProperty("adminPassword"));

    RequestSpecification spec = new RequestSpecBuilder()
            .setBaseUri(ConfigReader.getProperty("apiBaseUrl"))
            .setContentType(ContentType.JSON)
            .addHeader("Authorization", "Bearer " + token)
            .build();

    @When("Payload setup and a post request is sent to the API")
    public void payloadSetupAndAPostRequestIsSentToTheAPI() {

        spec.pathParam("first", "tour-requests");

        TourTimePojo tourTimePojo = new TourTimePojo(14, 30, 0, 0);
        TourDatePojo tourDatePojo = new TourDatePojo("2025-03-31", tourTimePojo, 423);

        Response response = given(spec).body(tourDatePojo).when().post("{first}");
        response.prettyPrint();

        if (response.jsonPath().get("id") != null) {
            id = response.jsonPath().getInt("id");
            System.out.println("Created Tour Request ID: " + id);
        } else {
            System.out.println("ID field is missing in response!");
        }
    }


    @And("The response body should contain the tour request id")
    public void theResponseBodyShouldContainTheTourRequestId() {
        Assert.assertNotNull("ID should not be null", id);
    }

    @Given("Payload setup and a put request is sent to the API")
    public void payloadSetupAndAPutRequestIsSentToTheAPI() {
        String token = getAuthToken(ConfigReader.getProperty("adminEmail"), ConfigReader.getProperty("adminPassword"));

        RequestSpecification spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("apiBaseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + token)
                .build();

        //  /tour-requests/{id}/auth
        spec.pathParams("first", "tour-requests", "second", id, "third", "auth");

        TourTimePojo tourTimePojo = new TourTimePojo(11, 30, 0, 0);
        TourDatePojo tourDatePojo = new TourDatePojo("2025-03-30", tourTimePojo, 423);

        Response response = given(spec).body(tourDatePojo).when().put("{first}/{second}/{third}");
        response.prettyPrint();

        if (response.jsonPath().get("id") != null) {
            id = response.jsonPath().getInt("id");
            System.out.println("Tour Request is updated: " + id);
        } else {
            System.out.println("Tour Request ID is missing in response!");
        }
    }


    @Given("a GET request is sent to the API to view the tour request")
    public void aGETRequestIsSentToTheAPIToViewTheTourRequest() {

        //  /tour-requests/{id}/auth
        spec.pathParams("first", "tour-requests", "second", id, "third", "auth");

        Response response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();

        if (response.jsonPath().get("id") != null) {
            id = response.jsonPath().getInt("id");
            System.out.println("Tour Request is available: " + id);
        } else {
            System.out.println("Tour Request ID is missing in response!");
        }
    }

    @When("The user views their own tour requests")
    public void theUserViewsTheirOwnTourRequests() {
        // /tour-requests/auth/guest
        spec.pathParams("first", "tour-requests", "second", "auth", "third", "guest?page=0&size=20&sort=advert_id&type=asc");
        Response response = given(spec).when().get("{first}/{second}/{third}");
        System.out.println("Response Body: " + response.getBody().asString());
        id=response.jsonPath().getInt("id");
        Assert.assertNotNull("Tour Request ID is missing in response!",id);
    }


    @Given("a GET request is sent to the API to approve the tour request")
    public void aGETRequestIsSentToTheAPIToApproveTheTourRequest() {

        String token = getAuthToken(ConfigReader.getProperty("managerEmail"), ConfigReader.getProperty("managerPass"));

        RequestSpecification spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("apiBaseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + token)
                .build();


        //GET /tour-requests/{id}/approve
        spec.pathParams("first", "tour-requests", "second", id, "third", "approve");
        Response response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @And("The response body should contain {string}")
    public void theResponseBodyShouldContain(String expectedStatus) {

        Assert.assertTrue("Response body should contain expectedStatus", response.jsonPath().getString("status").contains(expectedStatus));
    }

    @Given("a GET request is sent to the API to decline the tour request")
    public void aGETRequestIsSentToTheAPIToDeclineTheTourRequest() {
        String token = getAuthToken(ConfigReader.getProperty("managerEmail"), ConfigReader.getProperty("managerPass"));

        RequestSpecification spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("apiBaseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + token)
                .build();

        //GET /tour-requests/{id}/decline
        spec.pathParams("first", "tour-requests", "second", id, "third", "decline");
        Response response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @When("The advertiser views all tour requests received")
    public void theAdvertiserViewsAllTourRequestsReceived() {
        spec.pathParams("first", "tour-requests", "second", "auth", "third", "owner?page=0&size=20&type=asc");
        Response response = given(spec).when().get("{first}/{second}/{third}");
        System.out.println("Response Body: " + response.getBody().asString());
        id=response.jsonPath().getInt("id");
        Assert.assertNotNull("Tour Request ID is missing in response!",id);
    }


    @Given("a GET request is sent to the API to cancel the tour request")
    public void aGETRequestIsSentToTheAPIToCancelTheTourRequest() {

        String token = getAuthToken(ConfigReader.getProperty("adminEmail"), ConfigReader.getProperty("adminPass"));

        RequestSpecification spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("apiBaseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + token)
                .build();

        //GET /tour-requests/{id}/cancel
        spec.pathParams("first", "tour-requests", "second", id, "third", "cancel");
        Response response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Given("User creates a new tour request")
    public void userCreatesANewTourRequest() {
        String token = getAuthToken(ConfigReader.getProperty("adminEmail"), ConfigReader.getProperty("adminPassword"));

        RequestSpecification spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("apiBaseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + token)
                .build();

        spec.pathParam("first", "tour-requests");

        TourTimePojo tourTimePojo = new TourTimePojo(14, 30, 0, 0);
        TourDatePojo tourDatePojo = new TourDatePojo("2025-03-31", tourTimePojo, 532);

        Response response = given(spec).body(tourDatePojo).when().post("{first}");
        response.prettyPrint();

        if (response.jsonPath().get("id") != null) {
            id = response.jsonPath().getInt("id");
            System.out.println("Created Tour Request ID: " + id);
        } else {
            System.out.println("ID field is missing in response!");
        }
    }

    @When("a GET request is sent to the API to delete the tour request")
    public void aGETRequestIsSentToTheAPIToDeleteTheTourRequest() {

       // /tour-requests/{id}
        spec.pathParams("first", "tour-requests", "second", id);
        Response response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }


}