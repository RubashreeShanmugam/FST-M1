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
//Complete a simple lesson
//Goal: Navigate to a particular lesson and complete it
public class Activity9 {
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
        //Get the All Courses link from the given page
        //WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"));
        WebElement element = driver.findElement(By.linkText("All Courses"));
        //Click on "All Courses"
        element.click();
        //get the number of courses
        //List<WebElement> allCourses = driver.findElements(By.xpath("//a[contains(@href, '/courses/')]"));
        List<WebElement> allCourses = driver.findElements(By.cssSelector("div[class*=ld-course-list-items]>div"));
        //print the total number of courses.
        System.out.println("ALl courses count: " + allCourses.size());
        int courseList=0;
        for( WebElement course : allCourses) {

            System.out.println(course.getText());
            courseList += 1;
        }
        //Verify that there are total three number of courses in the page.
        Assert.assertEquals(courseList,3);
        //Get details of one of the course.
        WebElement courseLink=driver.findElement(By.cssSelector("#post-69 > a:nth-child(2) > img:nth-child(1)"));
        //Click on the chosen course.
        courseLink.click();
        //Click on login to enroll button.
        driver.findElement(By.cssSelector(".ld-button")).click();
        //Provide the username.
        driver.findElement(By.id("user_login")).sendKeys("root");
        //Provide the password.
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        //Click on the submit button.
        driver.findElement(By.id("wp-submit")).click();
        //In the course page, select one of the topic and click on it.
        driver.findElement(By.cssSelector("div.ld-item-list-item:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(2)")).click();
    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}