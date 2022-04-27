package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //@After
    public void tearDown() {
        closeBrowser();
    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //click forgot password
        clickOnElement(By.linkText("Forgot your password?"));

        //this is requirement
        String expectedText = "Forgot Your Password?";
        //actual text
        String actualText=getTextFromElement(By.tagName("h1"));


        Assert.assertEquals(expectedText, actualText);


    }
}





