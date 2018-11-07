package step;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import page.FlightFinder;

public class FinderStep extends DriverFactory{

    @And("^Choose flight type as roundtrip$")
    public void flight_Type() throws Throwable{
        new FlightFinder(driver).flight_Type();
    }

    @And("^Choose number passenger$")
    public void num_Passengers()throws Throwable{
        new FlightFinder(driver).num_Passengers();
    }

    @And("^Choose departing airport$")
    public void depart_City()throws Throwable{
        new FlightFinder(driver).depart_City();
    }

    @And("^Choose departing date$")
    public void depart_Date()throws Throwable{
        new FlightFinder(driver).depart_Date();
    }

    @And("^Choose arriving airport$")
    public void arrive_City() throws Throwable{
        new FlightFinder(driver).arrive_City();
    }

    @And("^Choose arriving date$")
    public void arrive_Date()throws Throwable{
        new FlightFinder(driver).arrive_Date();
    }

    @And("^Choose service class$")
    public void service() throws Throwable{
        new FlightFinder(driver).serv_Class();
    }

    @And("^Choose airline preference$")
    public void airline_pref() throws Throwable{
        new FlightFinder(driver).airline();
    }

    @Then("^Access flight options page$")
    public void submit() throws  Throwable{
        new FlightFinder(driver).submit_click();
    }
}

