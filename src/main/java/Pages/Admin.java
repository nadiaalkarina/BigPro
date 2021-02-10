package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Admin {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public Admin(WebDriver driver) {
        this.driver=driver;
    }



    //locator for click element User Management
    By uManagement = By.id("menu_admin_UserManagement");
    public void ClickUserManagement(){
        driver.findElement(uManagement).click();
    }

    //locator for element sub admin
    By user = By.id("menu_admin_viewSystemUsers");
    public void ClickUser(){
        driver.findElement(user).click();
    }

    //locator employee username
    By employeeUsername = By.id("searchSystemUser_userName");
    public void EmployeeUsername(String name){
        driver.findElement(employeeUsername).sendKeys(name);
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

    //Locator assertion no record employee
    public void NoRecord(){
        WebElement actualString = driver.findElement(By.xpath("//td[contains(text(),'No Records Found')]"));
        String strng = actualString.getText();
        Assert.assertEquals("No Records Found",strng);
    }
}
