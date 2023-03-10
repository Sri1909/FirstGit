package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src//test//resources//Feature//TestCase2.feature"},glue = {"StepDefinition"},monochrome = false,
        plugin = {"pretty","html:target/CucumberReport/TestCase2.html"})

    public class TestRunner2 extends AbstractTestNGCucumberTests {

}
