package com.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UITest extends BaseTest {

    @Test
    void testGBNotEmailLogin() {
        driver.get("https://gb.ru/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("login", "password");

        Assertions.assertFalse(loginPage.getErrorMessages());
    }

    @Test
    void testGBWithoutPassword() {
        driver.get("https://gb.ru/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("login@login.ru", "");

        Assertions.assertFalse(loginPage.getErrorMessages());
    }
}

