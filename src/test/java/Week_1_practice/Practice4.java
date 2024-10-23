package Week_1_practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.manage().window().maximize();;
        String tittleName = driver.getTitle();
        System.out.println(tittleName);
        Thread.sleep(2000);
        driver.quit();
    }
}
