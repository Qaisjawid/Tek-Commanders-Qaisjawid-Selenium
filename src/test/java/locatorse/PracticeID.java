package locatorse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeID{
    public static void main(String[] args) throws InterruptedException {
    ChromeDriver chrome = new ChromeDriver();
    chrome.get("https://retail.tekschool-students.com/");
    chrome.manage().window().maximize();
    Thread.sleep(1000);
    By SignIN= By.id("signinLink");
    WebElement signInButtn =chrome.findElement(SignIN);
    signInButtn.click();
        Thread.sleep(1000);
    By newAccount =By.id("newAccountBtn");
    WebElement creatAccount =chrome.findElement(newAccount);
        Thread.sleep(1000);
    creatAccount.click();


        Thread.sleep(1000);
    chrome.quit();




}}

