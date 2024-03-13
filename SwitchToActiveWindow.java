import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTab= driver.findElement(By.id("new-tab-button"));
        newTab.click();
        String windowsHandle=driver.getWindowHandle();
        for (String handles1: driver.getWindowHandles()) {
        	driver.switchTo().window(handles1);
        }
        driver.switchTo().window(windowsHandle);
        driver.quit();
    }
}
