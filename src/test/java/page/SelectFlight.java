package page;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SelectFlight {

    private WebDriver driver;

    @FindBy (name="outFlight")
    private List<WebElement> oflight;
    @FindBy (name ="inFlight")
    private List<WebElement> iflight;
    @FindBy (name="reserveFlights")
    private WebElement reserve;

    public SelectFlight(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void choose_out() throws Throwable{
        Random rof = new Random();
        int iro = rof.nextInt(oflight.size());
        oflight.get(iro).click();
    }

    public void choose_ret() throws Throwable{
        Random rret = new Random();
        int ire = rret.nextInt(iflight.size());
        iflight.get(ire).click();
    }

    public void reserve() throws Throwable{
        reserve.click();
    }

}
