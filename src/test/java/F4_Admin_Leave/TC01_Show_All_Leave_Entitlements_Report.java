package F4_Admin_Leave;

import Pages.Dashboard;
import Pages.Leave_Entitlements_and_Usage_Report;
import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;


@Test
public class TC01_Show_All_Leave_Entitlements_Report {
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
        LogIn.LoginSuccess();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.ClickLeave();
        dashboard.ClickMenuReport();
        dashboard.ClickLeaveEntitlements();

        Leave_Entitlements_and_Usage_Report Leave = new Leave_Entitlements_and_Usage_Report(driver);
        Leave.GenerateFor("1");
        Leave.SelectLocation("-1");
        Leave.LeaveType("1");
        Leave.SubUnit("0");
        Leave.PeriodFrom("2020-01-01$$2021-09-30");
        Leave.JobTittle("0");
        Leave.IncludeTerminated();
        Leave.ClickView();
        Leave.AssertLeave();

        Thread.sleep(5000);
        driver.quit();

    }
}
