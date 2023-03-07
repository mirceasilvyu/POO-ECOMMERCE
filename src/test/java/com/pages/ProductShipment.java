package com.pages;

import com.tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ProductShipment extends BasePage {
    public final static String LOGIN_URL = BASE_URL;
    public ProductShipment(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\'mz-product-grid-image-28-212469\']/div/div[1]/img")
    private WebElement firstproduct;
    @FindBy(xpath = "//*[@id=\'entry_216841\']/div/input")
    private WebElement clearproducts;
    @FindBy(xpath = "//*[@id=\'entry_216841\']/div/input")
    private WebElement fiftyproducts;
    @FindBy(xpath = "//*[@id=\'entry_216843\']/button")
    private WebElement buyNowProduct;
    @FindBy(xpath = "//*[@id=\'payment-address\']/div[1]/div[1]")
    private WebElement usesameadresscheckbox;
    @FindBy(xpath = "//*[@id=\'form-checkout\']/div/div[1]/div/div[1]/div/div[1]")
    private WebElement radioButtonLogIn;
    @FindBy(xpath = "//*[@id=\'input-login-email\']")
    private WebElement inputEmail;
    @FindBy(xpath = "//*[@id=\'input-login-password\']")
    private WebElement inputPassword;
    @FindBy(xpath = "//*[@id=\'button-login\']")
    private WebElement inputLogInButton;
    @FindBy(xpath = "//*[@id=\'payment-address\']/div[1]/div[1]")
    private WebElement radioButtonSameAdress;
    @FindBy(css ="//*[text('I have read and agree to the ']")
    private WebElement radioButtonAcceptTerms;
    @FindBy(xpath = "//*[@id=\'button-save\']")
    private  WebElement continuepurchase;
    @FindBy(xpath = "//*[@id=\'content\']")
    private WebElement confirmOrderText;
    public void clickFirstProduct(){this.firstproduct.click();}
    public void clickClearProducts(){this.clearproducts.clear();}
    public void insertfiftyproducts(){this.fiftyproducts.sendKeys(FIFTY_PRODUCTS);}
    //public void checkusernameadresscheckbox(){this.usesameadresscheckbox.click();}
    public void clickBuyNowProduct(){this.buyNowProduct.click();}
    public void clickRadioButtonLogIn(){this.radioButtonLogIn.click();}
    public void clickInputEmail(){this.inputEmail.sendKeys(LOG_INEMAIL);}
    public void clickInputPassword(){this.inputPassword.sendKeys(PASSWORD);}
    public void clickInputLogInButton(){this.inputLogInButton.click();}
    public void clickRadioButtonSameAdress(){this.radioButtonSameAdress.click();}
    public void clickRadioButtonAcceptTerms(){this.radioButtonAcceptTerms.click();}
    public void clickContinuePurchase(){this.continuepurchase.click();}

    public String clickConfirmOrderText(){return confirmOrderText.getText();}

}
