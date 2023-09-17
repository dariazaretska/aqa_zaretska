package pageobjectpattern.netaporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends AbstractPage {

    private static final By SIGN_IN_TITLE = By.xpath("//h2[@class='Panel20__title']");
    private static final By EMAIL_TITLE = By.xpath("//label[@for='logonId']");
    private static final By EMAIL_FILLED = By.xpath("//input[@type='email']");
    private static final By PASSWORD_TITLE = By.xpath("//label[@for='login.logonPassword']");
    private static final By PASSWORD_FILLED = By.xpath("//input[@type='password']");
    private static final By PASSWORD_FORGOT = By.xpath
            ("//a[@class='LoginAndRegistrationForm20__forgotPasswordLink']");
    private static final By LOGIN_BUTTON = By.xpath
            ("//button[@class='Button10 Button10--submit SimpleAsyncButton10 LoginAndRegistrationForm20__submit primaryButton']");
    private static final By NO_ACCOUNT_TITLE = By.xpath("//div[@class='LoginAndRegistrationForm20__footerTitle']");
    private static final By CREATE_ACCOUNT_BUTTON = By.xpath("//a[@class='Button10 Button10--secondary LoginAndRegistrationForm20__toggleSignInButton']");
    private static final By LOGIN_ERROR = By.xpath("//div[@class='ValidatedField14 ValidatedField14--logonId ValidatedField14--error LoginAndRegistrationForm20__email LoginAndRegistrationForm20__email--error']//span");
    private static final By PASSWORD_ERROR = By.xpath("//div[@class='ValidatedField14 ValidatedField14--login.logonPassword ValidatedField14--error LoginForm20__field LoginForm20__field--error']//span");
    private static final By LOGIN_PASSWORD_ERROR = By.xpath("//span[@class='Notification13__message Notification13__message--error']");
    private static final By ACCEPT_ALL_COOKIES = By.xpath("//button[@id='footer_tc_privacy_button_3']");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSIGN_IN_TITLE() {
        return getDriver().findElement(SIGN_IN_TITLE);
    }

    public WebElement getEMAIL_TITLE() {
        return getDriver().findElement(EMAIL_TITLE);
    }

    public WebElement getEMAIL_FILLED() {
        return getDriver().findElement(EMAIL_FILLED);
    }

    public WebElement getPASSWORD_TITLE() {
        return getDriver().findElement(PASSWORD_TITLE);
    }

    public WebElement getPASSWORD_FILLED() {
        return getDriver().findElement(PASSWORD_FILLED);
    }

    public WebElement getPASSWORD_FORGOT() {
        return getDriver().findElement(PASSWORD_FORGOT);
    }

    public WebElement getLOGIN_BUTTON() {
        return getDriver().findElement(LOGIN_BUTTON);
    }

    public WebElement getNO_ACCOUNT_TITLE() {
        return getDriver().findElement(NO_ACCOUNT_TITLE);
    }

    public WebElement getCREATE_ACCOUNT_BUTTON() {
        return getDriver().findElement(CREATE_ACCOUNT_BUTTON);
    }

    public WebElement getLOGIN_ERROR() {
        return getDriver().findElement(LOGIN_ERROR);
    }

    public WebElement getPASSWORD_ERROR() {
        return getDriver().findElement(PASSWORD_ERROR);
    }

    public WebElement getLOGIN_PASSWORD_ERROR() {
        return getDriver().findElement(LOGIN_PASSWORD_ERROR);
    }

    public WebElement getACCEPT_ALL_COOKIES() {
        return getDriver().findElement(ACCEPT_ALL_COOKIES);
    }
}
