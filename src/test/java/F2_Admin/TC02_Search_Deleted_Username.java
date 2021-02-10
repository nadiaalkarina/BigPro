package F2_Admin;

import Pages.Admin;
import Pages.Dashboard;
import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


@Test
public class TC02_Search_Deleted_Username {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/SekolahQA/Code/Java/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.cilsy.id/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPanel LogIn = new LoginPanel(driver);
        LogIn.UserName("Admin");
        LogIn.Password("s3Kol4HQA!*");
        LogIn.BtnLogin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.ClickAdmin();

        Admin admin = new Admin(driver);
        admin.ClickUserManagement();
        admin.ClickUser();
        admin.EmployeeUsername("juliussire");
        admin.ClickSearch();
        admin.NoRecord();

        Thread.sleep(3000);
        driver.quit();
    }
}
