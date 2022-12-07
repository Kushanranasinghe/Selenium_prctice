import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment_instructions {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kushan Ranasinghe\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
     //   driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
       // driver.findElement(By.xpath("//div[@class='right-align']"))
        driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected();
        driver.findElement(By.cssSelector("input[name*='checkBoxOption1']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
            System.out.println("the checkbox is sucessfuly unchecked");
        driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        }


    }

