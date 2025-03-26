package getland.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AdminAuthentication {


    public static String generateTokenGetland(){

        String url ="http://64.227.123.49:8092/users/login";

        String credentials="{\n" +
                "    \"email\": \"berringyilmaz@gmail.com\",\n" +
                "    \"password\": \"123Tech.\"\n" +
                "}";


        Response response = given().body(credentials).contentType(ContentType.JSON).when().post(url);

        return response.jsonPath().getString("token");


    }
}