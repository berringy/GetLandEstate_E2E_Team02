package getland.stepdefs.api_stepdefs.us03_09stepdefs;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Adminauthentication {


    public static String generateToken(){

        String url ="http://64.227.123.49:8092/users/login";

        String credentials="{\n" +
                "  \"password\": \"123Tech.\",\n" +
                "  \"username\": \"berringyilmaz@gmail.com\"\n" +
                "}";


        Response response = given().body(credentials).contentType(ContentType.JSON).when().post(url);

        return response.jsonPath().getString("token");

    }
}