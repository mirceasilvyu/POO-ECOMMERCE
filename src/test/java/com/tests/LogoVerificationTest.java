package com.tests;

import com.pages.HomeButton;
import com.pages.Logo;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class LogoVerificationTest extends BaseTest {


    @Test(testName = "Verify the logo link of the page")
    public void logoVerification() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        HomeButton homeButton = new HomeButton(driver);
        homeButton.clickSpecialOffers();
        Logo logo = new Logo(driver);
        logo.clicklogo();
        String landingUrl = "https://ecommerce-playground.lambdatest.io/index.php?route=common/home";
        Assert.assertEquals(landingUrl, "https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
    }
}
