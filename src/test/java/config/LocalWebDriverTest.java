package config;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocalWebDriverTest extends WebDriverTest {

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    public void tearDown() {
        driver.close();
    }
}
