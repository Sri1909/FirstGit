package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resources//Feature//TestCase1.feature"},glue = {"StepDefinition"},monochrome = false,
plugin = {"pretty","html:target/CucumberReport/TestCase1.html"})

public class TestRunner extends AbstractTestNGCucumberTests {
}


/*
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Feature//TestCase1.feature",glue = {"StepDefinition"},stepNotifications = true)

public class TestRunner {

}*/
