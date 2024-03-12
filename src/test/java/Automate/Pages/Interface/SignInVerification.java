package Automate.Pages.Interface;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public interface SignInVerification {

	void navigateToSignIn(AndroidDriver<MobileElement> driver);
	
	void guiVerify(AndroidDriver<MobileElement> driver);

	void SignInWithValidCredential(AndroidDriver<MobileElement> driver, String email, String password);

	void SignInWithInValidCredential(AndroidDriver<MobileElement> driver);


}
