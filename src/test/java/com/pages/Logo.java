package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logo extends BasePage {

    public final static String LOGIN_URL = BASE_URL;
    public Logo(WebDriver driver){super(driver);}
    @FindBy(css = "#entry_217821 > figure > a > img")
    private WebElement logo;
    public void clicklogo(){this.logo.click();}
}
