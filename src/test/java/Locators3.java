import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kushan Ranasinghe\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //Siblings -child to Parent traverse
        // Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
       // System.out.println(driver.findElement(By.xpath("header/div/button[1]/parent::div/parent::header")));

     //   driver.manage().window().maximize();

      //  driver.get("http://google.com");

      //  driver.navigate().to("https://rahulshettyacademy.com");

     //   driver.navigate().back();

     //   driver.navigate().forward();
        //   driver.manage().window().maximize();

        //  driver.get("http://google.com");

        //  driver.navigate().to("https://rahulshettyacademy.com");

        //   driver.navigate().back();

        //   driver.navigate().forward();

    }

    }

