package baseClass;

  //package <set your test package>;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
    import io.appium.java_client.AppiumDriver;
    import io.appium.java_client.MobileElement;
    import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.By;
	import org.testng.annotations.*;
	import java.net.URL;
	import java.net.MalformedURLException;
	import java.util.logging.Level;

	public class AppiumC {
	    private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    //protected AndroidDriver<AndroidElement> driver = null;
	    public static AppiumDriver<MobileElement> driver;
        DesiredCapabilities dc = new DesiredCapabilities();
	    
	    @BeforeMethod
	    public void setUp() throws MalformedURLException {
	        dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, "I7RKTSEYFQLZ4LHM");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.handzap.handzap.global");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.handzap.handzap.ui.main.splash.SplashScreenActivity");
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	    }
	}

