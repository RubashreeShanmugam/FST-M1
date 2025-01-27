package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Verify the website heading
public class Activity2 {
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

        // Check the title of the page
        WebElement element = driver.findElement(By.className("uagb-ifb-title"));
        //Print the title of the page
        String heading = element.getText();
        System.out.println("Page heading is: " + heading);

        //Assertion for page heading
        Assert.assertEquals("Learn from Industry Experts", heading);

    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}