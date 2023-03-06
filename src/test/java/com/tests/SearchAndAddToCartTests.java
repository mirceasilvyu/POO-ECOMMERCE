package com.tests;

import com.pages.SearchAddProduct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class SearchAndAddToCartTests extends BaseTest {


    @Test(testName="Search Product and Add it to cart")
    public void searchProduct(){
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        SearchAddProduct searchaddproduct = new SearchAddProduct(driver);
        searchaddproduct.clickSearchBar();
        searchaddproduct.populateSearchField();
        searchaddproduct.clickOnMyProduct();
        searchaddproduct.clickOnAddToCart();

    }
}
