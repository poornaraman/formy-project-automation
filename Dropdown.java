import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdown= driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.id("dropdownMenuButton"))));
        dropdown.click();
        WebElement dragdrop=driver.findElement(By.xpath("/html/body/div/div/div/a[5]"));
        dragdrop.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
