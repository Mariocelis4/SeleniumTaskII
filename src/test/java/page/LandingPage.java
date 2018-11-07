package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;
    @FindBy (name = "userName")
    private WebElement uname;
    @FindBy (name = "password")
    private WebElement pass;
    @FindBy (name = "login")
    private WebElement log;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void log_In(String username, String passw) throws Throwable{
        uname.sendKeys(username);
        pass.sendKeys(passw);
    }

    public void log_Click(){
        log.click();
    }




}
