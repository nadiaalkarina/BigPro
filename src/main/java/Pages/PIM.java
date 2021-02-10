package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PIM {
    WebDriver driver;

    public PIM(WebDriver driver){
        this.driver = driver;
    }

    //Locator click add employee
    By addem = By.id("menu_pim_addEmployee");
    public void AddEmploy(){
        driver.findElement(addem).click();
    }

    //locator employee name
    By Ename = By.id("empsearch_employee_name_empName");
    public void EmployeeName(String name){
        driver.findElement(Ename).sendKeys(name);
    }

    //locator click search
    By search = By.id("searchBtn");
    public void ClickSearch(){
        driver.findElement(search).click();
    }

    //locator checkbox
    By checkbox = By.name("chkSelectRow[]");
    public void ClickCheckBox(){
        driver.findElement(checkbox).click();
    }

    //locator button delete employee
    By btnDelete = By.id("btnDelete");
    public void ClickDelete(){
        driver.findElement(btnDelete).click();
    }

    //locator click pop up delete
    By popupDel = By.id("dialogDeleteBtn");
    public void ClickPopupDelete(){
        driver.findElement(popupDel).click();
    }

    //locator assert delete success
    public void DeleteSuccess(){
        driver.getPageSource().contains("Successfully Deleted");
    }

}
