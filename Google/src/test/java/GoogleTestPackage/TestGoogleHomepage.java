package GoogleTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleHomepage {

    @Test
    public void GoogleWelcome(){

        System.out.println("Message from Google");
        Assert.assertEquals(false,false); // This works

    }
}
