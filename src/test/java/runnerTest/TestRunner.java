package runnerTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber-html-reports/cucumber.json"},
        snippets = cucumber.api.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        features = {"src/test/resources/features/steps"},
        //tags = {"@today"},
        //tags = {"@login"},
        tags = {"@homePage"},
        glue = {"stepDefinition"}
)
public class TestRunner {
}
