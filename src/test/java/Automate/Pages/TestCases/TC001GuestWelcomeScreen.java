package Automate.Pages.TestCases;

import Automate.Library.BaseClass;
import Automate.Pages.Implementation.GuestWelcomeScreen;
import Automate.Pages.Implementation.SignIn;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TC001GuestWelcomeScreen extends BaseClass {

    SignIn sign = new SignIn();
    GuestWelcomeScreen guest = new GuestWelcomeScreen();

    @BeforeTest
    public void setupDriver() throws MalformedURLException {

        setUp();
    }

    @Test
    public void screenVerification() {
        guest.guiVerify(driver);
    }



    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }

}
