package getland.stepdefs.api_stepdefs.us05_stepdefs;

import getland.utilities.ConfigReader;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class US05_ApiCustomerHook {

    public static String us05CustomerToken(){

        String url ="http://64.227.123.49:8092/users/login";

        String credentials="{\n" +
                "    \"email\": \"apicustomer@gmail.com\",\n" +
                "    \"password\": \"Api.1234\"\n" +
                "}";


        Response response = given().body(credentials).contentType(ContentType.JSON).when().post(url);

        return response.jsonPath().getString("token");
    }

        public static RequestSpecification specc;

        @Before("@ApiCustomer_US05")
        public void setUp() throws Exception {
            specc = new RequestSpecBuilder()
                    .setBaseUri(ConfigReader.getProperty("apiUrl"))
                    .setContentType(ContentType.JSON)
                    .addHeader("Authorization","Bearer " + us05CustomerToken())
                    .build();


        }


}

