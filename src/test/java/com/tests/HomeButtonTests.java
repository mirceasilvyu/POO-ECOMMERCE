package com.tests;

import com.pages.HomeButton;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class HomeButtonTests extends BaseTest{


    @Test(testName = "Verify the function of the Home button")
    public void homeButtonInquiry() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        HomeButton homeButton = new HomeButton(driver);
        homeButton.clickSpecialOffers();
        System.out.println(homeButton.clickCheckSpecialOffers());
        Assert.assertTrue(homeButton.clickCheckSpecialOffers().contains("Special"));
    }
}
