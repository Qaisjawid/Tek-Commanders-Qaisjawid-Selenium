package Day4Activities;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintNameActivity {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://WWW.bankofamerica.com");
        By taglocator = By.tagName("a");
        List<WebElement> tagElement = chrome.findElements(taglocator);
        for (WebElement TagelemnetLop : tagElement){
            String allLink= TagelemnetLop.getText();
            System.out.println(allLink);
        }

        Thread.sleep(2000);
        chrome.quit();

    }
}
