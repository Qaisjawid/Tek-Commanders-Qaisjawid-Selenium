package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Testwaitelement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        //Implicit Wait -> Global Wait for All the Elements
        //With Implicit wait As soon as Selenium locate the element it will move on to next action
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Explicit Wait Applies for Elements individually
        //And wait conditionally

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));

        WebElement signInElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("a#signinLink")));
        signInElement.click();

        WebElement emailInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input[name='email']")));
        emailInput.sendKeys("Mohammad_Wrong@gmail.com");

        WebElement passwordInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input[name='password']")));
        passwordInput.sendKeys("WrongPassword");

        WebElement loginButtonElement= wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("button#loginBtn")));
        loginButtonElement.click();

        WebElement errorElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("div.error")));

        String errorMessage = errorElement.getText();

        System.out.println(errorMessage);
        driver.quit();
    }
}
