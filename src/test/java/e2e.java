import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {
    public static void main(String[]args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kushan Ranasinghe\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        ////a[@value='BLR']
        //(//a[@value='MAA'])[2]
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        //------------------

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
       // System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")));

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

        {

            System.out.println("its disabled");

            Assert.assertTrue(true);

        }

        else

        {

            Assert.assertTrue(false);

        }

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);

        for(int i=1;i<5;i++)

        {

            driver.findElement(By.id("hrefIncAdt")).click();

        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

        driver.findElement(By.cssSelector("input[value='Search']")).click();


// driver.findElement(By.xpath("//input[@value='Search']")).click();

// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

    }


}
