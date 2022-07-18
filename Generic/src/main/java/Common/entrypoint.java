package Common;

import Reports.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class entrypoint {

    // Global variable
    public static WebDriver driver = null;
    public ExtentReports extender; // Why should I make this static???

    @BeforeSuite
    public void extentSetup(){
        extender = ExtentManager.getExtentInstance();

    }

    @AfterSuite // This does not work! Causing empty report. Why is it not working???????????????
    public void AfterMethodExtent(){
        extender.flush();
    }



    @Parameters({"browser","URL"})
    @BeforeMethod
    public void setup(@Optional("Chrome") String browser, @Optional("https://www.amazon.com/") String URL) throws IOException {
        GetDriver(browser);
        driver.get(URL);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver GetDriver(String browsername) throws IOException
    { //Need parameters // Throws IO exception??
                        // Cant find driver
        if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\rober\\IdeaProjects\\PageObjectModelPractice\\Generic\\src\\main\\java\\Drivers\\chromedriver.exe");// This is not Bad practice!!!
            driver = new ChromeDriver();    // Having issue with assign relative path
        } else if (browsername.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\rober\\IdeaProjects\\PageObjectModelPractice" +
                                "\\Generic\\src\\main\\java\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver(); // Doesnt work
        } else if(browsername.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\rober\\IdeaProjects\\PageObjectModelPractice" +
                                "\\Generic\\src\\main\\java\\Drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browsername.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\rober\\IdeaProjects\\PageObjectModelPractice" +
                              "\\Generic\\src\\main\\java\\Drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        return driver;
    }

    @AfterMethod
    public void cleanup(){
        driver.close();
    }


}
