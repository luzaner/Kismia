package com.kismia;

import com.kismia.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends FunctionalTest {

    private HomePage homePageObject;

    @BeforeMethod
    public void init() {
        homePageObject = new HomePage(driver);
        getURI();
    }

    @Test
    public void loadPage() {
        assertTrue(homePageObject.isWelcomePhrase());
    }


}
