package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Verify the title of the first info box
public class Activity3 {
    WebDriver driver;
    @BeforeMethod

    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test

    public void exampleTestCase() {
        // Check first section of the info box
        WebElement element = driver.findElement(By.cssSelector("h3.uagb-ifb-title"));
        //Print the title of the first info box
        String title = element.getText();
        System.out.println("section title is : " + title);
        //Assertion for Verifying the title of the first info box
        Assert.assertEquals("Actionable Training", title);
    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}