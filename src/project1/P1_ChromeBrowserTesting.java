package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set up browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
