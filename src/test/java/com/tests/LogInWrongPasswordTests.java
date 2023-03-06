package com.tests;

import com.pages.LoginPage;
import com.pages.SecurePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class LogInWrongPasswordTests extends BaseTest{


    @Test(testName = "LogIn and Wrong UserName")
    public void LogWrongPassword() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginpage = new LoginPage(driver);
        loginpage.clickMyAccountButton();
        loginpage.enterUsername();
        loginpage.enterPasswordWrong();
        loginpage.clickLogin();
        SecurePage securepage = new SecurePage(driver);
        System.out.println(securepage.clickVerifyWrongPassword());
        waitFor(3000);
        Assert.assertTrue(securepage.clickVerifyWrongPassword().contains("Warning:"));
        waitFor(3000);


    }
}
