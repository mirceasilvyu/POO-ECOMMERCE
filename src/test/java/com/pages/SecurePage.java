package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurePage extends BasePage{
    public SecurePage(WebDriver driver) {super(driver);}
    @FindBy(xpath = "//*[@id=\'account-login\']/div[1]")
    private WebElement wrongPassword;
    @FindBy(css = "#content > p:nth-child(3)")
    private WebElement verifyLogMeOut;
    @FindBy(xpath = "//*[@id=\'content\']/p")
    private WebElement wishListResult;
    public String clickVerifyLogMeOut(){return verifyLogMeOut.getText();}
    public String clickVerifyWrongPassword(){return wrongPassword.getText();}
    public String clickwishListResult(){return  wishListResult.getText();}

}
