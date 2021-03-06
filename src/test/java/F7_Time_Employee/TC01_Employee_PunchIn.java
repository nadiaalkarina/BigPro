package F7_Time_Employee;

import Pages.Dashboard;
import Pages.LoginPanel;
import Pages.Punch_In_Out;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class TC01_Employee_PunchIn {
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

        Dashboard dashboard = new Dashboard(driver);
        dashboard.Time();
        dashboard.Attendance();
        dashboard.ClickPunch();

        Punch_In_Out punch_in_out = new Punch_In_Out(driver);
        punch_in_out.FillNotes("Clock In");
        punch_in_out.ClickIn();
        punch_in_out.AssertPunch();

        Thread.sleep(3000);
        driver.quit();
    }
}
