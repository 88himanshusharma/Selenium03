import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
public class Live4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.id("email")).sendKeys("himanshusharma2@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12345678");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.findElement(By.cssSelector("a[title='Contact Us']")).click();
        Select drp = new Select(driver.findElement(By.id("id_contact")));
        drp.selectByVisibleText("Customer service");
        Select drp1 = new Select(driver.findElement(By.name("id_order")));
        drp1.selectByIndex(1);
        driver.findElement(By.id("message")).sendKeys("Order Doesn't match");
        driver.findElement(By.id("submitMessage")).click();
    }
}