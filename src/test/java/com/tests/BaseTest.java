package com.tests;

import com.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  {
    public static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    protected static WebDriver driver;
    @BeforeMethod
    protected void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }

    @AfterMethod
    protected void tearDown(){
        driver.manage().window().maximize();
    }
//      //  driver.manage().deleteAllCookies();
//        //driver.close();}

}
