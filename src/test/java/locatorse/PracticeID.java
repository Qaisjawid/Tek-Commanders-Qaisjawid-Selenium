package locatorse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeID{
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrom = new ChromeDriver();
        chrom.get("https://retail.tekschool-students.com/");
        chrom.manage().window().maximize();
        Thread.sleep(2000);
        By SignInbottun =By.id("signinLink");
        Thread.sleep(2000);
        WebElement signElement = chrom.findElement(SignInbottun);
        Thread.sleep(3000);
        signElement.click();
        Thread.sleep(3000);
        chrom.quit();
    }


}
