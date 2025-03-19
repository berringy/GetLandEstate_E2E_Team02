package getland.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"getland.stepdefs.ui_stepdefs.us07_stepdefs"}, // Package formatında olmalı
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"  // Başarısız testleri tekrar çalıştırmak için
        },
        monochrome = true,
        tags = "@US007", // Feature dosyasındaki senaryolara "@US007" etiketi eklenmeli
        dryRun = false
)
public class US07_Runner {
}
