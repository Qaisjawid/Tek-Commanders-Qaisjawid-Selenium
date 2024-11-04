package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogo {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://www.facebook.com/");
        chrome.manage().window().maximize();
        String isdisplayed = chrome.findElement(By.xpath("//img[contains(@class,'fb_logo')]")).getText();
        System.out.println(isdisplayed);
        chrome.quit();

    }

}
