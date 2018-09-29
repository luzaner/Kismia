package com.kismia;

import config.LocalWebDriverTest;
import config.WebDriverTest;
import org.apache.http.client.utils.URIBuilder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class FunctionalTest {

    private static WebDriverTest webDriverTestConfiguration;

    protected static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        webDriverTestConfiguration = new LocalWebDriverTest();
        webDriverTestConfiguration.setUp();
        driver = webDriverTestConfiguration.driver;
    }

    @AfterMethod
    public static void afterMethod() throws Exception {
        webDriverTestConfiguration.cleanUp();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        webDriverTestConfiguration.tearDown();
    }

    protected void getURI() {
        try {
            URIBuilder builder = new URIBuilder();
            builder.setScheme("http");
            builder.setHost("kismia.com");
            driver.get(builder.build().toURL().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
