import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modal=driver.findElement(By.id("modal-button"));
        modal.click();
        
        WebElement closebutton=driver.findElement(By.id("close-button"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
       
        js.executeScript("arguments[0].click();" , closebutton);
        Thread.sleep(1000);
        driver.quit();
    }
}