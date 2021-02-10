package F5_Employee_Leave;

import Pages.Dashboard;
import Pages.Leave_Entitlements_and_Usage_Report;
import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class TC01_Employee_Leave_Report {
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

        Dashboard dashboard = new Dashboard(driver);
        dashboard.ClickLeave();
        dashboard.ClickMenuReport();
        dashboard.ClickMyLeave();

        Leave_Entitlements_and_Usage_Report Leave = new Leave_Entitlements_and_Usage_Report(driver);
        Leave.PeriodFrom("2020-01-01$$2021-09-30");
        Leave.ClickView();
        Leave.AssertLeave();

        Thread.sleep(3000);
        driver.quit();
    }
}
