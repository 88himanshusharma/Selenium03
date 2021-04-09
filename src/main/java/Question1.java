import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gtmetrix.com/");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[1]/main/article/form/div[1]/div[1]/div/input")).sendKeys("tothenew.com", Keys.ENTER);
        WebElement s=driver.findElement(By.xpath("//div[@class='report-scores']//div/i"));
        String f=s.getAttribute("class").split("grade-")[1].trim();
        System.out.println(f);
        String p=driver.findElement(By.xpath("//div[@class='report-scores']//div[2]/span/span")).getText();
        System.out.println(p);
        String q=driver.findElement(By.xpath("//div[@class='report-scores']//div[3]/span/span")).getText();
        System.out.println(q);
    }
}