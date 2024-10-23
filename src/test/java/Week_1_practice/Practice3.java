package Week_1_practice;


import org.openqa.selenium.edge.EdgeDriver;

public class Practice3 {

    public static void main(String[] args) throws InterruptedException {
        EdgeDriver edge = new EdgeDriver();
        edge.get("https://www.youtube.com/");
        edge.manage().window().maximize();
        Thread.sleep(3000);
        edge.getTitle();
        Thread.sleep(4000);
        edge.quit();

    }
}
