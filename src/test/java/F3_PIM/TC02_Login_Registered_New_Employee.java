package F3_PIM;

import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


@Test
public class TC02_Login_Registered_New_Employee {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/SekolahQA/Code/Java/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPanel LogIn = new LoginPanel(driver);
        LogIn.UserName("juliussire");
        LogIn.Password("@Julius51re#");
        LogIn.BtnLogin();
        LogIn.LoginSuccess();

        Thread.sleep(3000);
        driver.quit();

    }
}
