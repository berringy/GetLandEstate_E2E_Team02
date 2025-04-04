package getland.runners.api_runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junitin entegre olmasini ve scenariolarin calistirilmasini saglayan notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimizi ve hangi raporlari alacagimizi belirtiriz
        plugin = {
                "pretty",//konsol da scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-apius08cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/apius08cucumber.xml"
        },
        features = "src/test/resources/features/api_features/US08_API_GETLOGS.feature",
        glue = {"getland/stepdefs/api_stepdefs/us08_stepdefs"},
        tags = "@apius08",
        dryRun = false
)
public class US08Runner {
}
