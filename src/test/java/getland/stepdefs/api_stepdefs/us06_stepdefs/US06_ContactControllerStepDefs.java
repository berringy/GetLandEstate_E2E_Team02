package getland.stepdefs.api_stepdefs.us06_stepdefs;

import getland.pojos.contact_controller.US06_GetByIdPayload;
import getland.pojos.contact_controller.US06_PostPayload;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;


import java.util.List;

import static getland.stepdefs.api_stepdefs.us06_stepdefs.US06_ApiAdminHook.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US06_ContactControllerStepDefs {

    private US06_PostPayload payload;
    Response response;
    private Integer firstContactID;
    private List<US06_GetByIdPayload> alldata;
    String expectedMessage = "Hak,hukuk,adalet";
    private US06_GetByIdPayload foundContact;

    @Given("Prepare a new contact message.")
    public void prepareANewContactMessage() {
//        spec.baseUri(ConfigReader.getProperty("apiUrl"));

        spec.pathParams("first","contact-messages");
        //Request URI:http://64.227.123.49:8092/contact-messages
        payload = new US06_PostPayload("Ecesu", "Tarhan","ecesu@gmail.com",expectedMessage);
    }

    @When("Send the new contact message.")
    public void sendTheNewContactMessage() {

        response = given(spec)
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("{first}");
       // response.prettyPrint(); // Contact message saved successfully.

    }

    @Then("Receive a success for status code.")
    public void receiveASuccessForStatusCode() {

        response.then().statusCode(200);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("Verify the message is created successfully.")
    public void verifyTheMessageIsCreatedSuccessfully() {
        assertTrue(response.body().asString().contains("saved successfully."));
    }


    @Given("Retrieve a specific contact message by ID.")
    public void retrieveASpecificContactMessageByID() {

        spec.pathParams("first","contact-messages");
        response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("{first}");
        alldata = response.jsonPath().getList("content",US06_GetByIdPayload.class);

        foundContact = alldata.stream()
                .filter(contact -> "Ecesu".equals(contact.getFirstName()))
                .findFirst()
                .orElse(null);

        firstContactID = foundContact.getId();

        spec.pathParams("first","contact-messages","second",firstContactID);
        response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("{first}/{second}");
        //response.prettyPrint();

    }

    @Then("Receive a status code for success.")
    public void receiveAStatusCodeForSuccess() {
        response.then().statusCode(200);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("Verify the selected message details.")
    public void verifyTheSelectedMessageDetails() {
        String actualMessage = foundContact.getMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
    }


    @Given("Update the status of a specific contact message.")
    public void updateTheStatusOfASpecificContactMessage() {

        spec.pathParams("first","contact-messages");
        response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("{first}");
        alldata = response.jsonPath().getList("content",US06_GetByIdPayload.class);

        foundContact = alldata.stream()
                .filter(contact -> "Ecesu".equals(contact.getFirstName()))
                .findFirst()
                .orElse(null);

        if (foundContact != null) {
            firstContactID = foundContact.getId();
            boolean currentStatus = foundContact.isStatus();

            boolean newStatus = !currentStatus;

            String updatedMessageBody = "{ \"status\": " + newStatus + " }";


        spec.pathParams("first","contact-messages","second",firstContactID);

        response = given(spec)
                .contentType(ContentType.JSON)
                .body(updatedMessageBody)
                .when()
                .patch("{first}/{second}");
        //response.prettyPrint();
        }
    }

    @Then("Receive status code for validation.")
    public void receiveStatusCodeForValidation() {
        response.then().statusCode(200);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("Verify the message is updated correctly.")
    public void verifyTheMessageIsUpdatedCorrectly() {
        response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("{first}/{second}", "contact-messages", firstContactID);

        Boolean actualStatus = response.jsonPath().getBoolean("status");

        boolean expectedStatus = !foundContact.isStatus();

        Assert.assertEquals(expectedStatus, actualStatus);
    }

    @Given("Delete a specific contact message.")
    public void deleteASpecificContactMessage() {
        spec.pathParams("first","contact-messages");
        response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("{first}");
        alldata = response.jsonPath().getList("content",US06_GetByIdPayload.class);

        foundContact = alldata.stream()
                .filter(contact -> "Ecesu".equals(contact.getFirstName()))
                .findFirst()
                .orElse(null);

            firstContactID = foundContact.getId();
        System.out.println("This person is going to be deleted : "+foundContact.getId()+foundContact.getFirstName());


        spec.pathParams("first","contact-messages","second",firstContactID);
        response = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .delete("{first}/{second}", "contact-messages", firstContactID);
        //response.prettyPrint();

    }

    @Then("Receive a validate status code.")
    public void receiveAValidateStatusCode() {
        response.then().statusCode(200);
        Assert.assertEquals(200, response.getStatusCode());
    }

    @And("Verify the message is deleted successfully.")
    public void verifyTheMessageIsDeletedSuccessfully() {

        Response getResponse = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("{first}/{second}", "contact-messages", firstContactID);

        int getStatusCode = getResponse.getStatusCode();
        Assert.assertTrue("Message already exist! Status code: " + getStatusCode,
                getStatusCode == 404 || getResponse.body().asString().isEmpty());

    }

    }
