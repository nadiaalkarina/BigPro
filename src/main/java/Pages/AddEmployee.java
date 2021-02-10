package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddEmployee {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public AddEmployee(WebDriver driver) {
        this.driver=driver;
    }

    //locator for firstname
    By Fname = By.id("firstName");
    public void FirstName(String fname){
        driver.findElement(Fname).sendKeys(fname);
    }

    //locator for middle name
    By Mname = By.id("middleName");
    public void MiddleName(String mname){
        driver.findElement(Mname).sendKeys(mname);
    }

    //locator for last name
    By Lname = By.id("lastName");
    public void LastName(String lname){
        driver.findElement(Lname).sendKeys(lname);
    }

    //locator for employee ID
    By eID = By.id("employeeId");
    public void EmployeeID(String EID){
        driver.findElement(eID).click();
        driver.findElement(eID).clear();
        driver.findElement(eID).sendKeys(EID);
    }

    //Method upload picture
    By foto = By.id("photofile");
    public void UploadPicture(String file){
        WebElement chooseFile = driver.findElement(foto);
        chooseFile.sendKeys(file);
    }

    //Locator click create login details
    By lDetail = By.id("chkLogin");
    public void ClickLoginDetail(){
        driver.findElement(lDetail).click();
    }

    //locator for username
    By uname = By.id("user_name");
    public void UserName(String Uname){
        driver.findElement(uname).sendKeys(Uname);
    }

    //locator for password
    By pass = By.id("user_password");
    public void Password(String Pass){
        driver.findElement(pass).sendKeys(Pass);
    }

    //locator for confirm password
    By cpass = By.id("re_password");
    public void ConfirmPassword(String CPass){
        driver.findElement(cpass).sendKeys(CPass);
    }

    //locator select drop down
    By select = By.id("status");
    public void SelectStatus(String en) {
        Select status = new Select(driver.findElement(select));
        status.selectByValue(en);
    }

    //Locator click create login details
    By btnSave = By.id("btnSave");
    public void ClickSave(){
        driver.findElement(btnSave).click();
    }

    //locator assertion success
    public void RegisterSuccess(){
        WebElement actualString = driver.findElement(By.xpath("//*[@id=\"profile-pic\"]/h1"));
        String strng = actualString.getText();
        Assert.assertEquals("Julius sire caesar",strng);
    }


    //locator assert add employee not success
    public void UsernameExist(){
        driver.getPageSource().contains("Failed To Save: User Name Exists");
    }

    //Locator assertion invalid
    public void Invalid(){
        WebElement actualString = driver.findElement(By.id("spanMessage"));
        String strng = actualString.getText();
        Assert.assertEquals("Invalid credentials",strng);
    }
}
