package Home;

import Common.entrypoint;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends entrypoint {


    // Grab Path sections
@FindBy(className = "")     // Locator data Missing
    WebElement var;
@FindBy(xpath = "")
    WebElement var2;


// Method Section
    public void navigateToAmazon (){
        System.out.println("This will navigate to Amazon Home Page");
        // Driver.get() should be placed here //How will it know which driver????
        // Should I hard code it here????
    }


}
