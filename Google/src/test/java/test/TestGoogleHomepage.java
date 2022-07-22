package test;

import Common.entrypoint;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleHomepage extends entrypoint {

    @Test
    public void GoogleWelcome(){

        System.out.println("Message from Google");
        Assert.assertEquals(true,true); // This works

    }
}
