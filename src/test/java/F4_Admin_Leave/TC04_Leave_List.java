package F4_Admin_Leave;

import Pages.Dashboard;
import Pages.Leave_List;
import Pages.LoginPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class TC04_Leave_List {
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

        Leave_List leave_list = new Leave_List(driver);
        leave_list.PickDateFrom("2021-01-01");
        leave_list.PickDateTO("2021-02-28");
        leave_list.ClickAllShowLeave();
        leave_list.FillEmployee("Julius sire caesar");
        leave_list.SelectSubUnit("0");
        leave_list.ClickInclude();
        leave_list.ClickSearch();

        Thread.sleep(3000);
        driver.quit();

    }
}
