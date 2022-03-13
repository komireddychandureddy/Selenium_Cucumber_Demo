package testrunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				//"html:test-output",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"json:target/json-report/cucumber.json"
				}, 
		monochrome = true,
		glue = {"stepdefinitions", "ApplicationHooks"},
		features = { "src/test/resources/AppFeatures/AccountsPage.feature" }
)

public class ParallelRun extends AbstractTestNGCucumberTests {
	@Override
	//@DataProvider(parallel = true)
	@DataProvider
	public Object[][] scenarios() {
		return super.scenarios();
	}
}