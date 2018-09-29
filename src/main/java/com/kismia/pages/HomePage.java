package com.kismia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    private static final String WELCOME_PHRASE_SELECTOR = ".home-page__form-title";

    private static final String MAIN_CONTENT_SELECTOR = "div.main_content";

    private static final String NEW_HEADER_PHOTO_SELECTOR = "div.new-header-right > ul";

    private static final String SUBMIT_BUTTON_SELECTOR = "form.home-page-form.js_signInForm > a";

    private static final String LOGOUT_BUTTON_SELECTOR = "li:nth-child(4)";

    private static final String DATING_PHRASE_SELECTOR = "li:nth-child(1) > a >span:nth-child(2)";

    /**
     * HomePage constructor
     *
     * @param driver Selenium WebDriver
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Welcome phrase is enabled from login page
     *
     * @return boolean if welcome phrase is enabled
     */
    public boolean isWelcomePhrase() {
        return this.driver.findElement(By.cssSelector(WELCOME_PHRASE_SELECTOR)).isEnabled();
    }

    /**
     * Check if main content is displayed
     *
     * @return boolean if main content is displayed
     */
    public boolean isMainContent() {
        return this.driver.findElement(By.cssSelector(MAIN_CONTENT_SELECTOR)).isDisplayed();
    }

    /**
     * Get header photo item
     *
     * @return WebElement of header photo
     */
    public WebElement getHeaderPhoto() {
        return this.driver.findElement(By.cssSelector((NEW_HEADER_PHOTO_SELECTOR)));
    }

    /**
     * Enter email and password to login
     *
     * @param email String of user email
     * @param password String of user password
     */
    public void enterLoginPassword(String email, String password) {
        WebElement loginField = this.driver.findElement(By.name("email"));
        loginField.clear();
        loginField.sendKeys(email);

        WebElement passwordField = this.driver.findElement(By.name("password"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    /**
     * Submit email and password to server
     *
     * @return HomePage page loading after successful login
     */
    public HomePage submit() {
        this.driver.findElement(By.cssSelector(SUBMIT_BUTTON_SELECTOR)).click();
        return new HomePage(driver);
    }

    /**
     * Logout from main page
     *
     * @return HomePage of welcome page
     */
    public HomePage logOut() {
        getHeaderPhoto().click();
        this.driver.findElement(By.cssSelector(LOGOUT_BUTTON_SELECTOR)).click();
        return new HomePage(driver);
    }

    /**
     * Change language
     *
     * @param language String to switch language
     */
    public void changeLanguage(String language) {
        this.driver.findElement(By.linkText(language)).click();
    }

    /**
     * Get dating phrase from main page
     *
     * @return String from main page
     */
    public String getDatingPhrase() {
        return this.driver.findElement(By.cssSelector(DATING_PHRASE_SELECTOR)).getText();
    }

}
