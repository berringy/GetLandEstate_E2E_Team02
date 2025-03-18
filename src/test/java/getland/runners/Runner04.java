package getland.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {
                "pretty",//console da scenariolarimizla alakali ayrintili bilgi verir
               "html:target/default-cucumber-reports1.html",
               "json:target/json-reports/cucumber1.json",
               "junit:target/xml-reports/cucumber1.xml",
                "rerun:TestOutput/failed_scenario.txt"
        },
        features = "src/test/resources/features/ui_features/",
        glue = {"getland/stepdefs/ui_stepdefs/us04_stepdefs", "getland/hooks"},
        tags = "@US04",
        dryRun = false ,// true iken testleri CALISTIRMAZ feature file da ki test scenariolarimizin tamamini kontrol ederek eksik step definitionlari kontrol eder ve varsa verir
        monochrome = false//true iken console daki cıktılari tek renk yapar
)
@RunWith(Cucumber.class)//Cucumber ile junit in entegre bir sekilde calistirilmasini saglar
public class Runner04 {
}
/*
    @CucumberOptions parantez icinde belirttigimiz parametreler ile hangi testleri calistiracağımızı,
    feature file larimizin ve stepdefiniton larimizin hangi konumda bulunduklarini, hangi raporlar alacağımızı
    ayarlayabiliriz

    "rerun:TestOutput/failed_scenario.txt" kodu sayesinde cucumber fail olan scenariolarimizi failed_scenario.txt dosyasi icerisinde
    otomatik olarak kayit eder, eğer bir test gecer ise buradan otomatik olarak siler
 */
// paralel testleri terminal kismina tikla ve (mvn clean verify) yaz calistir