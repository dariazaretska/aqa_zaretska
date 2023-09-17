package flows.signin;

import org.openqa.selenium.WebDriver;
import pageobjectpattern.netaporter.SignInPage;

public class SignInFlow {
    private SignInPage signInPage;

    public SignInFlow(WebDriver webDriver) {
        this.signInPage = new SignInPage(webDriver);
    }

    public void fillEmail(String email) {
        signInPage.getEMAIL_FILLED().click();
        signInPage.getEMAIL_FILLED().sendKeys(email);
    }

    public void fillPass(String password) {
        signInPage.getPASSWORD_FILLED().click();
        signInPage.getPASSWORD_FILLED().sendKeys(password);
    }

}
