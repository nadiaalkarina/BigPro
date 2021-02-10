package F4_Admin_Leave;

import Pages.Add_Leave_Entitlement;
import Pages.Dashboard;
import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class TC03_Add_Leave_Entitlements_Multiple_Employee {
    public static void main(String[] args) throws InterruptedException{
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

        Add_Leave_Entitlement add_leave = new Add_Leave_Entitlement(driver);
        add_leave.ClickElementEntitlements();
        add_leave.ClickAddEntitlements();
        add_leave.ClickCheckbox();
        add_leave.SelectLocation("-1");
        add_leave.SubUnit("0");
        add_leave.LeaveType("1");
        add_leave.LeavePeriod("2020-01-01$$2021-09-30");
        add_leave.FillEntitlement("14");
        add_leave.ClickSave();
        add_leave.ClickConfirm();
        add_leave.AssertSuccess();

        Thread.sleep(3000);
        driver.quit();

    }
}
