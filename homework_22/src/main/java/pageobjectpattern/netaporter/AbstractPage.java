package pageobjectpattern.netaporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class AbstractPage {

    protected WebDriver driver;
    protected WebDriverWait driverWait;
    private static final Duration timeout = Duration.ofSeconds(10);

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, timeout);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
