package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Goal: Navigate to the “My Account” page on the site
public class Activity5 {
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

        // Check the "My Account" section under page.

        //WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"));
        WebElement element = driver.findElement(By.cssSelector("#menu-item-1507 > a:nth-child(1)"));
        //Click the My Account
        element.click();
        //Fetch the page details after logging in.
        String newTitle = driver.getTitle();
        System.out.println("section title is : " + newTitle);
        //Assertion that the user can see My account - Alchemy LMS page.
        Assert.assertEquals("My Account – Alchemy LMS", newTitle);

    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}