import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Question2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.lambdatest.com/register");
        Properties obj=new Properties();
        File f=new File("C:\\Users\\abc\\IdeaProjects\\SELENIUM\\data\\data.properties");
        FileInputStream file=new FileInputStream(f);
        obj.load(file);
        driver.findElement(By.cssSelector("input[name=name]")).sendKeys(obj.getProperty("Name"));
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys(obj.getProperty("email"));
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys(obj.getProperty("password"));
        driver.findElement(By.cssSelector("input[name=phone]")).sendKeys(obj.getProperty("phone"));
    }
}

