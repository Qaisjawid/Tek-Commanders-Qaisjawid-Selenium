package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class testelemet2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));
      WebDriverWait wait = new
              WebDriverWait(driver,Duration.ofSeconds(10));

      WebElement signInElement = wait.until
              (ExpectedConditions.elementToBeClickable
              (By.cssSelector("a#signinLink")));
      signInElement.click();

      WebElement  signInEmail = wait.until
              (ExpectedConditions.visibilityOfElementLocated
              (By.cssSelector("input[name='email']")));
      signInEmail .sendKeys("Mohammad_Wrong@gmail.com");

      WebElement passwordElement = wait.until
              (ExpectedConditions.visibilityOfElementLocated
              (By.cssSelector("input[name='password']")));
      passwordElement.sendKeys("WrongPassword");

      WebElement logInButtonElement = wait.until
              (ExpectedConditions.elementToBeClickable
              (By.cssSelector("button#loginBtn")));
      logInButtonElement.click();

      WebElement errorElement = wait.until
              (ExpectedConditions.visibilityOfElementLocated
              (By.cssSelector("div.error")));
      String errorPrint = errorElement.getText();
        System.out.println(errorPrint);
        driver.quit();

















    }
}
