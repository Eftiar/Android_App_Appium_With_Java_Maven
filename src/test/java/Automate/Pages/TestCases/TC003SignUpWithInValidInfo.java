package Automate.Pages.TestCases;

import Automate.Library.BaseClass;
import Automate.Pages.Implementation.SignIn;
import Automate.Pages.Implementation.SignUp;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC003SignUpWithInValidInfo extends BaseClass {
    SignIn sign = new SignIn();
    SignUp signUp = new SignUp();

    @BeforeTest
    public void setupDriver() throws MalformedURLException {

        setUp();
    }

    @Test(priority = 1)
    public void navigation() {
        sign.navigateToSignIn(driver);
        signUp.navigateToSignUpFromSignIn(driver);
    }

    @Test (priority = 2)
    public void verifyInValidSignUp() {
        signUp.SignUpWithInValidInformation(driver, getMail());
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }
}
