package com.learning.selenium;


import com.learning.selenium.businessfunctions.HomePage;
import com.learning.selenium.driver.DriverHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.UUID;

public class HomePageTests extends DriverHelper {

    HomePage signUp;
    String email;
    public static Logger log = LogManager.getLogger(HomePageTests.class.getName());

    @BeforeTest
    public void initDriver() throws IOException {
        driver = initializeDriver();
        signUp = new HomePage(driver);
        email = UUID.randomUUID().toString() + "@test.com";
    }

    @Test(priority=2)
    public void testAccountCreationInput() throws InterruptedException {
        log.info("Starting the test:testAccountCreationInput");
        signUp.getAccountCreationInput().sendKeys(email);
        // Thread.sleep(2000);
        signUp.getAccountCreationButton().click();
        Assert.assertEquals("YOUR PERSONAL INFORMATION", signUp.getYourPersonalInformationLabel().getText());
        // Thread.sleep(2000);
        log.info("Completed the test:testAccountCreationInput");
    }

    @Test(priority=1)
    public void signUpButtonExists() {
        driver.get(prop.getProperty("homePageUrl"));
        WebElement signUpButtonFromPage = signUp.getSignUpButton();
        Assert.assertEquals("Sign in", signUpButtonFromPage.getText());
    }

    @AfterTest
    public void cleanUpDriver() {
        driver.close();
        //driver.quit();
        driver = null;
    }
}
