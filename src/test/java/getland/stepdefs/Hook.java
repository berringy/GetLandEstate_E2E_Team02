package getland.utilities;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import getland.utilities.Authentication;
import getland.utilities.ConfigReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hook {

    /*
    Hooks classinda @api tagi ile api testlerine özel bir before method olusturduk
    Bu sayede base url gibi ayri bir yapiya ihtiyac kalmadi, daha sade oldu
     @Before("@apie2e") yazdigimizda artik sadece @apie2e tagina sahip olan scenariolar
     icin özellestirdik
     */

    private WebDriver driver;
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



