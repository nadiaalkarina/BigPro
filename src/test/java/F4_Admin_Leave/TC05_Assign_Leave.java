package F4_Admin_Leave;

import Pages.Assign_Leave;
import Pages.Dashboard;
import Pages.Leave_List;
import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class TC05_Assign_Leave {
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
        dashboard.ClickAssignLeave();

        Assign_Leave assign_leave = new Assign_Leave(driver);
        assign_leave.FillEmployee("Julius sire caesar");
        assign_leave.SelectLeaveType("3");
        assign_leave.PickFromDate("2021-03-01");
        assign_leave.PickToDate("2021-03-02");
        assign_leave.Duration("full_day");
        assign_leave.FillComment("Assign Leave");
        assign_leave.Assigned();

        Thread.sleep(3000);
        driver.quit();

    }
}
