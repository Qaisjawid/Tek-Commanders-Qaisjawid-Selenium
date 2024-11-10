package wee_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class practiceDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chrom = new ChromeDriver();
        chrom.get("https://retail.tekschool-students.com/selenium/dropdown");
        WebElement dropDown = chrom.findElement(By.id("countrySelect"));
        Select selectobj = new Select(dropDown);







    }
}
