package getland.stepdefs.api_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US07_API_ReportController_Stepdefs {

    protected RequestSpecification spec;
    private Map<String, String> queryParams;
    private Response response;
    private static String token ;

    // Token almak için method
    public static String getAuthToken(String email, String password) {
        //String email = ConfigReader.getProperty("adminEmail");
        //String password = ConfigReader.getProperty("adminPassword");

        Response response = given()
                .contentType(ContentType.JSON)
                .body("{\"email\": \"" + email + "\", \"password\": \"" + password + "\"}")
                .post("http://64.227.123.49:8092/users/login"); // Login URL

        // Response'tan token'ı al
        token = response.jsonPath().getString("token");
        return token;
    }

    // Base URL ve Path parametrelerini ayarla
    @Given("Base url and path parameter {string} are set")
    public void baseURLAndPathParameterAreSet(String pathParams) {
        // Token'ı alıyoruz ve authorization header'ını set ediyoruz
        getAuthToken(ConfigReader.getProperty("adminEmail"), ConfigReader.getProperty("adminPassword"));

        spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("apiBaseUrl"))
                .setBasePath(pathParams)
                .addHeader("Authorization", "Bearer " + token)  // Authorization header
                .build();
    }

    @And("Payload setup with startDate {string}, endDate {string}, status {string}, advert type {string}, and category {string}")
    public void setupPayload(String startDate, String endDate, String status, String advertType, String category) {
        /* spec.queryParam("startDate", startDate)
                .queryParam("endDate", endDate)
                .queryParam("status", status)
                .queryParam("advertType", advertType)
                .queryParam("category", category); */

        queryParams = new HashMap<>();
        queryParams.put("startDate", startDate);
        queryParams.put("endDate", endDate);
        queryParams.put("status", status);
        queryParams.put("advertType", advertType);
        queryParams.put("category", category);
    }

    @When("a GET request is sent to the API")
    public void sendGetRequestAndReceiveResponse() {
       // response = given(spec).when().get();
        response = given(spec).queryParams(queryParams).when().get();
    }

    @Then("The response status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("The response content type should be {string}")
    public void responseContentTypeShouldBe(String expectedContentType) {
        assertEquals(expectedContentType, response.getContentType());
    }

    @And("The response should be an Excel file")
    public void responseShouldBeAnExcelFile() {
        String contentType = response.getContentType();
        assertEquals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", contentType);

        // Gelen binary response'u bir dosyaya kaydedelim (Excel dosyası olarak açılabilir)
        try {
            byte[] fileData = response.getBody().asByteArray();
            File outputFile = new File("US07_API_Report.xlsx");
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            fileOutputStream.write(fileData);
            fileOutputStream.close();

            System.out.println("Excel report has been saved as US07_API_Report.xlsx");
            assertTrue(outputFile.exists());
        } catch (IOException e) {
            e.printStackTrace();
            fail("Failed to save the response as an Excel file");
        }
    }

    @And("Query parameter {string} is set to {string}")
    public void setQueryParameter(String key, String value) {
        //spec.queryParam(amount, value);
        queryParams = new HashMap<>();
        queryParams.put(key, value);
    }

    @And("The response body should contain total counts")
    public void theResponseBodyShouldContainTotalCounts() {
        assertTrue(response.body().asString().contains("totalAdverts"));
        assertTrue(response.body().asString().contains("totalUsers"));
        assertTrue(response.body().asString().contains("totalAdvertTypes"));
        assertTrue(response.body().asString().contains("totalTourRequests"));
        assertTrue(response.body().asString().contains("totalCategories"));
    }


    @And("The response should contain the correct total counts")
    public void theResponseShouldContainTheCorrectTotalCounts() {

        int totalAdverts = response.jsonPath().getInt("totalAdverts");
        int totalUsers = response.jsonPath().getInt("totalUsers");
        int totalAdvertTypes = response.jsonPath().getInt("totalAdvertTypes");
        int totalTourRequests = response.jsonPath().getInt("totalTourRequests");
        int totalCategories = response.jsonPath().getInt("totalCategories");

        // Burada toplam sayıları kontrol edebiliriz (örneğin, sayıları doğrulamak için minimum değerler belirleyebiliriz)
        assertTrue(totalAdverts > 0);
        assertTrue(totalUsers > 0);
        assertTrue(totalAdvertTypes > 0);
        assertTrue(totalTourRequests > 0);
        assertTrue(totalCategories > 0);
    }


    @When("a GET request is sent to the API without query parameters")
    public void aGETRequestIsSentToTheAPIWithoutQueryParameters() {
        response = given(spec).when().get();
    }


    @And("Payload setup with startDate {string}, endDate {string}, and status {string}")
    public void payloadSetupWithStartDateEndDateAndStatus(String startDate, String endDate, String status) {

        queryParams = new HashMap<>();

        // Parametreleri queryParams Map'ine ekle
        queryParams.put("startDate", startDate);
        queryParams.put("endDate", endDate);
        queryParams.put("status", status);
    }
}