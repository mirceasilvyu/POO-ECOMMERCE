package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    final static String BASE_URL = "https://ecommerce-playground.lambdatest.io/";
    final static String LOG_INEMAIL="mirceasilvyu@gmail.com";
    final static String PASSWORD="0123456789";
    final static String WRONG_PASSWORD="123456789";
    final static String PRODUCT_SEARCH="Nikon d300";
    final static String FIFTY_PRODUCTS="5";


    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



}
