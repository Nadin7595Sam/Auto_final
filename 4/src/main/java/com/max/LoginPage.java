package com.max;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private final By usernameInput = By.xpath("/html/body/div[2]/div[7]/div/form/div[1]/input");
    private final By passwordInput = By.xpath("/html/body/div[2]/div[7]/div/form/div[2]/input");
    private final By loginButton = By.xpath("/html/body/div[2]/div[7]/div/form/div[4]/input");
    private final By errorMessages = By.xpath("/html/body/div[2]/div[7]/div/form/div[1]/ul");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean getErrorMessages() {
        return !driver.findElements(errorMessages).isEmpty();
    }
}

