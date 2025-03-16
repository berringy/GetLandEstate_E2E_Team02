package getland.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

<<<<<<< HEAD:src/test/java/getland/runners/Runner.java
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"getland/stepdefs/ui_stepdefs", "getland/hooks"}, // Hooks burada ekli
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"  // Fail olan testleri tekrar çalıştırmak için kaydet
        },
        monochrome = true,
        tags = "@US006",  // Feature dosyasında senaryolara "@US006" etiketi eklenmeli
        dryRun = false
)
public class Runner{
=======
@RunWith(Cucumber.class)//Cucumber ile junitin entegre olmasini ve scenariolarin calistirilmasini saglayan notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimizi ve hangi raporlari alacagimizi belirtiriz
        plugin = {
                "pretty",//konsol da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features/ui_features/US01_UI_CustomerRegisters.feature",
        glue = {"getland/stepdefs/ui_stepdefs/us01_stepdefs"},
        tags = "@UIUS01",
        dryRun = false
)
public class US01Runner {
>>>>>>> f473797d6fea45b4d55cd56ab01a9dd9a4c09cc0:src/test/java/getland/runners/US01Runner.java
}