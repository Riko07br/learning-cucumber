package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/rental.feature",
        tags = "not @ignore",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "Steps",
        plugin = {"pretty"})
//@CucumberOptions(stepNotifications = true)
public class Runner {
}
