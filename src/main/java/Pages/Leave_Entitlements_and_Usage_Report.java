package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import sun.rmi.runtime.Log;

public class Leave_Entitlements_and_Usage_Report {
    WebDriver driver;

    public Leave_Entitlements_and_Usage_Report(WebDriver driver){
        this.driver = driver;
    }

    //locator select drop down generate for
    By generatefor = By.id("leave_balance_report_type");
    public void GenerateFor(String GF){
        Select GenFor = new Select(driver.findElement(generatefor));
        GenFor.selectByValue(GF);
    }

    //locator select location
    By loc = By.id("leave_balance_location");
    public void SelectLocation(String SL){
        Select Loc = new Select(driver.findElement(loc));
        Loc.selectByValue(SL);
        }


    //locator select leave type
    By leavetype = By.id("leave_balance_leave_type");
    public void LeaveType(String LT){
        Select LeType = new Select(driver.findElement(leavetype));
        LeType.selectByValue(LT);
    }

    //locator select subunit
    By subunit = By.id("leave_balance_sub_unit");
    public void SubUnit(String SU){
        Select SUnit = new Select(driver.findElement(subunit));
        SUnit.selectByValue(SU);
    }

    //locator data from
    By priod = By.id("period");
    public void PeriodFrom(String PF){
        Select periodfrom = new Select(driver.findElement(priod));
        periodfrom.selectByValue(PF);
    }

    //locator job tittle
    By jobtittle = By.id("leave_balance_job_title");
    public void JobTittle(String JT) {
        Select jobsTittle = new Select(driver.findElement(jobtittle));
        jobsTittle.selectByValue(JT);
    }

    //locator click checkbox leave balance include terminated
    By cek = By.id("leave_balance_include_terminated");
    public void IncludeTerminated(){
        driver.findElement(cek).click();
    }

    //locator click view
    By viewbutton = By.id("viewBtn");
    public void ClickView(){
        driver.findElement(viewbutton);
    }

    //locator assert view leave
    public void AssertLeave(){
        driver.getPageSource().contains("0.00");
        driver.getPageSource().contains("Leave Entitlements (Days)");
    }

}
