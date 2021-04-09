import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class Live5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
        WebElement product = driver.findElement(By.cssSelector("img[alt='Faded Short Sleeve T-shirts']"));
        WebElement ac = driver.findElement(By.cssSelector("a[title='Add to cart']"));
        Actions a = new Actions(driver);
        a.moveToElement(product).moveToElement(ac).click().build().perform();
        driver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
        driver.findElement(By.cssSelector("a[class*='checkout button-medium']")).click();
        Assert.assertTrue(driver.getPageSource().contains("Already registered?"),"You can checkout without Sign-in");
    }
}
