package getland.stepdefs.api_stepdefs.us06_stepdefs;

import getland.utilities.AdminAuthentication;


import getland.utilities.ConfigReader;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class US06_ApiAdminHook {


    /*
 Hooks classinda @apie2e tagi ile api testlerine özel bir before method olusturduk
 Bu sayede base url gibi ayri bir yapiya ihtiyac kalmadi, daha sade oldu
  @Before("@apie2e") yazdigimizda artik sadece @apie2e tagina sahip olan scenariolar
  icin özellestirdik
  */
    public static RequestSpecification spec;

    @Before("@us06contact")
    public void setUp() throws Exception {
        System.out.println("✅ @Before metodu çalıştı!");
        spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("apiUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization","Bearer " + AdminAuthentication.generateTokenGetland())
                .build();
    }
}




