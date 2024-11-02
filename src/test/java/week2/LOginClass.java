package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOginClass {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.findElement(By.id("signinLink")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("email")).
                sendKeys("mohammad2536@gmail.com");
        driver.findElement(By.name("password"))
                .sendKeys("Password@123");
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@class='search__input']"))
                .sendKeys("Keyboard");
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("image")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addToCartBtn")).click();
        boolean isDisplayed = driver.findElement(By.className("product__select")).isDisplayed();
        if(isDisplayed) System.out.println("test Passed");
        else System.out.println("Failed");

        Thread.sleep(2000);

        driver.quit();

        }


    }

