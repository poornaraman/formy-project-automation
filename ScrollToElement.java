import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        
        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name).build().perform();
        name.sendKeys("Poorna P");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        WebElement date= driver.findElement(By.id("date"));
        date.sendKeys("01/01/2024");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.quit();
    }
}
