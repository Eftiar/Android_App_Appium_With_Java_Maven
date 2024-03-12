package Automate.Pages.Implementation;

import Automate.Pages.Interface.SignInVerification;

import Automate.Pages.ObjectRepository.SignIn_OR;
import Automate.Pages.ObjectRepository.UserWelcomeScreen_OR;
import Automate.Pages.ObjectRepository.WelcomeScreenGuest_OR;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import Automate.Library.Operations;

public class SignIn implements SignInVerification {

    @Override
    public void navigateToSignIn(AndroidDriver<MobileElement> driver) {
        Operations.switchToWebView(driver);
        Operations.click(WelcomeScreenGuest_OR.Locator.signInLink, driver);
        Operations.switchToMobileView(driver);
    }

    @Override
    public void guiVerify(AndroidDriver<MobileElement> driver){

        Operations.verifyElementIsDisplayedByText(SignIn_OR.Locator.loginScreenTitle, driver);
        Operations.matchTextByTextElement(SignIn_OR.Locator.loginScreenTitle, SignIn_OR.UIElementConstant.loginScreenTitle, driver);
        Operations.verifyElementIsDisplayedByText(SignIn_OR.Locator.loginScreenSubTitle, driver);
        Operations.matchTextByTextElement(SignIn_OR.Locator.loginScreenSubTitle, SignIn_OR.UIElementConstant.loginScreenSubTitle, driver);
        Operations.verifyElementIsDisplayed(SignIn_OR.Locator.emailField, driver);
        Operations.verifyElementIsDisplayed(SignIn_OR.Locator.passwordField, driver);
        Operations.verifyElementIsDisplayedByText(SignIn_OR.Locator.signInButton, driver);
        Operations.matchTextByTextElement(SignIn_OR.Locator.signInButton, SignIn_OR.UIElementConstant.signInButton, driver);

        if(Operations.verifyElementIsPresentByText(SignIn_OR.Locator.signInWithFacebookButton, driver)){
            Operations.verifyElementIsDisplayedByText(SignIn_OR.Locator.signInWithFacebookButton, driver);
            Operations.matchTextByTextElement(SignIn_OR.Locator.signInWithFacebookButton, SignIn_OR.UIElementConstant.signInWithFacebookButton, driver);
        }
        Operations.verifyElementIsDisplayed(SignIn_OR.Locator.forgotPasswordLink, driver);
        Operations.matchText(SignIn_OR.Locator.forgotPasswordLink, SignIn_OR.UIElementConstant.forgotPasswordLink, driver);

        Operations.verifyElementIsDisplayed(SignIn_OR.Locator.signUpLink, driver);
        Operations.matchText(SignIn_OR.Locator.signUpLink, SignIn_OR.UIElementConstant.signUpLink, driver);

        //Operations.verifyElementIsDisplayed(SignIn_OR.Locator.backCTA, driver);

    }
    @Override
    public  void SignInWithInValidCredential(AndroidDriver<MobileElement> driver){

        Operations.click(SignIn_OR.Locator.emailField, driver);
        Operations.sendText(SignIn_OR.Locator.emailField,"test@yopmail.com", driver);
        Operations.hideKeyboard(driver);
        Operations.click(SignIn_OR.Locator.passwordField, driver);
        Operations.sendText(SignIn_OR.Locator.passwordField,"12347890", driver);
        Operations.hideKeyboard(driver);
        Operations.clickElementByText(SignIn_OR.Locator.signInButton, driver);
        Operations.waitForElementPresenceByText(SignIn_OR.Locator.errorLoginAlert, 5, driver);
        Operations.matchTextByTextElement(SignIn_OR.Locator.errorLoginAlert, SignIn_OR.UIElementConstant.errorLoginAlert, driver);

    }
    @Override
    public  void SignInWithValidCredential(AndroidDriver<MobileElement> driver, String email, String password){
        Operations.click(SignIn_OR.Locator.emailField, driver);
        Operations.sendText(SignIn_OR.Locator.emailField,email, driver);
        Operations.hideKeyboard(driver);
        Operations.click(SignIn_OR.Locator.passwordField, driver);
        Operations.sendText(SignIn_OR.Locator.passwordField,password, driver);
        Operations.hideKeyboard(driver);
        Operations.clickElementByText(SignIn_OR.Locator.signInButton, driver);
        Operations.switchToWebView(driver);
        Operations.verifyElementIsDisplayed(UserWelcomeScreen_OR.Locator.welcomeTitle, driver);
    }
}
