import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import page.ConfirmationPage;
import page.FormPage;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        FormPage form = new FormPage();
        form.submitForm(driver);
        ConfirmationPage confirm=new ConfirmationPage();
        confirm.waitForAlert(driver);
        assertEquals("The form was successfully submitted!",confirm.getAlertText(driver));
        Thread.sleep(2000);
        driver.quit();
    }
    
    

}
	