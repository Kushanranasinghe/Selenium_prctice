import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kushan Ranasinghe\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

       // driver.findElement(By.xpath("//input[@name='name']")).sendKeys("");
        //driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
      //  System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kushan Ranasinghe");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kushan.r91@yahoo.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1qaZ2wsX@#$");
        System.out.println(driver.findElement(By.cssSelector("input[id*='exampleCheck1']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='exampleCheck1']")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        WebElement GenderSelection= driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown =new Select(GenderSelection);
        dropdown.selectByIndex(0);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
        driver.findElement(By.cssSelector("input[type='date']")).click();





    }
}