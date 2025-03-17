package getland.runners;

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
                "rerun:TestOutput/failed_scenario.txt"
        },
        features = "src/test/resources/features/ui_features/",
        glue = {"getland/stepdefs/ui_stepdefs/us15_stepdefs","getland/stepdefs/ui_stepdefs/us16_stepdefs"},
        tags = "@US15 or @US16",
        monochrome = false,
        dryRun = false
)
public class Runner_US15_16 {
}