package Week_1_practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(3000);
        driver.quit();


    }
}
