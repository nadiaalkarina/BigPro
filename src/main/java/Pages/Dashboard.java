package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {
    WebDriver driver;

    public Dashboard(WebDriver driver){
        this.driver=driver;
    }

    //locator admin
    By admin = By.id("menu_admin_viewAdminModule");
    public void ClickAdmin(){
        driver.findElement(admin).click();
    }

    //locator PIM
    By cpim = By.id("menu_pim_viewPimModule");
    public void ClickPim(){
        driver.findElement(cpim).click();
    }

    //locator leave
    By leave = By.id("menu_leave_viewLeaveModule");
    public void ClickLeave(){
        driver.findElement(leave).click();
    }

    //locator click menu report
    By report = By.id("menu_leave_Reports");
    public void ClickMenuReport(){
        driver.findElement(report).click();
    }

    //locator Leave Entitlements
    By leaveEnti = By.id("menu_leave_viewLeaveBalanceReport");
    public void ClickLeaveEntitlements(){
        driver.findElement(leaveEnti).click();
    }

    //locator Leave view leave balance
    By myleave = By.id("menu_leave_viewMyLeaveBalanceReport");
    public void ClickMyLeave(){
        driver.findElement(myleave).click();
    }

    //locator Entitlements
    By elemententitlements = By.id("Entitlements");
    public void ClickElementEntitlements(){
        driver.findElement(elemententitlements).click();
    }

    //locator Entitlements
    By addentitlements = By.id("menu_leave_addLeaveEntitlement");
    public void ClickAddEntitlements(){
        driver.findElement(addentitlements).click();
    }

    //locator Add to Multiple Employees
    By checkbox = By.id("entitlements_filters_bulk_assign");
    public void ClickCheckbox(){
        driver.findElement(checkbox);
    }

    //locator select location
    By loc = By.id("entitlements_filters_location");
    public void SelectLocation(String LC){
        Select LOC = new Select(driver.findElement(loc));
        LOC.selectByValue(LC);
    }

    //locator select subunit
    By su = By.id("entitlements_filters_subunit");
    public void SubUnit(String SU){
        Select SUB = new Select(driver.findElement(su));
        SUB.selectByValue(SU);
    }

    //locator leave type
    By leavetype = By.id("entitlements_leave_type");
    public void LeaveType(String LT){
        Select LEAVE = new Select(driver.findElement(leavetype));
        LEAVE.selectByValue(LT);
    }

    //locator leave period
    By leaveperiod = By.id("period");
    public void LeavePeriod(String LP){
        Select LEAVE = new Select(driver.findElement(leaveperiod));
        LEAVE.selectByValue(LP);
    }

    //locator fill entitlement
    By entitle = By.id("entitlements_entitlement");
    public void FillEntitlement(String FE){
        driver.findElement(entitle).sendKeys(FE);
    }

    //locator button save
    By save = By.id("btnSave");
    public void ClickSave(){
        driver.findElement(save).click();
    }

    //locator click pop up confirm
    By confirm = By.id("dialogConfirmBtn");
    public void ClickConfirm(){
        driver.findElement(confirm).click();
    }

    //locator assert view leave
    public void AssertLeave(){
        driver.getPageSource().contains("0.00");
        driver.getPageSource().contains("Leave Entitlements (Days)");
    }

    //locator click element assign leave
    By assign = By.id("menu_leave_assignLeave");
    public void ClickAssignLeave(){
        driver.findElement(assign).click();
    }

    //locator time
    By time = By.id("menu_time_viewTimeModule");
    public void Time(){
        driver.findElement(time).click();
    }

    //locator menu attendance
    By attend = By.id("menu_attendance_Attendance");
    public void Attendance(){
        driver.findElement(attend).click();
    }

    //locator menu punch in/out
    By punch = By.id("menu_attendance_punchIn");
    public void ClickPunch(){
        driver.findElement(punch).click();
    }

    //locator welcome
    By wel = By.id("welcome");
    public void ClickWelcome(){
        driver.findElement(wel).click();
    }

    //locator logout
    By logout = By.xpath("//a[contains(text(),'Logout')]");
    public void ClickLogout(){
        driver.findElement(logout).click();
    }

    //locator click about
    By about = By.id("aboutDisplayLink");
    public void ClickAbout(){
        driver.findElement(about).click();
    }

}
