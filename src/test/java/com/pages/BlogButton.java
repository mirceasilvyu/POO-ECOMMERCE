package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogButton extends BasePage{

    public final static String LOGIN_URL = BASE_URL;
    public BlogButton(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[3]/a/div/span")
    private WebElement myBlog;
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[3]/a/div/span")
    private WebElement checkMyBlog;
    public void clickMyBlog(){this.myBlog.click();}
    public String clickCheckMyBlog(){return checkMyBlog.getText();}

}
