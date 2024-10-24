package Day4Activities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity1 {
    public static void main(String[] args) {
        ChromeDriver chrome =new ChromeDriver();
        chrome.get("https://dev.retail.tekschool-students.com/");
        String tille = chrome.getTitle();
        System.out.println(tille);
        chrome.quit();

        EdgeDriver edge = new EdgeDriver();
        edge.get("https://dev.retail.tekschool-students.com/");
        String tittle1 = edge.getTitle();
        System.out.println(tittle1);
        edge.quit();



    }
}
