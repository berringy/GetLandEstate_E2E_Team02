
package getland.stepdefs.api_stepdefs.us04_stepdefs;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import getland.utilities.ConfigReader;

public class Hook {

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
                .setBaseUri(ConfigReader.getProperty("baseUrll"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + Authentication.generateToken())
                .build();
    }


}
