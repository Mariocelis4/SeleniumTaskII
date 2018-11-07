package step;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import page.LandingPage;
import step.DriverFactory;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LandingStep extends DriverFactory {

        @Before
        public void presetup (){
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.gecko.driver", projectLocation +"\\src\\lib\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }


        @Given("^User enters page and has credentials$")
        public void setup() throws Throwable {
            driver.get("http://newtours.demoaut.com");
            driver.manage().window().maximize();
        }

        @When("^Enters user name as([^\\\"]*)and enter user password as ([^\\\"]*)$")
        public void log_In(String username, String passw) throws Throwable{
            new LandingPage(driver).log_In(username, passw);
        }

        @Then("^Access flight information page$")
        public void log_Click() throws Throwable{
            new LandingPage(driver).log_Click();
        }
}

