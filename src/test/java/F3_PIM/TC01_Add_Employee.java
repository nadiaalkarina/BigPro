package F3_PIM;

import Pages.AddEmployee;
import Pages.Dashboard;
import Pages.LoginPanel;
import Pages.PIM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


@Test
public class TC01_Add_Employee {
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
        dashboard.ClickPim();

        PIM pim = new PIM(driver);
        pim.AddEmploy();

        AddEmployee addEmployee = new AddEmployee(driver);
        addEmployee.FirstName("Julius");
        addEmployee.MiddleName("sire");
        addEmployee.LastName("caesar");
        addEmployee.EmployeeID("71");
        addEmployee.UploadPicture("D:/Glints/zoom background/5e9625b073d0c8173c4e2083.jfif");
        addEmployee.ClickLoginDetail();
        addEmployee.UserName("juliussire");
        addEmployee.Password("@Julius51re#");
        addEmployee.ConfirmPassword("@Julius51re#");
        addEmployee.SelectStatus("Enabled");
        addEmployee.ClickSave();
        addEmployee.RegisterSuccess();

        Thread.sleep(3000);
        driver.quit();
    }
}
