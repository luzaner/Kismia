package config;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverTest {

    public static WebDriver driver;

    public abstract void setUp() throws Exception;

    public abstract void cleanUp() throws Exception;

    public abstract void tearDown() throws Exception;
}
