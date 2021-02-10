package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Leave_List {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public Leave_List(WebDriver driver) {
        this.driver=driver;
    }

    //locator date picker from
    By date1 = By.id("calFromDate");
    public void PickDateFrom(String DP){
        driver.findElement(date1).sendKeys(DP, Keys.ENTER);
    }

    //locator date picker to
    By date2 = By.id("calToDate");
    public void PickDateTO(String DA){
        driver.findElement(date2).sendKeys(DA, Keys.ENTER);
    }

    //locator click Show leave Status ALL
    By check = By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck");
    public void ClickAllShowLeave(){
        driver.findElement(check).click();
    }

    //locator employee name
    By EName = By.id("leaveList_txtEmployee_empName");
    public void FillEmployee(String EN){
        driver.findElement(EName).sendKeys(EN, Keys.ENTER);
    }

    //locator select sub unit
    By subunit = By.id("leaveList_cmbSubunit");
    public void SelectSubUnit(String SU){
        Select Sub = new Select(driver.findElement(subunit));
        Sub.selectByValue(SU);
    }

    //locator click include past employee
    By past = By.id("leaveList_cmbWithTerminated");
    public void ClickInclude(){
        driver.findElement(past).click();
    }

    //locator click search
    By search = By.id("btnSearch");
    public void ClickSearch(){
        driver.findElement(search).click();
    }
}
