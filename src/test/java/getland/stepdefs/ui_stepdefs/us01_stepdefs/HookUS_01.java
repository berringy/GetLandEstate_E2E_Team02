package getland.stepdefs.ui_stepdefs.us01_stepdefs;


import getland.utilities.Driver;
import io.cucumber.java.After;

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
