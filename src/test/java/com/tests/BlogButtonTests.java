package com.tests;

import com.pages.BlogButton;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pages.LoginPage.LOGIN_URL;

public class BlogButtonTests extends BaseTest {


    @Test(testName = " Verify the function of the Blog Button")
    public void blogbutton() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        BlogButton blogButton = new BlogButton(driver);
        blogButton.clickMyBlog();
        System.out.println(blogButton.clickCheckMyBlog());
        Assert.assertTrue(blogButton.clickCheckMyBlog().contains("Blog"));
    }
}
