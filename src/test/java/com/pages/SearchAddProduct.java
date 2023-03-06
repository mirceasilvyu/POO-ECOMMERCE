package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAddProduct  extends BasePage{
    public final static String LOGIN_URL = BASE_URL;
    public SearchAddProduct(WebDriver driver){super(driver);}



    @FindBy(xpath = "//*[@id=\'search\']/div[1]/div[1]/div[2]/input")
    private WebElement searchBar;
    @FindBy(xpath ="//*[@id=\'search\']/div[2]/button")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\'mz-product-grid-image-31-212469\']/div/div[1]/img")
    private WebElement myProduct;

    @FindBy(css = "#entry_216842 ")
    private WebElement addToCartProduct;

    public void populateSearchField(){this.searchBar.sendKeys(PRODUCT_SEARCH);}
    public void clickSearchBar(){this.searchButton.click();}
    public void clickOnMyProduct() {this.myProduct.click();}

    public void clickOnAddToCart(){this.addToCartProduct.click();}

}
