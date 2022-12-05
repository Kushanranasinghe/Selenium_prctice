import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kushan Ranasinghe\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        ////a[@value='BLR']
        //(//a[@value='MAA'])[2]
                driver.findElement(By.xpath("//a[@value='BLR']")).click();
                Thread.sleep(2000);
               // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
              //  System.out.println(driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText());
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']


                //Static dropdow
                // Dianamic  dropdown - with index

    }
}