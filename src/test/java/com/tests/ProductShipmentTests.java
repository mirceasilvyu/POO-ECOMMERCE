package com.tests;

import com.pages.ProductShipment;
import com.pages.SearchAddProduct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class ProductShipmentTests  extends  BaseTest{


    @Test(testName="Add Product to cart and Verify the expedition ")
    public void expeditionproduct(){
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        SearchAddProduct searchaddproduct = new SearchAddProduct(driver);
        searchaddproduct.clickSearchBar();
        ProductShipment productshipment =  new ProductShipment(driver);
        productshipment.clickFirstProduct();
        productshipment.clickClearProducts();
        productshipment.insertfiftyproducts();
        searchaddproduct.clickOnAddToCart();
        productshipment.clickBuyNowProduct();
        waitFor(5000);
        productshipment.clickRadioButtonLogIn();
        productshipment.clickInputEmail();
        productshipment.clickInputPassword();
        waitFor(5000);
        productshipment.clickInputLogInButton();
        waitFor(4900);
        productshipment.clickRadioButtonSameAdress();
        waitFor(3000);
        WebElement iframe = driver.findElement(By.id("input-agree"));
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();
        WebElement clickable = driver.findElement(By.id("input-agree"));
        new Actions(driver)
                .click(clickable)
                .perform();
        productshipment.clickContinuePurchase();
        waitFor(3000);
        WebElement clickable2 = driver.findElement(By.id("button-confirm"));
        new Actions(driver)
                .click(clickable2)
                .perform();
        waitFor(3000);
        System.out.println(productshipment.clickConfirmOrderText());
        waitFor(3000);
        Assert.assertTrue(productshipment.clickConfirmOrderText().contains("Your order has been successfully processed!"));
    }
}
