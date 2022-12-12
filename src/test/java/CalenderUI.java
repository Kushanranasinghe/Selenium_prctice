import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {
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
        System.out.println("text");

     ///   System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
           System.out.println(("its enabled"));
           Assert.assertTrue(true);

       }
       else {
           Assert.assertTrue(false); // after clicking radio button you check attribute value change into 1
       }
       System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
    //    System.out.println();
    }
}