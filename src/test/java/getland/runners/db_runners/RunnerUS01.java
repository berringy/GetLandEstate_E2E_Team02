package getland.runners.db_runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // Konsolda ayrıntılı bilgi gösterir
                "html:target/default-cucumber-report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
        },
        features = "src/test/resources/features/db_features",
        glue = "getland/stepdefs/db_stepdefs/us01_stepdefs",
        tags = "@DB_US01",
        monochrome = false,
        dryRun = false
)
public class RunnerUS01 {
}
