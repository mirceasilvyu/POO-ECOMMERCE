package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut extends BasePage{
    public final static String LOGIN_URL = BASE_URL;
    public LogOut(WebDriver driver) {super(driver);}
    @FindBy(xpath = "//*[@id=\'column-right\']/div/a[14]")
    private WebElement logMeOutButton;
    public void clickLogMeOutButton(){this.logMeOutButton.click();}
}
