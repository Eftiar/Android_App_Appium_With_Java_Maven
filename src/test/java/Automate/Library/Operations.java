package Automate.Library;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import net.andreinc.mockneat.MockNeat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Operations {

    static MobileElement findElement(By path, AndroidDriver<MobileElement> driver) {
        return (MobileElement) driver.findElement(path);
    }

    public static void selectDropdownElementByIndex(By path, int index, AndroidDriver<MobileElement> driver) {
        List options = driver.findElements(path);
        System.out.println("Total number of options available in dropdown:"+options.size());
        MobileElement el = (MobileElement) options.get(index);
        System.out.println("Selecting the index"+index);
        el.click();
    }

    public static String createRandomDate(int startYear, int endYear, int startMonth, int endMonth, int startDate, int endDate) {
        int day = createRandomIntBetween(startDate, endDate);
        int month = createRandomIntBetween(startMonth, endMonth);
        int year = createRandomIntBetween(startYear, endYear);
        //return String.format("%d/%d/%s", year, month, day);
        return (month+"-"+day+"-"+year).toString();
    }

    public static void selectDropdownElementByText(By path, String text, AndroidDriver<MobileElement> driver) {
        List options = driver.findElements(path);
        System.out.println("Total number of options available in dropdown:"+options.size());
        for(int index=0;index < options.size(); index++){
            MobileElement el = (MobileElement) options.get(index);
            if (el.getText() == text){
                System.out.println("Text contains on index: " +index);
                el.click();
            }
        }
    }

    public static MobileElement findElementByText(String text, AndroidDriver<MobileElement> driver) {
        return driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\""+text+"\")");
    }

    public static void scrollIntoElementByText(String text, AndroidDriver<MobileElement> driver) {
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
    }

    public static void clickElementByText(String text, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElementByText(text, driver);
        el.click();
    }

    public static void sendKeysByTextElement(String locatorText, String text, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElementByText(locatorText, driver);
        el.clear();
        el.sendKeys(text);
    }

    public static void matchTextByTextElement(String text, String expectedText, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElementByText(text, driver);
        String actualText = el.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public static void click(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        el.click();
    }

    public static void sendText(By locator, String text, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        el.clear();
        el.sendKeys(text);
    }

    public static void hideKeyboard(AndroidDriver<MobileElement> driver) {
        driver.hideKeyboard();
    }

    public static void matchText(By locator, String expectedText, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        String actualText = el.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public static String getTextForElementCaptureByText(String text, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElementByText(text, driver);
        return el.getText();
    }

    public static String getText(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        return el.getText();
    }

    public static void matchAttribute(By locator, String expectedText,String attributeName, AndroidDriver<MobileElement> driver){
        WebElement el = findElement(locator, driver);
        String actualText = el.getAttribute(attributeName);
        Assert.assertEquals(actualText, expectedText);
    }

    public static boolean verifyElementIsDisplayedByText(String text, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElementByText(text, driver);
        boolean isDisplayed = el.isDisplayed();
        System.out.println("Element displayed is : " + isDisplayed);
        assert isDisplayed;
        return true;
    }

    public static boolean verifyElementIsDisplayed(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        boolean isDisplayed = el.isDisplayed();
        System.out.println("Element displayed is : " + isDisplayed);
        assert isDisplayed;
        return true;
    }

    public static boolean verifyElementIsEnabled(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        boolean isEnabled = el.isEnabled();
        System.out.println("Element enabled is : " + isEnabled);
        assert isEnabled;
        return true;
    }

    public static boolean verifyElementIsSelectedByText(String text, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElementByText(text, driver);
        boolean isSelected = el.isSelected();
        System.out.println("Element selected is : " + isSelected);
        return isSelected;
    }

    public static boolean verifyElementIsSelected(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        boolean isSelected = el.isSelected();
        System.out.println("Element selected is : " + isSelected);
        return isSelected;
    }

    public static boolean waitForElementPresenceByText(String text,int timeLimitInSeconds,AndroidDriver<MobileElement> driver){
        try{
            MobileElement el =  findElementByText(text, driver);
            WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
            wait.until(ExpectedConditions.visibilityOf(el));
            boolean isElementPresent = el.isDisplayed();
            return isElementPresent;
        }catch(Exception e){
            boolean isElementPresent = false;
            System.out.println(e.getMessage());
            return isElementPresent;
        }
    }

    public static boolean waitForElementPresence(By locator,int timeLimitInSeconds,AndroidDriver<MobileElement> driver){
        try{
            MobileElement el =  findElement(locator, driver);
            WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
            wait.until(ExpectedConditions.visibilityOf(el));
            boolean isElementPresent = el.isDisplayed();
            return isElementPresent;
        }catch(Exception e){
            boolean isElementPresent = false;
            System.out.println(e.getMessage());
            return isElementPresent;
        }
    }

    public static boolean verifyElementIsPresentByText(String text, AndroidDriver<MobileElement> driver) {
        try{
            MobileElement el = findElementByText(text, driver);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean verifyElementIsPresent(By locator, AndroidDriver<MobileElement> driver) {
        try{
            MobileElement el = driver.findElement(locator);
            return true;
        } catch (Exception e) {
                return false;
            }
    }

    public static boolean verifyElementIsNotPresent(By locator, AndroidDriver<MobileElement> driver) {
        try{
            MobileElement el = driver.findElement(locator);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static String getRandomEmail(String domainName, AndroidDriver<MobileElement> driver) {
        MockNeat mock = MockNeat.threadLocal();
        String corpEmail = (String) mock.emails().domain(domainName).val();
        return corpEmail;
    }

    public static void switchToWebView(AndroidDriver<MobileElement> driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Set<String> availableContexts = driver.getContextHandles();
        System.out.println("Total No of Context Found After we reach to WebView = " + availableContexts.size());
        for (String context : availableContexts) {
            if (context.contains("WEBVIEW")) {
                System.out.println("Context Name is " + context);
                // 4.3 Call context() method with the id of the context you want to access and change it to WEBVIEW_1
                //(This puts Appium session into a mode where all commands are interpreted as being intended for automating the web view)
                driver.context(context);
                driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
                break;
            }
        }
    }

    public static void switchToMobileView(AndroidDriver<MobileElement> driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Set<String> availableContexts = driver.getContextHandles();
        System.out.println("Total No of Context Found After we reach to MobileView = " + availableContexts.size());
        for (String context : availableContexts) {
            if (context.contains("NATIVE")) {
                System.out.println("We are Back to " + context);
                driver.context(context);
            }
        }
    }
}

