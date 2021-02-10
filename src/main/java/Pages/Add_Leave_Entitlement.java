package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Leave_Entitlement {
    WebDriver driver;

    public Add_Leave_Entitlement(WebDriver driver){
        this.driver=driver;
    }

    //locator Entitlements
    By elemententitlements = By.id("menu_leave_Entitlements");
    public void ClickElementEntitlements(){
        driver.findElement(elemententitlements).click();
    }

    //locator add Entitlements
    By addentitlements = By.id("menu_leave_addLeaveEntitlement");
    public void ClickAddEntitlements(){
        driver.findElement(addentitlements).click();
    }

    //locator Add to Multiple Employees
    By checkbox = By.id("entitlements_filters_bulk_assign");
    public void ClickCheckbox(){
        driver.findElement(checkbox).click();
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
    public void AssertSuccess(){
        driver.getPageSource().contains("Bulk Assigning Leave Entitlement to 361 Employees. Please Wait...");
        driver.getPageSource().contains("Entitlement added to 361 employees(s)");
    }

    //locator employee name
    By Ename = By.xpath("//input[@id='entitlements_employee_empName']");
    public void FillEmployeeName(String EM){
        driver.findElement(Ename).click();
        driver.findElement(Ename).clear();
        driver.findElement(Ename).sendKeys(EM, Keys.ENTER);
    }

    //locator confirm button 2
    By conButton = By.id("dialogUpdateEntitlementConfirmBtn");
    public void ClickConfirm2(){
        driver.findElement(conButton).click();
    }

}
