package com.tests;

import com.pages.ProductShipment;
import com.pages.SearchAddProduct;
import com.pages.WriteReview;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class WriteReviewTets  extends BaseTest{
    @Test(testName= "Write Review of a product")
    public void review(){
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        SearchAddProduct searchaddproduct = new SearchAddProduct(driver);
        searchaddproduct.clickSearchBar();
        ProductShipment productshipment =  new ProductShipment(driver);
        productshipment.clickFirstProduct();
        WriteReview writereview = new WriteReview(driver);
        writereview.clickYourName();
        writereview.clickMessage();
        writereview.clickStars();
        writereview.clickWriteReview();
        waitFor(3000);
        System.out.println(writereview.clickMessageConfirmReview());
        Assert.assertTrue(writereview.clickMessageConfirmReview().contains("Thank you for your review. It has been submitted to the webmaster for approval."));
    }
}
