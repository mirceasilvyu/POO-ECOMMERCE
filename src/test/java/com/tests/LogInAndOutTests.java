package com.tests;

import com.pages.LogOut;
import com.pages.LoginPage;
import com.pages.SecurePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class LogInAndOutTests extends BaseTest {

    @Test(testName = "Verify LogIn and LogOut")
    public void positiveLogin() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickMyAccountButton();
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();
        LogOut logout = new LogOut(driver);
        logout.clickLogMeOutButton();
        SecurePage securepage = new SecurePage(driver);
        System.out.println(securepage.clickVerifyLogMeOut());
        Assert.assertTrue(securepage.clickVerifyLogMeOut().contains("You have been logged off your account. It is now safe to leave the computer."));
    }
}

