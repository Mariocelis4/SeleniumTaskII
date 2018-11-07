package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class FlightFinder {


    WebDriver driver;
    private int passenger;
    private String[] city = {"London", "Zurich", "Frankfurt", "New York",
                            "Paris", "Portland", "San Francisco", "Seattle", "Sydney"};
    private String[] month = {"January", "February", "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"};
    private int idx;

    @FindBy (name="tripType")
    private WebElement ftype;
    @FindBy (name = "passCount")
    private WebElement passc;
    @FindBy (name="fromPort")
    private WebElement fport;
    @FindBy (name = "fromMonth")
    private WebElement fmon;
    @FindBy (name="fromDay")
    private WebElement fday;
    @FindBy (name="toPort")
    private WebElement tport;
    @FindBy (name ="toMonth")
    private WebElement tmon;
    @FindBy (name="toDay")
    private WebElement tday;
    @FindBy (name = "servClass")
    private List<WebElement> sclass;
    @FindBy (name = "airline")
    private WebElement aline;
    @FindBy (name = "findFlights")
    private WebElement fflights;

    public FlightFinder(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void flight_Type() throws Throwable{
        //Set to always roundtrip
    }

    public void num_Passengers()throws Throwable{
        Random num = new Random();
        passenger = num.nextInt(5)+1;
        passc.sendKeys(Integer.toString(passenger));
    }

    public void depart_City() throws Throwable{
        Random dci = new Random();
        idx = dci.nextInt(9);
        //METHOD 1
        //String rcityd = (city[idx]);
        //fport.sendKeys(rcityd);
        //System.out.println(city[idx]);

        //METHOD 2
        Select dportq = new Select(fport);
        dportq.getOptions().get(idx).getAttribute("value");
        dportq.selectByIndex(dci.nextInt(dportq.getOptions().size()));
    }


    public void depart_Date() throws Throwable{
        Random numdm = new Random();
        int dmnum = numdm.nextInt(11);
        String rdmonth =(month[dmnum]);
        fmon.sendKeys(rdmonth);

        Random numdd = new Random();
        int ddnum = numdd.nextInt(31)+1;
        fday.sendKeys(Integer.toString(ddnum));
    }

    public void arrive_City() throws  Throwable{
    Random aci = new Random();
    int idx = aci.nextInt(9);
    String rcitya = (city[idx]);
        tport.sendKeys(rcitya);
    }

    public void arrive_Date() throws Throwable{
        //METHOD 1
         Random numam = new Random();
        int amnum = numam.nextInt(11);
        String ramonth =(month[amnum]);
        tmon.sendKeys(ramonth);


        Random numad = new Random();
        int adnum = numad.nextInt(31)+1;
        tday.sendKeys(Integer.toString(adnum));
    }

    public void serv_Class() throws Throwable{
        Random sv = new Random();
        int ssc = sv.nextInt(sclass.size());
        sclass.get(ssc).click();
    }

    public void airline()throws Throwable{
        Random air = new Random();
        int aidx = air.nextInt(3);

        //METHOD 2
        Select airl = new Select(aline);
        airl.getOptions().get(aidx).getAttribute("value");
        airl.selectByIndex(air.nextInt(airl.getOptions().size()));
    }

    public void submit_click() throws Throwable{
        fflights.click();

    }


}
