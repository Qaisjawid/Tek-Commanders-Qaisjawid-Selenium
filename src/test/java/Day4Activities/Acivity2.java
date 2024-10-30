package Day4Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acivity2 {
    public static void main(String[] args) {
        ChromeDriver drive = new ChromeDriver();
        drive.get("https://dev.retail.tekschool-students.com/");
        drive.manage().window().maximize();
        By searchbar = By.id("searchInput");
        WebElement type = drive.findElement(searchbar);
        type.sendKeys("apple");

        drive.quit();





    }

}
