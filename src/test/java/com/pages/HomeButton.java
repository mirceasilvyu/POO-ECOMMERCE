package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeButton extends BasePage {
    public final static String LOGIN_URL = BASE_URL;


    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[2]/a")
    private WebElement specialOffers;
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[2]/a")
    private WebElement checkSpecialOffers;

    public HomeButton(WebDriver driver) {
        super(driver);
    }
    public void clickSpecialOffers(){this.specialOffers.click();}
    public String clickCheckSpecialOffers(){return checkSpecialOffers.getText();}

}