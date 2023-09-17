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

    public boolean isSignInTextDisplayed() {
        return signInPage.getSIGN_IN_TITLE().isDisplayed();
    }

    public String isSignInTextValid() {
        return signInPage.getSIGN_IN_TITLE().getText();
    }

    public boolean isEmailTextDisplayed() {
        return signInPage.getEMAIL_TITLE().isDisplayed();
    }

    public String isEmailTextValid() {
        return signInPage.getEMAIL_TITLE().getText();
    }

    public boolean isPasswordTextDisplayed() {
        return signInPage.getPASSWORD_TITLE().isDisplayed();
    }

    public String isPasswordTextValid() {
        return signInPage.getPASSWORD_TITLE().getText();
    }

    public boolean isForgotYourPasswordTextDisplayed() {
        return signInPage.getPASSWORD_FORGOT().isDisplayed();
    }

    public String isForgotYourPasswordTextValid() {
        return signInPage.getPASSWORD_FORGOT().getText();
    }

    public boolean isDontHaveAccountTextDisplayed() {
        return signInPage.getNO_ACCOUNT_TITLE().isDisplayed();
    }

    public String isDontHaveAccountTextValid() {
        return signInPage.getNO_ACCOUNT_TITLE().getText();
    }
}
