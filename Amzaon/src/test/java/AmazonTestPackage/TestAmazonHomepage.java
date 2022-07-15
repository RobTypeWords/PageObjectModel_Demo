package AmazonTestPackage;

import Common.entrypoint;
import Home.AmazonHomePage;
import Reports.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test(groups = {"All"}) // This is to run them ALL!!!!!! This will run on this Suite level
public class TestAmazonHomepage extends entrypoint {
    public ExtentReports extender; // This has no shared memory of other extender

    // What is the best way of accessing Extent methods from here????
    @Test (groups = {"Regression"}) // Tag for groups
    public void AmazonLandPage (){

       // extender = ExtentManager.getExtentInstance(); // Whats this??
       // ExtentTest tester = extender.createTest("Intial Test2"); // Whats this???
        Assert.assertEquals(true,true); // This works
      //  extender.flush();

        // mvn test -Dbrowser=chrome



    }



    
}
