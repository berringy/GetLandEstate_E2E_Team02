<<<<<<< HEAD:src/test/java/getland/stepdefs/ui_stepdefs/Hook.java
package getland.stepdefs.ui_stepdefs;








import getland.utilities.Driver;
import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

=======
package getland.stepdefs;


import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import getland.utilities.Authentication;
import getland.utilities.ConfigReader;
>>>>>>> 30a489d737dedca17828ebabb9318d462cb34ab9:src/test/java/getland/stepdefs/Hook.java

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
