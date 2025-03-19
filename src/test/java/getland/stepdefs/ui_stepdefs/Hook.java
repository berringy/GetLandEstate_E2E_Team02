<<<<<<< HEAD:src/test/java/getland/stepdefs/ui_stepdefs/Hook.java
package getland.stepdefs.ui_stepdefs;
=======

package getland.utilities;
>>>>>>> 4d335517c8846cd71db02b646bece95f9d2c3558:src/test/java/getland/stepdefs/Hook.java


import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Hook {

    /*
    Hooks classinda @api tagi ile api testlerine özel bir before method olusturduk
    Bu sayede base url gibi ayri bir yapiya ihtiyac kalmadi, daha sade oldu
     @Before("@apie2e") yazdigimizda artik sadece @apie2e tagina sahip olan scenariolar
     icin özellestirdik
     */
    public static RequestSpecification spec;

    @Before("@apie2e")
    public void setUp() throws Exception {
        spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("baseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + Authentication.generateToken())
                .build();
    }


}
