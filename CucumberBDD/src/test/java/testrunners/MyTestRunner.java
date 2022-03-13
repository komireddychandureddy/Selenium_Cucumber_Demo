package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/resources/AppFeatures"},
		features = {"src/test/resources/AppFeatures/AccountsPage.feature"},
		glue = {"stepdefinitions", "ApplicationHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"timeline:test-output-thread/",
				//"html:test-output/cucumber/report.html",
				"json:target/json-report/cucumber.json"				
		})

public class MyTestRunner {

}
