package StepDefinition;

import io.cucumber.java.en.*;
import org.Pages.Page1;
import org.Pages.Page2;
import org.Pages.Page3;
import org.Screenshot.ScreenshotTestcase1;
import org.testng.Assert;
import org.testng.Reporter;

public class TestCase2 {
    @And("User enters the {string} data")
    public void user_enters_the_data(String string) {
        Page1.Seachdata(string);
    }
    @Then("User enters the search Icon or Press Enter")
    public void user_enters_the_search_icon_or_press_enter() throws Exception{
        Page1.Enterdata();
    }
    @Then("User verifies the {string} results")
    public void user_verifies_the(String string) {
        try {
            ScreenshotTestcase1.TakeScreenShot(string);
            Assert.assertTrue(Page2.VerificationPage2().contains(string));
        } catch (AssertionError e) {
            System.out.println(e);
            Reporter.log(e.getMessage());
        }
    }

    @When("User selects the {string} product")
    public void user_selects_the_product(String string) throws Exception{
        Page2.SelectProduct(string);
    }
    @And("User verifies the {string} product results")
    public void user_verifies_the_results(String string) throws Exception {
        try {
            ScreenshotTestcase1.TakeScreenShot(string);
            Assert.assertTrue(Page3.VerificationPage3().contains(string));
        } catch (AssertionError e) {
            System.out.println(e);
            Reporter.log(e.getMessage());
        }
    }

}
