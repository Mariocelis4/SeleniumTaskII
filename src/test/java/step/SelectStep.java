package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import page.SelectFlight;

public class SelectStep extends DriverFactory{

    @And("^Choose depart flight$")
    public void depart() throws Throwable{
        new SelectFlight(driver).choose_out();
    }

    @And("^Choose return flight$")
    public void ret() throws Throwable{
        new SelectFlight(driver).choose_ret();
    }

    @Then("^Access passengers info page$")
    public void cont() throws Throwable{
        new SelectFlight(driver).reserve();
    }
}
