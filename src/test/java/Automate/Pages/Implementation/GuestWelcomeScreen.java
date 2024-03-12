package Automate.Pages.Implementation;

import Automate.Library.Operations;
import Automate.Pages.Interface.GuestWelcomeScreenVerification;
import Automate.Pages.ObjectRepository.WelcomeScreenGuest_OR;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GuestWelcomeScreen implements GuestWelcomeScreenVerification {

    public void guiVerify(AndroidDriver<MobileElement> driver) {

        Operations.switchToWebView(driver);
        Operations.verifyElementIsDisplayed(WelcomeScreenGuest_OR.Locator.welcomeTitle, driver);
        String expectedText =Operations.getText(WelcomeScreenGuest_OR.Locator.welcomeTitle, driver);
        System.out.println(expectedText);

        Operations.verifyElementIsDisplayed(WelcomeScreenGuest_OR.Locator.signInTitle, driver);
        String expectedText2 =Operations.getText(WelcomeScreenGuest_OR.Locator.signInTitle, driver);
        System.out.println(expectedText2);

        Operations.verifyElementIsDisplayed(WelcomeScreenGuest_OR.Locator.signInLink, driver);
        Operations.matchText(WelcomeScreenGuest_OR.Locator.signInLink, WelcomeScreenGuest_OR.UIElementConstant.signInLink, driver);

        if(Operations.verifyElementIsPresent(WelcomeScreenGuest_OR.Locator.rewardsCTA,driver)){
            Operations.verifyElementIsDisplayed(WelcomeScreenGuest_OR.Locator.rewardsCTA, driver);
            Operations.matchText(WelcomeScreenGuest_OR.Locator.rewardsCTA, WelcomeScreenGuest_OR.UIElementConstant.rewardsCTA, driver);
            System.out.println("Element is present");
        }
        else
            System.out.println("Rewards Element is not present");

        if(Operations.verifyElementIsPresent(WelcomeScreenGuest_OR.Locator.inboxCTA,driver)){
            Operations.verifyElementIsDisplayed(WelcomeScreenGuest_OR.Locator.inboxCTA, driver);
            System.out.println("Element is present");
        }
        else
            System.out.println("Inbox Element is not present");

        Operations.verifyElementIsDisplayed(WelcomeScreenGuest_OR.Locator.orderNowButton, driver);
        Operations.matchText(WelcomeScreenGuest_OR.Locator.orderNowButton, WelcomeScreenGuest_OR.UIElementConstant.orderNowButton, driver);

    }

}
