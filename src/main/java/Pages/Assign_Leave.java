package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_Leave {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public Assign_Leave(WebDriver driver) {
        this.driver=driver;
    }


    //locator employee name
    By EName = By.id("assignleave_txtEmployee_empName");
    public void FillEmployee(String EN){
        driver.findElement(EName).sendKeys(EN, Keys.ENTER);
    }

    //locator select leave type
    By leavetype = By.id("assignleave_txtLeaveType");
    public void SelectLeaveType(String LT){
        Select Sub = new Select(driver.findElement(leavetype));
        Sub.selectByValue(LT);
    }

    //locator date picker from
    By date1 = By.id("assignleave_txtFromDate");
    public void PickFromDate(String FD){
        driver.findElement(date1).sendKeys(FD, Keys.ENTER);
    }

    //locator date picker to
    By date2 = By.id("assignleave_txtToDate");
    public void PickToDate(String TD){
        driver.findElement(date2).sendKeys(TD, Keys.ENTER);
    }


    //locator leave duration
    By duration = By.id("assignleave_duration_duration");
    public void Duration (String D){
        Select Dur = new Select(driver.findElement(duration));
        Dur.selectByValue(D);
    }

    //locator fill comment
    By comment = By.id("assignleave_txtComment");
    public void FillComment(String FC){
        driver.findElement(comment).sendKeys(FC);
    }

    //locator click assign
    By assign = By.id("assignBtn");
    public void ClickAssign(){
        driver.findElement(assign).click();
    }

    //locator success
    public void Assigned(){
        driver.getPageSource().contains("Successfully Assigned");
    }

}
