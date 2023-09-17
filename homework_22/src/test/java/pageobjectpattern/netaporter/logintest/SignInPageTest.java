package pageobjectpattern.netaporter.logintest;

import com.hillel.homework22.factory.BrowserName;
import com.hillel.homework22.factory.WebDriverFactory;
import flows.signin.SignInFlow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjectpattern.netaporter.SignInPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SignInPageTest {

    private static SignInPage signInPage;
    private static SignInFlow signInFlow;
    private static WebDriver driver;
    private final String baseUrl = "https://www.net-a-porter.com/en-cz/account/login?redirect=%2Fen-cz%2Faccount";

    @BeforeTest
    public void init() throws InterruptedException {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        signInPage = new SignInPage(driver);
        signInFlow = new SignInFlow(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(3000);
        WebElement acceptAllCookies = signInPage.getACCEPT_ALL_COOKIES();
        acceptAllCookies.click();

    }

    @Test
    public void textSignIn() {
        driver.get(baseUrl);
        assertTrue(signInFlow.isSignInTextDisplayed());
        assertEquals(signInFlow.isSignInTextValid(), "Sign in");
    }

    @Test
    public void textEmail() {
        driver.get(baseUrl);
        assertTrue(signInFlow.isEmailTextDisplayed());
        assertEquals(signInFlow.isEmailTextValid(), "Email");
    }

    @Test
    public void textPassword() {
        driver.get(baseUrl);
        assertTrue(signInFlow.isPasswordTextDisplayed());
        assertEquals(signInFlow.isPasswordTextValid(), "Password");
    }

    @Test
    public void textForgotYourPassword() {
        driver.get(baseUrl);
        assertTrue(signInFlow.isForgotYourPasswordTextDisplayed());
        assertEquals(signInFlow.isForgotYourPasswordTextValid(), "Forgot your password?");
    }

    @Test
    public void textDontHaveAccount() {
        driver.get(baseUrl);
        assertTrue(signInFlow.isDontHaveAccountTextDisplayed());
        assertEquals(signInFlow.isDontHaveAccountTextValid(), "Don't have an account?");
    }

    @Test
    public void linkForgotYourPassword() {
        driver.get(baseUrl);
        WebElement textForgotPassword = signInPage.getPASSWORD_FORGOT();
        textForgotPassword.click();
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.net-a-porter.com/en-cz/account/forgot-password";
        assert currentUrl.equals(expectedUrl) : "URL не соответствует ожидаемому.";
    }

    @Test
    public void linkCreateAccount() {
        driver.get(baseUrl);
        WebElement buttonCreateAccount = signInPage.getCREATE_ACCOUNT_BUTTON();
        buttonCreateAccount.click();
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.net-a-porter.com/en-cz/account/register?redirect=%2Fen-cz%2Faccount";
        assert currentUrl.equals(expectedUrl) : "URL не соответствует ожидаемому.";
    }

    @Test
    public void emptyLoginError() {
        driver.get(baseUrl);
        signInFlow.fillEmail("");
        WebElement loginButton = signInPage.getLOGIN_BUTTON();
        loginButton.click();
        WebElement loginError = signInPage.getLOGIN_ERROR();
        assertTrue(loginError.isDisplayed());
        assertEquals(loginError.getText(),"Email address is required");
    }

    @Test
    public void emptyPasswordError() {
        driver.get(baseUrl);
        signInFlow.fillPass("");
        WebElement loginButton = signInPage.getLOGIN_BUTTON();
        loginButton.click();
        WebElement passwordError = signInPage.getPASSWORD_ERROR();
        assertTrue(passwordError.isDisplayed());
        assertEquals(passwordError.getText(),"Password is required");
    }
    @Test
    public void loginNegative() {
        driver.get(baseUrl);
        signInFlow.fillEmail("a@gmail.com");
        signInFlow.fillPass("fffff");
        WebElement loginButton = signInPage.getLOGIN_BUTTON();
        loginButton.click();
        WebElement loginPasswordError = signInPage.getLOGIN_PASSWORD_ERROR();
        assertTrue(loginPasswordError.isDisplayed());
        assertEquals(loginPasswordError.getText(),"Your email address and password don’t match, please try again");
    }

    @Test
    public void loginHappyPath() {
        driver.get(baseUrl);
        signInFlow.fillEmail("daria.zaretskaya@gmail.com");
        signInFlow.fillPass("Aa1234567");
        WebElement loginButton = signInPage.getLOGIN_BUTTON();
        loginButton.click();
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.net-a-porter.com/en-cz/account";
        assert currentUrl.equals(expectedUrl) : "URL не соответствует ожидаемому.";
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
