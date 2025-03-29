package getland.stepdefs.api_stepdefs.us03_09stepdefs;


import getland.utilities.ConfigReader;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CustomerHook {

    /*
    Hooks classinda @api tagi ile api testlerine özel bir before method olusturduk
    Bu sayede base url gibi ayri bir yapiya ihtiyac kalmadi, daha sade oldu
     @Before("@apie2e") yazdigimizda artik sadece @apie2e tagina sahip olan scenariolar
     icin özellestirdik
     */
    public static RequestSpecification spec;

    @Before
    public void setUp() throws Exception {
        spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("baseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + Customerauthentication.generateToken())
                .build();
}
}
