package Automate.Pages.Interface;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public interface SignUpVerification {
    void navigateToSignUpFromSignIn(AndroidDriver<MobileElement> driver);

    String SignUpWithValidInformation(AndroidDriver<MobileElement> driver);

    void SignUpWithInValidInformation(AndroidDriver<MobileElement> driver, String email);
}
