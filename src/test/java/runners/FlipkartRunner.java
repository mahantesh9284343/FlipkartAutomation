package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src//test//resources//features//SearchItem.feature",
		glue = "stepDefs",
		monochrome = true,
		dryRun=false,
		plugin = {"pretty",
				"html:target/reports/HtmlReport.html",
				"json:target/reports/JsonReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
)

public class FlipkartRunner extends AbstractTestNGCucumberTests {
 
}
