package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPanel {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public LoginPanel(WebDriver driver) {
        this.driver=driver;
    }

    //locator for username
    By uname = By.id("txtUsername");
    public void UserName(String Uname){
        driver.findElement(uname).sendKeys(Uname);
    }

    //locator for password
    By pass = By.id("txtPassword");
    public void Password(String Pass){
        driver.findElement(pass).sendKeys(Pass);
    }

    //locator for button login
    By btnlogin = By.id("btnLogin");
    public void BtnLogin(){
        driver.findElement(btnlogin).click();
    }

    //locator assertion success
    public void LoginSuccess(){
        WebElement actualString = driver.findElement(By.id("welcome"));
        String strng = actualString.getText();
        //Assert.assertEquals("Welcome Anfo",strng);
    }

    //Locator assertion invalid
    public void Invalid(){
        WebElement actualString = driver.findElement(By.id("spanMessage"));
        String strng = actualString.getText();
        Assert.assertEquals("Invalid credentials",strng);
    }

    //locator assert login panel
    public void LogPan(){
        WebElement actualString = driver.findElement(By.id("logInPanelHeading"));
        String strng = actualString.getText();
        Assert.assertEquals("LOGIN Panel",strng);
    }
}
