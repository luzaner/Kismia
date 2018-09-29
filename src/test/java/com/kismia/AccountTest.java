package com.kismia;

import com.kismia.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends FunctionalTest {

    static final String LOGIN = "illia.luzan411@gmail.com";

    static final String PASSWORD = "TESTkismia";

    private HomePage homePageObject;

    @BeforeMethod
    public void init() {
        homePageObject = new HomePage(driver);
        getURI();
    }

    @Test
    public void logIn() {
        assertTrue(homePageObject.isWelcomePhrase());

        homePageObject.enterLoginPassword(LOGIN, PASSWORD);
        homePageObject.submit();

        assertTrue(homePageObject.isMainContent());
    }

    @Test
    public void logOut() {
        assertTrue(homePageObject.isWelcomePhrase());

        homePageObject.enterLoginPassword(LOGIN, PASSWORD);
        homePageObject.submit();
        assertTrue(homePageObject.isMainContent());

        homePageObject.logOut();
        assertTrue(homePageObject.isWelcomePhrase());
    }

}
