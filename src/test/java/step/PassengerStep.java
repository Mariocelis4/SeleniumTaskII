package step;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import page.PassengerTicket;

public class PassengerStep extends DriverFactory {

    @And("^Enter passengers info$")
    public void passenger_info() throws Throwable{
        new PassengerTicket(driver).passenger_name();
    }

    @And("^Enter payment info$")
    public void creditcard() throws Throwable{
        new PassengerTicket(driver).credit_card();
    }

    @And("^Enter billing address$")
    public void billing() throws Throwable{
        new PassengerTicket(driver).billing_add();
    }
    @And("^Enter delivery address$")
    public void delivery() throws Throwable{
        new PassengerTicket(driver).delivery_add();
    }

    @Then("^Access complete flight details page$")
    public  void f_Purchase()throws Throwable {
        new PassengerTicket(driver).purchase();
    }
}
