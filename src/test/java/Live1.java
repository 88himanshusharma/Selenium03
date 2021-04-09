import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Live1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(new By.ByName("email_create")).sendKeys("himanshusharma2@gmail.com");
        driver.findElement(new By.ByName("SubmitCreate")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(new By.ById("id_gender1")).click();
        driver.findElement(new By.ById("customer_firstname")).sendKeys("Himanshu");
        driver.findElement(new By.ById("customer_lastname")).sendKeys("Sharma");
        driver.findElement(new By.ById("passwd")).sendKeys("12345678");
        Select day = new Select(driver.findElement(By.id("days")));
        day.selectByIndex(1);
        Select month = new Select(driver.findElement(By.id("months")));
        month.selectByIndex(2);
        Select year = new Select(driver.findElement(By.id("years")));
        year.selectByValue("1999");
        driver.findElement(new By.ById("newsletter")).click();
        driver.findElement(new By.ById("optin")).click();
        driver.findElement(new By.ById("company")).sendKeys("To The New");
        driver.findElement(new By.ById("address1")).sendKeys("Noida Sector, 144");
        driver.findElement(new By.ById("city")).sendKeys("Noida");
        Select drpstate = new Select(driver.findElement(By.id("id_state")));
        drpstate.selectByVisibleText("Alaska");
        driver.findElement(new By.ById("postcode")).sendKeys("20123");
        Select drpCountry = new Select(driver.findElement(By.id("id_country")));
        drpCountry.selectByVisibleText("United States");
        driver.findElement(new By.ById("phone_mobile")).sendKeys("97058461514");
        driver.findElement(new By.ById("alias")).sendKeys(" is noida 144");
        driver.findElement(new By.ById("submitAccount")).click();
    }
}