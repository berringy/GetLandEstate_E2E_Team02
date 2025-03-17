package getland.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junitin entegre olmasini ve scenariolarin calistirilmasini saglayan notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimizi ve hangi raporlari alacagimizi belirtiriz
        plugin = {
                "pretty",//konsol da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
<<<<<<<< HEAD:src/test/java/getland/runners/Runner_US05.java
        features = "src/test/resources/features/ui_features/us05.feature",
        glue = "getland/stepdefs/ui_stepdefs/US05_stepdefs",
        tags = "@US05",
        dryRun = false
)
public class Runner_US05 {
========
        features = "src/test/resources/ui_feautures",
        glue = {"getland/stepdefs/ui_stepdefs"},
        tags = "@US03",
        dryRun = false
)
public class US03Runner {
>>>>>>>> master:src/test/java/getland/runners/US03Runner.java
}