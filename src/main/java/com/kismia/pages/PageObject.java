package com.kismia.pages;

import org.openqa.selenium.WebDriver;

public class PageObject {

    protected WebDriver driver;

    /**
     * PageObject constructor
     * @param driver Selenium WebDriver
     */

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }
}
