package pom.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.factory.DriverManager;

public class BaseTest {

    private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return this.driver.get();
    }

    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    @BeforeMethod
    public void startDriver() {
        setDriver(new DriverManager().intializeDriver());
    }

    @AfterMethod
    public void quitDriver() {
        getDriver().quit();
    }

}
