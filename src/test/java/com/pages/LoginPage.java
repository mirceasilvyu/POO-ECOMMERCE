package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public final static String LOGIN_URL = BASE_URL;
    @FindBy(xpath = "//*[@id=\'widget-navbar-217834\']/ul/li[6]/a/div/span")
    private WebElement myAccountButton;

    @FindBy(xpath = "//*[@id=\'input-email\']")
    private WebElement usernameInput;
    @FindBy(xpath = "//*[@id=\'input-password\']")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\'input-password\']")
    private WebElement passwordInputWrong;
    @FindBy(xpath = "//*[@id=\'content\']/div/div[2]/div/div/form/input[1]")
    private WebElement loginButton;
   // @FindBy (id="flash") private WebElement alertLogout;



    public LoginPage(WebDriver driver) {super(driver);}

    public void enterUsername(){usernameInput.sendKeys(LOG_INEMAIL);}

    public void enterPassword(){passwordInput.sendKeys(PASSWORD);}
    public void enterPasswordWrong(){passwordInputWrong.sendKeys(WRONG_PASSWORD);}

    public void clickLogin(){loginButton.click();}
    public void clickMyAccountButton(){ this.myAccountButton.click();}
    }

