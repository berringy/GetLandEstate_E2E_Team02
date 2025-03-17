package getland.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // Konsolda ayrıntılı bilgi gösterir
                "html:target/default-cucumber-report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
        },
        features = "src/test/resources/features/ui_features/",
        glue = {"getland/stepdefs/ui_stepdefs/us19_stepdefs","getland/stepdefs/ui_stepdefs/us21_stepdefs"},
        tags = "@US19 or @US21",
        dryRun = false
)
public class Runner_US19_21 {
}