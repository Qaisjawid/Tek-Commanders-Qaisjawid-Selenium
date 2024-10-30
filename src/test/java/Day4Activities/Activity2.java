package Day4Activities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {

        System.out.println("Please Use a browser Chrome or Edge ");
        Scanner inpute = new Scanner(System.in);


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


