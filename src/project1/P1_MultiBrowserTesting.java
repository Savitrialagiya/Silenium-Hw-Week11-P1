package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1_MultiBrowserTesting {
    static String browser = "Edge";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver" , "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver" , "drivers/msedgedriver.exe");
            driver=new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //launch driver
        driver.get(baseUrl);

        //Maximise Window
        driver.manage().window().maximize();

        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        //Get current Url
        System.out.println("Current Url is : " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source is : " + driver.getPageSource());

        // enter the email field element and send the email
        WebElement emailField =  driver.findElement(By.id("Email"));
        emailField.sendKeys("admin123@gmail.com");

        //Enter password field and send password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("admin123");

        //close the browser
        //driver.close();
    }
}
