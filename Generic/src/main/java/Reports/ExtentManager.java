package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentManager {

        //Global variable
    private static ExtentReports extender; // Need to know 1. Why Private? Encapsulation
    private static ExtentSparkReporter sparker; //Need to know 2 Why private? Encapsulation


    // Initializer method
    public static ExtentReports getExtentInstance() {
        String box = System.getProperty("user.dir") +"\\ReportsRepo\\index.html";
     sparker = new ExtentSparkReporter(box);
    sparker.config().setReportName("Web Automation results");
    sparker.config().setDocumentTitle("Test Results");

    extender = new ExtentReports();
    extender.attachReporter(sparker);
    extender.setSystemInfo("Tester", "Rob");
    return extender;
    }


    //@Test
    //public void demo (){

        //ExtentReports testExtent =ExtentManager.getExtentInstance(); // Called this whee extent is???
       // ExtentTest Tester = testExtent.createTest("Initial test");
       // Assert.assertEquals(true,true);
       // extender.flush();

        // mvn test -Dbrowser=chrome

    //}

}
