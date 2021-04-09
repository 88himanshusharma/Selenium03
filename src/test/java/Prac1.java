import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Prac1 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gtmetrix.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[@class='user-nav-login']/a")).click();
        driver.findElement(By.name("email")).sendKeys("himanshu.sharma1_cs17@gla.ac.in",Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"menu-site-nav\"]/div[2]/div[1]/form/div[4]/button")).click();
        driver.findElement(By.xpath("//div[1]/main/article/form/div[1]/div[1]/div/input")).sendKeys("tothenew.com", Keys.ENTER);
        WebElement s=driver.findElement(By.xpath("//div[@class='report-scores']//div/i"));
        String f=s.getAttribute("class").split("grade-")[1].trim();
        System.out.println("Print the report After converting Grade into Percentage and Percentage into Grade");
        switch (f) {
            case "A":
                System.out.println("90%");
                break;
            case "B":
                System.out.println("80%");
                break;
            case "C":
                System.out.println("70%");
                break;
            case "D":
                System.out.println("60%");
                break;
            default:
                System.out.println("50%");
        }
        String p=driver.findElement(By.xpath("//div[@class='report-scores']//div[2]/span/span")).getText().split("%")[0].trim();
        int per=Integer.parseInt(p);
        if(per>=90){
            System.out.println("A");
        }
        else if(per>=80 && per<90){
            System.out.println("B");
        }
        else if(per>=70 && per<80){
            System.out.println("C");
        }
        else if(per>=60 && per<70){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
        String q=driver.findElement(By.xpath("//div[@class='report-scores']//div[3]/span/span")).getText().split("%")[0].trim();
        int st=Integer.parseInt(q);
        if(st>=90){
            System.out.println("A");
        }
        else if(st>=80 && st<90){
            System.out.println("B");
        }
        else if(st>=70 && st<80){
            System.out.println("C");
        }
        else if(st>=60 && st<70){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
    }
}



