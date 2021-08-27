package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Projeto_Base/src/test/features",
        glue = {"gherkin.stepDefinition", "gherkin.hook"},
        tags = {"@Login"},
        plugin = {"pretty", "html:target/report-html"},

        monochrome = true
//        snippets = SnippetType.CAMELCASE,
//        dryRun = false
        //strict = false
)
public class Runner {

}