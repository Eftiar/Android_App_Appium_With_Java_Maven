package Automate.Pages.TestCases;

import Automate.Library.BaseClass;
import Automate.Library.Operations;
import Automate.Pages.Implementation.GuestWelcomeScreen;
import Automate.Pages.Implementation.SignIn;
import Automate.Pages.ObjectRepository.SignIn_OR;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC002SignIn extends BaseClass {
    SignIn sign = new SignIn();
    GuestWelcomeScreen guest = new GuestWelcomeScreen();

    @BeforeTest
    public void setupDriver() throws MalformedURLException {

        setUp();
    }

    @Test (priority = 1)
    public void screenVerification() {
        sign.navigateToSignIn(driver);
        sign.guiVerify(driver);
    }

    @Test (priority = 2)
    public void verifyInValidLogin() {
        sign.SignInWithInValidCredential(driver);

    }

    @Test (priority = 3)
    public void verifyValidLogin() {
        sign.SignInWithValidCredential(driver, getMail(), getPassword());
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }
}
