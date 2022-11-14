package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1_FirefoxBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Launch Driver
        driver.get(baseUrl);

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is : " + title);

        //Print the current Url
        System.out.println("The current Url is : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is : " + driver.getPageSource());

        // Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("admin123@yahoo.com");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("123admin");

        //Close the programme
       // driver.quit();

    }
}
