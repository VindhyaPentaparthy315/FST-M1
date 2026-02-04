package activities;

import java.net.URI;
import java.net.URL;

import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	UiAutomator2Options options = new UiAutomator2Options();
	options.setPlatformName("android")
	options.setAutomationName("UiAutomator2");
	options.setAppPackage("com.android.chrome");
	options.setAppActivity("com.google.android.apps.chrome.Main");

	URL serverURL = new URI("http://localhost:4723").toURL();
	// Driver Initialization
	driver = new AndroidDriver(serverURL, options);

}
