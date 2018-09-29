package com.kismia;

import com.kismia.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.kismia.AccountTest.LOGIN;
import static com.kismia.AccountTest.PASSWORD;
import static org.testng.Assert.assertTrue;

public class LanguageTest extends FunctionalTest {

    private HomePage homePageObject;

    @BeforeMethod
    public void init() {
        homePageObject = new HomePage(driver);
        getURI();
    }

    @Test(dataProvider = "languageValue", dataProviderClass = LanguageData.class)
    public void changeLanguage(String language, String value) {
        assertTrue(homePageObject.isWelcomePhrase());

        homePageObject.enterLoginPassword(LOGIN, PASSWORD);
        homePageObject.submit();
        assertTrue(homePageObject.isMainContent());

        homePageObject.changeLanguage(language);
        assertTrue(homePageObject.getDatingPhrase().equals(value));
    }
}
