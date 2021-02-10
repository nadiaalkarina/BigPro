package F1_Login;

import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class TC03_Login_Wrong_Username {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/SekolahQA/Code/Java/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        LoginPanel LogIn = new LoginPanel(driver);
        LogIn.UserName("Mimin");
        LogIn.Password("s3Kol4HQA!*");
        LogIn.BtnLogin();
        LogIn.Invalid();

        Thread.sleep(3000);
        driver.quit();

    }
}
