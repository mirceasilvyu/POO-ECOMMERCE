package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WriteReview extends BasePage{

    public final static String LOGIN_URL = BASE_URL;
    public WriteReview(WebDriver driver){super(driver);}

    @FindBy(id = "input-name")
    private WebElement yourname;
    @FindBy(id = "input-review")
    private WebElement yourMessage;
    @FindBy(id = "button-review")
    private WebElement writeReview;
    @FindBy(xpath = "//*[@id=\'form-review\']/div[1]/span/label[3]")
    private WebElement stars;
    @FindBy(xpath = "//*[@id=\'form-review\']/div[2]")
    private WebElement messageConfirmReview;

    public void clickYourName(){this.yourname.sendKeys(NAME);}
    public void clickMessage(){this.yourMessage.sendKeys(MESSAGE);}
    public void clickWriteReview(){this.writeReview.click();}
    public void clickStars(){this.stars.click();}
    public String clickMessageConfirmReview(){return messageConfirmReview.getText();}
}
