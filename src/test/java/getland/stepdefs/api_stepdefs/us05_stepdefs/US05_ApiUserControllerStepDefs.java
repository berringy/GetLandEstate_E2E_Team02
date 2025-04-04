package getland.stepdefs.api_stepdefs.us05_stepdefs;

import getland.pojos.user_controller.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static getland.stepdefs.api_stepdefs.us05_stepdefs.US05_ApiAdminHook.spec;
import static getland.stepdefs.api_stepdefs.us05_stepdefs.US05_ApiCustomerHook.specc;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US05_ApiUserControllerStepDefs {

    US05_UserPaylodPojo payload;
    US05_UserPostResponsePojo actualData;
    Response response;
    static int userId;
    US05_UserPostResponsePojo expectedData;
    US05_UserGetResponsePojo getResponsePojoExpectedData;
    US05_UserGetResponsePojo getResponsePojoactualData;
    US05_UsersPatchPayloadPojo patchPayload;
    US05_UsersPatchResponsePojo expectedDataPatch;
    US05_UsersPatchResponsePojo actualDataPatch;



    @Given("User Register icin URL duzenlenir")
    public void userRegisterIcinURLDuzenlenir() {
        spec.pathParams("first","users","second","register");
    }

    @And("User Register icin payload duzenlenir")
    public void userRegisterIcinPayloadDuzenlenir() {
        payload = new US05_UserPaylodPojo("Api", "Customer",
                "(121) 212-3445", "Api.1234", "apicustomer@gmail.com");
    }

    @When("User Register icin POST request gonderilir ve Response alinir")
    public void userRegisterIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(US05_UserPostResponsePojo.class);
        userId = actualData.getId();
        response.prettyPrint();
    }

    @Then("User Register icin Status kodunun {int} oldugu dogrulanir")
    public void userRegisterIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @And("User Register icin Response body dogrulanir")
    public void userRegisterIcinResponseBodyDogrulanir() {
        assertEquals(payload.getFirstName(), actualData.getFirstName());
        assertEquals(payload.getLastName(), actualData.getLastName());
        assertEquals(payload.getEmail(), actualData.getEmail());
        assertEquals(payload.getPhone(), actualData.getPhone());
    }











    @Given("Admin yetkisi ile Get User icin URL duzenlenir")
    public void getUserIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", userId, "third", "admin");
    }

    @And("Admin yetkisi ile Get User icin expected data duzenlenir")
    public void getUserIcinExpectedDataDuzenlenir() {

        getResponsePojoExpectedData = new US05_UserGetResponsePojo(userId, "Api", "Customer", "apicustomer@gmail.com", "(121) 212-3445","CUSTOMER","null");

    }

    @When("Admin yetkisi ile Get User icin GET request duzenlenir")
    public void getUserIcinGETRequestDuzenlenir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        getResponsePojoactualData = response.as(US05_UserGetResponsePojo.class);
        response.prettyPrint();
    }

    @Then("Admin yetkisi ile Get User icin Status kodunun {int} oldugu dogrulanir")
    public void getUserIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Admin yetkisi ile Get User icin Response body dogrulanir")
    public void getUserIcinResponseBodyDogrulanir() {
        assertEquals(getResponsePojoExpectedData.getId(), getResponsePojoactualData.getId());
        assertEquals(getResponsePojoExpectedData.getFirstName(), getResponsePojoactualData.getFirstName());
        assertEquals(getResponsePojoExpectedData.getLastName(), getResponsePojoactualData.getLastName());
        assertEquals(getResponsePojoExpectedData.getPhone(), getResponsePojoactualData.getPhone());
        assertEquals(getResponsePojoExpectedData.getEmail(), getResponsePojoactualData.getEmail());

    }










    @Given("Patch users auth icin URL duzenlenir")
    public void theURLForUserInformationChangeIsPrepared() {
        specc.pathParams("first", "users", "second", "auth");
    }

    @When("Kullanıcı bilgilerini değiştirmek için gerekli payload hazırlanır.")
    public void thePayloadForUserInformationChangeIsPrepared() {
        patchPayload = new US05_UsersPatchPayloadPojo("Patch", "Success", "(121) 212-3445",
                "Api.1234", "apicustomer@gmail.com","CUSTOMER");
    }


    @Then("Kullanıcı bilgilerini değiştirmek için bir PATCH request gonderilir ve Response alinir")
    public void aPATCHRequestIsSentForUserInformationChangeAndTheResponseIsReceived() {
        response=given(specc).body(patchPayload).when().patch("{first}/{second}");
        expectedDataPatch = response.as(US05_UsersPatchResponsePojo.class);
        response.prettyPrint();

    }


   @And("Kullanıcı bilgilerini değiştirme işlemi için Status kodunun {int} oldugu dogrulanir")
   public void kullanıcıBilgileriniDeğiştirmeIşlemiIçinStatusKodununOlduguDogrulanir(int statusCode) {
       assertEquals(statusCode, response.getStatusCode());
   }

    @And("Kullanıcı bilgilerini değiştirme işlemi için Response body dogrulanir")
    public void theResponseBodyForUserInformationChangeIsVerified() {
        assertEquals(patchPayload.getFirstName(), expectedDataPatch.getFirstName());
        assertEquals(patchPayload.getLastName(), expectedDataPatch.getLastName());



    }


    @Given("User forgot-password icin URL duzenlenir")
    public void userForgotPasswordIcinURLDuzenlenir() {
        specc.pathParams("first", "users", "second", "forgot-password");
    }

    @When("User forgot-password icin POST request gonderilir ve response alinir")
    public void userForgotPasswordIcinPOSTRequestGonderilirVeResponseAlinir() {


    }

    @Then("User forgot-password icin Status kodunun {int} oldugu dogrulanir")
    public void userForgotPasswordIcinStatusKodununOlduguDogrulanir(int statusCode) {

    }




    @Given("Giriş yapılmış kullanıcı hesabini silmek icin URL duzenlenir")
    public void kendiHesabiniSilmekIcinURLDuzenlenir() {

        specc.pathParams("first", "users", "second", "auth");

    }

    @When("Giriş yapılmış kullanıcı hesabini silmek icin DELETE request gonderilir ve response alinir")
    public void kendiHesabiniSilmekIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(specc).when().delete("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Giriş yapılmış kullanıcı hesabini silmek icin Status kodunun {int} oldugu dogrulanir")
    public void kendiHesabiniSilmekIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }










    @Given("Patch User Role Update icin URL duzenlenir")
    public void patchUserIcinURLDuzenlenir() {
        spec.pathParams("first", "users", "second", userId, "third", "role", "fourth", "admin");
    }

    @And("Patch User Role Update icin expected data duzenlenir")
    public void patchUserIcinExpectedDataDuzenlenir() {
        patchPayload = new US05_UsersPatchPayloadPojo("Api", "Customer",
                "(121) 212-3445", "Api.1234", "apicustomer@gmail.com","ADMIN");
    }

    @When("Patch User Role Update icin PATCH request duzenlenir")
    public void patchUserIcinGETRequestDuzenlenir() {
        response = given(spec).body(patchPayload).when().patch("{first}/{second}/{third}/{fourth}");
        actualDataPatch = response.as(US05_UsersPatchResponsePojo.class);
        userId = actualDataPatch.getId();
        response.prettyPrint();
    }

    @Then("Patch User Role Update icin Status kodunun {int} oldugu dogrulanir")
    public void patchUserIcinStatusKodununOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Patch User Role Update icin Response body dogrulanir")
    public void patchUserIcinResponseBodyDogrulanir() {
        assertEquals(patchPayload.getRole(), actualDataPatch.getRole());
    }



}
