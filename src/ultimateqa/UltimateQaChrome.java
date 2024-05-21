package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class UltimateQaChrome {


    // Declared main method
    public static void main(String[] args) {

        // Base URL declared
        String baseUrl = "https://courses.ultimateqa.com/";

        //1. Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get(baseUrl);
        // maximise the browser windows
        driver.manage().window().maximize();

        // We give implicit wait to driver - give it to beginning level
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //3. Print the title of the page.
        driver.getTitle();

        //4. Print the current url.
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("The page source is :" + driver.getPageSource());

        //6. Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();

        //7. Print the current url
        System.out.println("The current url is :" + driver.getCurrentUrl());

        //8. Enter the email to email field.
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("Test123@gmail.com");

        //9. Enter the password to password field.
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("test123");

        //10. Click on Login Button.
        driver.findElement(By.className("button")).click();

        //11. Navigate to baseUrl.
        driver.get(baseUrl);

        //12. Navigate forward to Homepage.
        driver.navigate().forward();

        //13. Navigate back to baseUrl.
        driver.get(baseUrl);

        //14. Refresh the page.
        driver.navigate().refresh();

        //15. Close the browser.
        driver.quit();
    }
}
