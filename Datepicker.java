import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datepicker= driver.findElement(By.id("datepicker"));
        datepicker.click();
        WebElement calender= driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[5]"));
        calender.click();
        Thread.sleep(2000);
        datepicker.click();
        datepicker.clear();
        datepicker.sendKeys("03/03/2024");
        datepicker.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        
        driver.quit();
	}
}
