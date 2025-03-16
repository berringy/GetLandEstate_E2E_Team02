import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

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
        tags = "@US007",  // Feature dosyasında senaryolara "@US007" etiketi eklenmeli
        dryRun = false
)
public class US07_Runner {
}