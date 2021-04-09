import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Prac {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gtmetrix.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='url']")).sendKeys("tothenew.com", Keys.ENTER);
        WebElement a = driver.findElement(By.xpath("//div[@class='report-scores']//div/i"));
        String g = a.getAttribute("class").split("grade-")[1].trim();
        switch (g) {
            case "A":
                System.out.println("GTmetrix Grade lies between 90-99%");
                break;
            case "B":
                System.out.println("GTmetrix Grade lies between 80-89%");
                break;
            case "C":
                System.out.println("GTmetrix Grade lies between 70-79%");
                break;
            case "D":
                System.out.println("GTmetrix Grade lies between 60-69%");
                break;
        }
        String p = driver.findElement(By.xpath("//div[@class='report-scores']//div[2]/span/span")).getText();
        String n = p.substring(0, p.length ( )-1);
        int i=Integer.parseInt(n);
        switch (i / 10) {
            case 9:
                System.out.println("Grade of Performance : A");
                break;
            case 8:
                System.out.println("Grade of Performance : B");
                break;
            case 7:
                System.out.println("Grade of Performance : C");
                break;
            case 6:
                System.out.println("Grade of Performance : D");
                break;
        }
        String s = driver.findElement(By.xpath("//div[@class='report-scores']//div[3]/span/span")).getText();
        String k = s.substring(0, s.length ( )-1);
        int j=Integer.parseInt(k);
        switch (j / 10) {
            case 9:
                System.out.println("Grade of Structure : A");
                break;
            case 8:
                System.out.println("Grade of Structure : B");
                break;
            case 7:
                System.out.println("Grade of Structure : C");
                break;
            case 6:
                System.out.println("Grade of Structure : D");
                break;
        }
    }
}