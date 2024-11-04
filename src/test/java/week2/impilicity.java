package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class impilicity {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().
                implicitlyWait(Duration.ofSeconds(20));
        driver.get
                ("https://retail.tekschool-students.com/auth/login");
        driver.findElement
                        (By.cssSelector("input#email")).
                sendKeys("mohammad2536@gmail.com");
        driver.findElement
                        (By.cssSelector("input#password")).
                sendKeys("fghjkkl");
        driver.findElement(By.cssSelector("button#loginBtn"))
                .click();
        String eroor = driver.findElement(By.cssSelector("div.error"))
                .getText();
        System.out.println(eroor);
        driver.quit();


    }
}
