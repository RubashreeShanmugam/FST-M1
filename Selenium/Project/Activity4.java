package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Verify the title of the second most popular course
public class Activity4 {
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
        //WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"));
        //Get the second most popular course
        WebElement element = driver.findElement(By.cssSelector("#post-71 > div:nth-child(3) > h3:nth-child(1)"));
        //Print the title of the second most popular course
        String title = element.getText();
        System.out.println("section title is : " + title);
        //Assertion for verifying the second most popular course
        Assert.assertEquals("Email Marketing Strategies", title);
    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}