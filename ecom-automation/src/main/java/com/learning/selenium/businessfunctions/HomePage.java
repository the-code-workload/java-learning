package com.learning.selenium.businessfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;
    By signup = By.cssSelector("a.login");
    By accountCreationInput = By.id("email_create");
    By accountCreationButton = By.id("SubmitCreate");
    By yourPersonalInformationLabel = By.xpath("//h3[contains(text(),'Your personal information')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignUpButton() {
        return driver.findElement(signup);
    }

    public WebElement getAccountCreationInput() {
        return driver.findElement(accountCreationInput);
    }

    public WebElement getAccountCreationButton() {
        return driver.findElement(accountCreationButton);
    }

    public WebElement getYourPersonalInformationLabel() {
        return driver.findElement(yourPersonalInformationLabel);
    }

}



