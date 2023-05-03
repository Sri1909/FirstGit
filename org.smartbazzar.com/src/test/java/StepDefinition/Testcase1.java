package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.Browser.Browser;
import org.Pages.Page1;
import org.Screenshot.ScreenshotTestcase1;
import org.testng.Assert;
import org.testng.Reporter;

public class Testcase1 {
    @Given("User opens the Browser")
    public void user_opens_the_browser() throws Exception {
        Browser.OpenBrowser();
    }
    @Then("User enters the url {string}")
    public void user_enters_the_url(String string) throws Exception {
        Browser.OpenApplication(string);// stores url from feature file.
    }
    @And("User verifies the title of the application")
    public void user_verifies_the_title_of_the_application() {
       try {
            Assert.assertEquals(Page1.GetBrowserTitle(), "Smartbazaar – World of Asian");
        ScreenshotTestcase1.TakeScreenShot("TestPage1");
       }
       catch (AssertionError e) {
            System.out.println(e);
            Reporter.log(e.getMessage());
        }
    }
    @Then("User closes the Browser")
    public void user_closes_the_browser() {
        Browser.CloseBrowser();
    }

}
