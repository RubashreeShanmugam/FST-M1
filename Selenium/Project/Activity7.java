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

// Count the number of courses
//Goal: Navigate to the “All Courses” page and count the number of courses.
public class Activity7 {
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
        //Get the All Courses link.
        WebElement element = driver.findElement(By.linkText("All Courses"));
        //Click All Courses link.
        element.click();
        //get the number of courses
        //List<WebElement> allCourses = driver.findElements(By.xpath("//a[contains(@href, '/courses/')]"));
        List<WebElement> allCourses = driver.findElements(By.cssSelector("div[class*=ld-course-list-items]>div"));
        //print the total number of courses
        System.out.println("ALl courses count: " + allCourses.size());
        /*int courseList=0;
        for( WebElement course : allCourses) {

            System.out.println(course.getText());
            courseList += 1;
        }*/
        //Verify that there are 3 courses under the All Courses list.
        Assert.assertEquals(allCourses.size(),3);
    }

    @AfterMethod

    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}