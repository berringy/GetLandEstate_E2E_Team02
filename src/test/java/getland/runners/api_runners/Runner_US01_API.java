package getland.runners.api_runners;

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
        features = "src/test/resources/features/api_features",
        glue = "getland/stepdefs/api_stepdefs",
        tags = "@US01API",
        monochrome = false,
        dryRun = false
)
public class Runner_US01_API {
}