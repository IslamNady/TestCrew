package com.stc.pages;

import com.stc.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Base {
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[text()='Haven’t subscribed yet?']")
    WebElement subscribeLbl;
    @FindBy(name = "username")
    WebElement emailTxt;
    @FindBy(name = "password")
    WebElement passwordTxt;
    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextBtn;
    @FindBy(xpath = "//button[text()='Sign In']")
    WebElement signInBtn;
    @FindBy(xpath = "//span[text()='Incorrect credentials for this Login ID. Please enter the correct credentials']")
    WebElement errorMsg;

    public void verifySubscribeTextIsDisplayed(){
        Assert.assertTrue(subscribeLbl.isDisplayed());
    }
    public void LoginWithInvalidCredentials(String username, String password){
        emailTxt.sendKeys(username);
        nextBtn.click();
        passwordTxt.sendKeys(password);
        signInBtn.click();
        Assert.assertTrue(errorMsg.isDisplayed());
    }
    public void verifyErrorMsgAppeared(){
        Assert.assertTrue(errorMsg.isDisplayed());
    }
}
