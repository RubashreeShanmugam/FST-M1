package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Goal: Open the website and log-in using the provided credentials.
public class Activity6 {
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
        //Get the details of My Account element in the web page
        WebElement element = driver.findElement(By.cssSelector("#menu-item-1507 > a:nth-child(1)"));
        //Click the My Account
        element.click();
        //Fetch the title of the account section
        String newTitle = driver.getTitle();
        System.out.println("section title is : " + newTitle);
        //Assertion for My Account - Alchemy LMS page
        Assert.assertEquals("My Account – Alchemy LMS", newTitle);
        //Click on the login section
        driver.findElement(By.linkText("Login")).click();
        //Enter the user name
        driver.findElement(By.id("user_login")).sendKeys("root");
        //Enter the password
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        //Click on submit button
        driver.findElement(By.id("wp-submit")).click();
        //Get the details of user who logged in
        WebElement we = driver.findElement(By.partialLinkText("root"));
        String user_title=we.getText();
        System.out.println("User details are : " + user_title);
        //Verify that the correct user details are displayed.
        Assert.assertEquals(we.isDisplayed(), Boolean.TRUE);
    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
       driver.quit();
    }
}