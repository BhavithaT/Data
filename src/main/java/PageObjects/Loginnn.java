package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Loginnn extends Constructor{
	
	@AndroidFindBy(id="btn_login")
	private AndroidElement l1;
	
	@AndroidFindBy(id="et_phone_number")
	private AndroidElement MN;
	
	@AndroidFindBy(id="et_password")
	private AndroidElement Pas;
	
    @AndroidFindBy(id="action_next")
    private AndroidElement Nex;
    
    public Loginnn(AppiumDriver<MobileElement> driver)
    {
    	super(driver);
    }
    
    public void data() throws InterruptedException
    {
    	Thread.sleep(2000);
		l1.click();	
		Thread.sleep(1000);
		MN.sendKeys("8549817445");
		Pas.sendKeys("password");
		Nex.click();
    }


}
