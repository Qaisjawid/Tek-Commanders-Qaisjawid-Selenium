package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errorprint {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/auth/login");
        driver.findElement(By.cssSelector("input#email")).sendKeys("mohammad2536@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("fghjkkl");
        driver.findElement(By.cssSelector("button#loginBtn")).click();
        Thread.sleep(1000);
        String eroor = driver.findElement(By.cssSelector("div.error")).getText();
        System.out.println(eroor);
        Thread.sleep(3000);
        driver.quit();


    }
}
