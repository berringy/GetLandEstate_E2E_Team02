package getland.stepdefs.ui_stepdefs.us01_stepdefs;


import getland.utilities.Authentication;
import getland.utilities.ConfigReader;
import getland.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class HookUS_01 {

    /*
    Hooks classinda @api tagi ile api testlerine özel bir before method olusturduk
    Bu sayede base url gibi ayri bir yapiya ihtiyac kalmadi, daha sade oldu
     @Before("@apie2e") yazdigimizda artik sadece @apie2e tagina sahip olan scenariolar
     icin özellestirdik
     */

    @After()
    public void tearDown() {
        Driver.closeDriver();
    }



}
