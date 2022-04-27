package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void openUp() {
        openBrowser(baseUrl);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.xpath("//input[@id='txtUsername']"), "Admin");
        sendTextToElement(By.xpath("//input[@id='txtPassword']"), "admin123");
        clickOnElement(By.xpath("//input[@id='btnLogin']"));
        // check welcome displayed

        String expectedText = "Welcome";
        String actualFullTest = getTextFromElement(By.xpath("//a[@id='welcome']"));
        String actualText = actualFullTest.substring(0, 7);
        Assert.assertEquals(expectedText, actualText);
    }
}