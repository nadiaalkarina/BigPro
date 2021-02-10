package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Punch_In_Out {
    WebDriver driver;

    public Punch_In_Out(WebDriver driver){
        this.driver = driver;
    }

    //locator for notes punch in
    By notes = By.id("note");
    public void FillNotes(String N){
        driver.findElement(notes).sendKeys(N);
    }

    //locator for click button In
    By buttonIn = By.id("btnPunch");
    public void ClickIn(){
        driver.findElement(buttonIn).click();
    }

    //locator for click button In
    By buttonOut = By.id("btnPunch");
    public void ClickOut(){
        driver.findElement(buttonOut).click();
    }

    //locator assert punch
    public void AssertPunch(){
        driver.getPageSource().contains("Successfully Saved");
    }

    //locator assert punch failed
    public void AssertPunchFailed(){
        driver.getPageSource().contains("FAILED");
    }


}
