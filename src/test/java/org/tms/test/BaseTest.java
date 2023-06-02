package org.tms.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.tms.driver.DriverSingleton;

@Listeners
public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getInstance().getDriver();
    }

    @AfterClass
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }

}
