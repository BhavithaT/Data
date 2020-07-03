package PageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Constructor {

	 public AppiumDriver<MobileElement> driver;
	 public Constructor(AppiumDriver<MobileElement> driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
}
