package Automate.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class SignUp_OR {
    public static class Locator{

        public static String signUpScreenTitle = "Welcome!";

        public static String signUpScreenSubTitle = "Sign Up Below";

        public static By firstNameField = By.xpath("//android.widget.EditText[@resource-id='first_name']");

        public static By lastNameField = By.xpath("//android.widget.EditText[@resource-id='last_name']");

        public static By emailField = By.xpath("//android.widget.EditText[@resource-id='email']");

        public static By phoneNumberField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[4]/android.view.View/android.view.View[5]/android.widget.EditText");

        public static By phoneNumberFieldKoala = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View[4]/android.view.View/android.view.View[5]/android.widget.EditText");

        public static By passwordField = By.xpath("//android.widget.EditText[@resource-id='password']");

        public static By zipCodeField = By.xpath("//android.widget.EditText[@resource-id='zip_code']");

        public static By referralCodeField = By.xpath("//android.widget.EditText[@resource-id='invite_code']");

        public static By birthdayField = By.xpath("//android.widget.EditText[@resource-id='birthday']");

        public static String favLocationField = "Favorite Location";

        public static By favLocationList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView");

        public static String termsAndConditionCheckbox = "terms & conditions";

        public static By signUpButton= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.Button");

        public static By signUpButtonKoala = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.Button");

        public static String alreadyHaveAnAccountLabel = "Already have an account?";

        public static By signInLink = By.xpath("//android.view.View[@content-desc=\"Sign In\"]/android.widget.TextView");

        public static String backCTA = "Go back";

        public static String errorAlertSignUp = "Could not create account:";

        public static String successAlertSignUpLogin = "Please login to continue.";

        public static String successAlertSignUp = "Account successfully created.";


    }


    public static class UIElementConstant{

        public static String signUpScreenTitle = "Welcome!";

        public static String signUpScreenSubTitle = "Sign Up Below";

        public static String favLocationField = "Favourite Location";

        public static String signUpButton = "Sign Up";

        public static String alreadyHaveAnAccountLabel = "Sign In";

        public static String signInLink = "Sign in with Facebook";

        public static String forgotPasswordLink = "Forgot Password?";

        public static String signUpLink = "Sign Up";

        public static String errorAlertSignUp = "Could not create account: Email has already been taken";

        public static String successAlertSignUpLogin = "Please login to continue.";

        public static String successAlertSignUpMod = "Account successfully created.";

        public static String errorAlertSignUpKoala = "Could not create account: It looks like this email address is already registered with an account. Simply login to get started. If you can't remember your password, click 'Forgot Password.'";

    }
}
