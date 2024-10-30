package Day4Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_3 {
    public static void main(String[] args) throws InterruptedException {
     //   ChromeDriver drive = new ChromeDriver();
        // drive.get("https://dev.retail.tekschool-students.com/");
        //drive.manage().window().maximize();
        //By signIN = By.tagName("href");
        //
        // WebElement signInBtn =drive.findElement(signIN);
        //signInBtn.click();

        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.facebook.com/");
        chrome.manage().window().maximize();

        By enterEmail = By.id("email");
        WebElement emailElement = chrome.findElement(enterEmail);
        emailElement.sendKeys("Ahmadjan@gmail.com");
        Thread.sleep(1000);
        By passwordLocator = By.id ("pass");
        WebElement passwordlElement = chrome.findElement(passwordLocator);
        Thread.sleep(1000);
        passwordlElement.sendKeys("12345qwe");

        By logInLocator = By.name("login");
        chrome.findElement(logInLocator).click();

        Thread.sleep(4000);

        chrome.quit();









    }
}
