package TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
//Contact the admin
//Goal: Navigate to the “Contact Us” page and complete the form.
public class Activity8 {
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

        //WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"));
        //Get the details of Contact section in the page.
        WebElement element = driver.findElement(By.linkText("Contact"));
        //Click the contact section.
        element.click();
        //fill the contact form
        //Enter the name
        driver.findElement(By.cssSelector("#wpforms-8-field_0")).sendKeys("Phanikumar");
        //Enter email id
        driver.findElement(By.cssSelector("#wpforms-8-field_1")).sendKeys("abc@gmail.com");
        //Enter subject
        driver.findElement(By.cssSelector("#wpforms-8-field_3")).sendKeys("new subject");
        //Enter comments
        driver.findElement(By.cssSelector("#wpforms-8-field_2")).sendKeys("new comment");
        //Submit details
        driver.findElement(By.cssSelector("#wpforms-submit-8")).click();
        //Fetch the confirmation message
        String confirmMessage=driver.findElement(By.cssSelector("#wpforms-confirmation-8 > p")).getText();
        //Print the confirmation message
        System.out.println(confirmMessage);
    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}