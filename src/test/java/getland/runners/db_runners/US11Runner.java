package getland.runners.db_runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junitin entegre olmasini ve scenariolarin calistirilmasini saglayan notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimizi ve hangi raporlari alacagimizi belirtiriz
        plugin = {
                "pretty",//konsol da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-dbus11cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/dbus11cucumber.xml"
        },
        features = "src/test/resources/features/db_features/US11_DB_Logs.feature",
        glue = {"getland/stepdefs/db_stepdefs/us11_stepdefs"},
        tags = "@dbus11",
        dryRun = false
)
public class US11Runner {
}
