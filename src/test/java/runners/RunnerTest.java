package runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features/", 
		glue = {"steps"}, 
		tags = "@login",
		plugin = {
				"html:target/report-html",
				"json:target/report.json" },
		monochrome = true, 
		snippets = SnippetType.CAMELCASE,
		dryRun = false)


public class RunnerTest {
	
	
	
}
