package Automate.Pages.Implementation;
import Automate.Pages.ObjectRepository.UserWelcomeScreen_OR;
import com.thedeanda.lorem.LoremIpsum;

import Automate.Library.Operations;
import Automate.Pages.Interface.SignUpVerification;
import Automate.Pages.ObjectRepository.SignIn_OR;
import Automate.Pages.ObjectRepository.SignUp_OR;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.Random;

public class SignUp implements SignUpVerification {


    @Override
    public void navigateToSignUpFromSignIn(AndroidDriver<MobileElement> driver) {
        Operations.verifyElementIsDisplayed(SignIn_OR.Locator.signUpLink, driver);
        Operations.click(SignIn_OR.Locator.signUpLink, driver);
    }

    @Override
    public String SignUpWithValidInformation(AndroidDriver<MobileElement> driver) {
        LoremIpsum ipsum = new LoremIpsum();
        String firstName = ipsum.getWords(2,3);
        String lastName = ipsum.getWords(1,1);

        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        String email = Operations.getRandomEmail("yopmail.com", driver);

        int randomNumber = 2126000000+number;
        String phoneNumber = String.format("%10d", randomNumber);

        String password = "12345678";
        String zipCode = "12345";
        String referralCode = "";
        String date = Operations.createRandomDate(1990,2000,10,12,10,28);
        int index = Operations.createRandomIntBetween(1,3);

        Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.signUpScreenTitle, driver);
        Operations.matchTextByTextElement(SignUp_OR.Locator.signUpScreenTitle, SignUp_OR.UIElementConstant.signUpScreenTitle, driver);

        Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.signUpScreenSubTitle, driver);
        Operations.matchTextByTextElement(SignUp_OR.Locator.signUpScreenSubTitle, SignUp_OR.UIElementConstant.signUpScreenSubTitle, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.firstNameField, driver);
        Operations.sendText(SignUp_OR.Locator.firstNameField, firstName, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.lastNameField, driver);
        Operations.sendText(SignUp_OR.Locator.lastNameField, lastName, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.emailField, driver);
        Operations.sendText(SignUp_OR.Locator.emailField, email, driver);

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.phoneNumberField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.phoneNumberField, driver);
            Operations.sendText(SignUp_OR.Locator.phoneNumberField, phoneNumber, driver);
        }

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.phoneNumberFieldKoala, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.phoneNumberFieldKoala, driver);
            Operations.sendText(SignUp_OR.Locator.phoneNumberFieldKoala, phoneNumber, driver);
        }

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.passwordField, driver);
        Operations.sendText(SignUp_OR.Locator.passwordField, password, driver);

        Operations.scrollIntoElementByText(SignUp_OR.Locator.alreadyHaveAnAccountLabel, driver);

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.zipCodeField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.zipCodeField, driver);
            Operations.sendText(SignUp_OR.Locator.zipCodeField, zipCode, driver);
        }

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.referralCodeField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.referralCodeField, driver);
            Operations.sendText(SignUp_OR.Locator.referralCodeField, referralCode, driver);
        }

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.birthdayField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.birthdayField, driver);
            Operations.sendText(SignUp_OR.Locator.birthdayField, date, driver);
        }

        if(Operations.verifyElementIsPresentByText(SignUp_OR.Locator.favLocationField, driver)) {
            Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.favLocationField, driver);
            Operations.clickElementByText(SignUp_OR.Locator.favLocationField, driver);
            Operations.selectDropdownElementByIndex(SignUp_OR.Locator.favLocationList,index, driver);
        }

        if(Operations.verifyElementIsPresentByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver)) {
            Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver);
            if (!Operations.verifyElementIsSelectedByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver)) {
                Operations.clickElementByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver);
            }
        }
        Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.alreadyHaveAnAccountLabel, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.signInLink, driver);

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.signUpButtonKoala, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.signUpButtonKoala, driver);
            Operations.click(SignUp_OR.Locator.signUpButtonKoala, driver);
            Operations.waitForElementPresenceByText(SignUp_OR.Locator.successAlertSignUpLogin,5, driver);
            Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.successAlertSignUpLogin, driver);

        }

        else{
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.signUpButton, driver);
            Operations.click(SignUp_OR.Locator.signUpButton, driver);
            Operations.waitForElementPresenceByText(SignUp_OR.Locator.successAlertSignUp,5, driver);
            Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.successAlertSignUp, driver);
            Operations.switchToWebView(driver);
            Operations.verifyElementIsDisplayed(UserWelcomeScreen_OR.Locator.welcomeTitle, driver);
        }

        System.out.println(email);
        return email;
    }

    @Override
    public void SignUpWithInValidInformation(AndroidDriver<MobileElement> driver, String email) {
        LoremIpsum ipsum = new LoremIpsum();
        String firstName = ipsum.getWords(2,3);
        String lastName = ipsum.getWords(1,1);

        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        int randomNumber = 2126000000+number;
        String phoneNumber = String.format("%10d", randomNumber);

        String password = "12345678";
        String zipCode = "12345";
        String referralCode = "";
        String date = Operations.createRandomDate(1990,2000,10,12,10,28);
        int index = Operations.createRandomIntBetween(1,3);

        Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.signUpScreenTitle, driver);
        Operations.matchTextByTextElement(SignUp_OR.Locator.signUpScreenTitle, SignUp_OR.UIElementConstant.signUpScreenTitle, driver);

        Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.signUpScreenSubTitle, driver);
        Operations.matchTextByTextElement(SignUp_OR.Locator.signUpScreenSubTitle, SignUp_OR.UIElementConstant.signUpScreenSubTitle, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.firstNameField, driver);
        Operations.sendText(SignUp_OR.Locator.firstNameField, firstName, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.lastNameField, driver);
        Operations.sendText(SignUp_OR.Locator.lastNameField, lastName, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.emailField, driver);
        Operations.sendText(SignUp_OR.Locator.emailField, email, driver);

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.phoneNumberField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.phoneNumberField, driver);
            Operations.sendText(SignUp_OR.Locator.phoneNumberField, phoneNumber, driver);
        }

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.phoneNumberFieldKoala, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.phoneNumberFieldKoala, driver);
            Operations.sendText(SignUp_OR.Locator.phoneNumberFieldKoala, phoneNumber, driver);
        }

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.passwordField, driver);
        Operations.sendText(SignUp_OR.Locator.passwordField, password, driver);

        Operations.scrollIntoElementByText(SignUp_OR.Locator.alreadyHaveAnAccountLabel, driver);

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.zipCodeField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.zipCodeField, driver);
            Operations.sendText(SignUp_OR.Locator.zipCodeField, zipCode, driver);
        }

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.referralCodeField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.referralCodeField, driver);
            Operations.sendText(SignUp_OR.Locator.referralCodeField, referralCode, driver);
        }

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.birthdayField, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.birthdayField, driver);
            Operations.sendText(SignUp_OR.Locator.birthdayField, date, driver);
        }

        if(Operations.verifyElementIsPresentByText(SignUp_OR.Locator.favLocationField, driver)) {
            Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.favLocationField, driver);
            Operations.clickElementByText(SignUp_OR.Locator.favLocationField, driver);
            Operations.selectDropdownElementByIndex(SignUp_OR.Locator.favLocationList,index, driver);
        }

        if(Operations.verifyElementIsPresentByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver)) {
            Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver);
            if (!Operations.verifyElementIsSelectedByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver)) {
                Operations.clickElementByText(SignUp_OR.Locator.termsAndConditionCheckbox, driver);
            }
        }
        Operations.verifyElementIsDisplayedByText(SignUp_OR.Locator.alreadyHaveAnAccountLabel, driver);

        Operations.verifyElementIsDisplayed(SignUp_OR.Locator.signInLink, driver);

        if(Operations.verifyElementIsPresent(SignUp_OR.Locator.signUpButtonKoala, driver)) {
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.signUpButtonKoala, driver);
            Operations.click(SignUp_OR.Locator.signUpButtonKoala, driver);
            Operations.waitForElementPresenceByText(SignUp_OR.Locator.errorAlertSignUp,5, driver);
            Operations.matchTextByTextElement(SignUp_OR.Locator.errorAlertSignUp, SignUp_OR.UIElementConstant.errorAlertSignUpKoala, driver);

        }

        else{
            Operations.verifyElementIsDisplayed(SignUp_OR.Locator.signUpButton, driver);
            Operations.click(SignUp_OR.Locator.signUpButton, driver);
            Operations.waitForElementPresenceByText(SignUp_OR.Locator.errorAlertSignUp,5, driver);
            Operations.matchTextByTextElement(SignUp_OR.Locator.errorAlertSignUp, SignUp_OR.UIElementConstant.errorAlertSignUp, driver);

        }

        System.out.println(email);
    }
}
