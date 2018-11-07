package page;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class PassengerTicket {

    private WebDriver driver;

    private String male_name[]={"Bruce", "Barry", "Wade", "Oliver",
                                "Steve", "Tony", "Clark", "Steven"};
    private String male_surname[]={"Wayne", "Allen", "Wilson","Queen",
                                    "Rodgers", "Stark", "Kent", "Strange"};
    private String female_name[]={"Sue", "Elecktra", "Kitty", "Wanda", "Patience"};
    private String female_surname[]={"Storm", "Natchios", "Pryde", "Maximoff", "Phillips"};
    private String city[]={"Gotham", "Central City", "Montreal", "Star City", "Queens",
                            "New York", "Metropolis", "Manhattan"};
    private String add1[]={"Boulevard Ave.", "Hollywood Ave.", "Central Ave.", "Lincoln Street",
                                "Independence Hall", "Daily Bugle", "Magic Arts Street"};
    private String add2[]={"Diagonal 42581", "Corner 8979", "Across Avengers Tower", "White house"};
    private static String  ccfname = "test";
    private static String cclname;
    private static String dadd1;
    private static String dadd2;
    private static String dcity;
    private static String dzipv;


    @FindBy(name="passFirst0")
    private WebElement passfn0;
    @FindBy(name="passFirst1")
    private WebElement passfn1;
    @FindBy(name="passFirst2")
    private WebElement passfn2;
    @FindBy(name="passFirst3")
    private WebElement passfn3;

    @FindBy(name="passLast0")
    private WebElement passln0;
    @FindBy(name="passLast1")
    private WebElement passln1;
    @FindBy(name="passLast2")
    private WebElement passln2;
    @FindBy(name="passLast3")
    private WebElement passln3;

    @FindBy (name="pass.0.meal")
    private WebElement passm0;
    @FindBy (name="pass.1.meal")
    private WebElement passm1;
    @FindBy (name="pass.2.meal")
    private WebElement passm2;
    @FindBy (name="pass.3.meal")
    private WebElement passm3;

    @FindBy (name="creditCard")
    private WebElement credit;
    @FindBy (name="creditnumber")
    private WebElement creditnum;
    @FindBy (name="cc_exp_dt_mn")
    private WebElement creditexmon;
    @FindBy (name="cc_exp_dt_yr")
    private WebElement creditexyr;
    @FindBy (name="cc_frst_name")
    private WebElement ccfn;
    @FindBy (name="cc_mid_name")
    private WebElement ccmn;
    @FindBy (name="cc_last_name")
    private WebElement ccln;

    @FindBy (name="billAddress1")
    private WebElement baddress1;
    @FindBy (name="billAddress2")
    private WebElement baddress2;
    @FindBy (name ="billCity")
    private WebElement bcity;
    @FindBy (name="billState")
    private WebElement bstate;
    @FindBy (name="billZip")
    private WebElement bzip;

    @FindBy (name="delAddress1")
    private WebElement daddress1;
    @FindBy (name="delAddress2")
    private WebElement daddress2;
    @FindBy (name ="delCity")
    private WebElement dcit;
    @FindBy (name="delState")
    private WebElement dstate;
    @FindBy (name="delZip")
    private WebElement dzip;

    @FindBy (name="buyFlights")
    private WebElement buy;

    public PassengerTicket(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void passenger_name() throws Throwable {
        Random name0 = new Random();
        int idx = name0.nextInt(8);
        //METHOD 1
        String malename0 = (male_name[idx]);
        String malesurname0 = (male_surname[idx]);
        passfn0.sendKeys(malename0);
        passln0.sendKeys(malesurname0);

        Random rmeal0 = new Random();
        Select meal0 = new Select(passm0);
        int m0 = rmeal0.nextInt(meal0.getOptions().size());
        meal0.selectByIndex(m0);

        ccfname = malename0;
        cclname = malesurname0;

       /* //If more passengers

        ///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td/table/tbody/tr[2]/td[2]/input
            Random fname1 = new Random();
            int fidx1 = fname1.nextInt(4);
            String femalename1 = (female_name[fidx1]);
            String femalesurname1 = (female_surname[fidx1]);
            passfn1.sendKeys(femalename1);
            passln1.sendKeys(femalesurname1);*/
        }
        /*if (passfn2.isEnabled()){
            Random fname2 = new Random();
            int fidx2 = fname2.nextInt(4);
            String femalename2 = (female_name[fidx2]);
            String femalesurname2 = (female_surname[fidx2]);
            passfn2.sendKeys(femalename2);
            passln2.sendKeys(femalesurname2);
        }
        if (passfn3.isEnabled()) {
            Random name2 = new Random();
            int idx2 = name2.nextInt(8);
            String malename2 = (male_name[idx2]);
            String malesurname2 = (male_surname[idx2]);
            passfn3.sendKeys(malename2);
            passln3.sendKeys(malesurname2);
        }*/


    public void credit_card() throws Throwable {

        // METHOD 2
        Random randcc = new Random();
        Select cc = new Select(credit);
        int a = randcc.nextInt(cc.getOptions().size());
        cc.selectByIndex(a);


        //Card number
        String ccn = "";
        for (int i = 0; i < 16; i++) {
            Random auxRand = new Random();
            ccn += auxRand.nextInt(10);
        }
        creditnum.sendKeys(ccn);

        // Experiation date
        Random randmon = new Random();
        Select rm = new Select(creditexmon);
        int b = randmon.nextInt(rm.getOptions().size());
        if (b==0){
            b++;
        }
        rm.selectByIndex(b);

        Random randyr = new Random();
        Select ry = new Select(creditexyr);
        int c = randyr.nextInt(ry.getOptions().size());
        if (c==0){
            c++;
        }
        ry.selectByIndex(c);

        //Names
        ccfn.sendKeys(this.ccfname);
        ccln.sendKeys(cclname);
    }


    public void billing_add() throws Throwable{
        //Clear
        baddress1.clear();
        baddress2.clear();
        bcity.clear();
        bstate.clear();
        bzip.clear();
        //add1
        Random iaddress1 = new Random();
        int iadd1 = iaddress1.nextInt(6);
        String radd1 = (add1[iadd1]);

        baddress1.sendKeys(radd1);

        //add2
        Random iaddress2 = new Random();
        int iadd2 = iaddress2.nextInt(4);
        String radd2 = (add2[iadd2]);

        baddress2.sendKeys(radd2);

        //city
        Random rcity = new Random();
        int idx = rcity.nextInt(7);
        String cityname = (city[idx]);

        bcity.sendKeys(cityname);

        //Zip Code
        String pz = "";
        for(int i = 0; i < 5; i++){
            Random auxRand = new Random();
            pz += auxRand.nextInt(10);
        }
        bzip.sendKeys(pz);
        bstate.sendKeys("New York");
        dadd1 = radd1;
        dadd2 = radd2;
        dcity = cityname;
        dzipv = pz;
    }

    public void delivery_add()throws Throwable{
        daddress1.clear();
        daddress1.sendKeys(dadd1);
        daddress2.clear();
        daddress2.sendKeys(dadd2);
        dcit.clear();
        dcit.sendKeys(dcity);
        dstate.clear();
        dstate.sendKeys("New York");
        dzip.clear();
        dzip.sendKeys(dzipv);
    }

    public void purchase() throws Throwable{
    buy.click();
    }
}
