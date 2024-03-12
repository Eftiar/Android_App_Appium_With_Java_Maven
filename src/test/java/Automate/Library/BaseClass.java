package Automate.Library;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseClass {

	public static AndroidDriver<MobileElement> driver;
	private Properties properties;

	public BaseClass() {
		try {
			properties = new Properties();
			String filePath = System.getProperty("user.dir") + "/src/test/java/Automate/Resources/properties";
			FileInputStream inputStream;

			inputStream = new FileInputStream(filePath);
			properties.load(inputStream);

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void setUp() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		// capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);

		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

		// capability.setCapability(MobileCapabilityType.APP, "C:\\User\\Downloads\\app-debug.apk");

		capability.setCapability("appPackage", properties.getProperty("appPackage")); // app capability

		capability.setCapability("appActivity", properties.getProperty("appActivity")); //app activity

		//capability.setCapability(MobileCapabilityType.NO_RESET, true);

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capability);

	}

	public String getMail() {

		return properties.getProperty("email");
	}

	public String getPassword() {

		return properties.getProperty("password");
	}

	public String getPackage() {

		return properties.getProperty("appPackage");
	}

	public void tearDown() {
		driver.quit();
	}


}