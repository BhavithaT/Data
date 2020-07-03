package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MatchLeave extends Constructor
{
	
    @AndroidFindBy(xpath="//*[text()='Find a Job']")
	private AndroidElement FindaJob;
	
	@AndroidFindBy(id="btn_action1")
	private AndroidElement matc;
	
	@AndroidFindBy(xpath="//*[@id='iv_profile_pic' and (./preceding-sibling::* | ./following-sibling::*)[@text='dn jdkdkd']]")
	private AndroidElement fg;
	
	@AndroidFindBy(xpath="//*[text()='Leave a Message']")
	private AndroidElement LM;
	
	@AndroidFindBy(id="et_input_text")
	private AndroidElement input;
	
	@AndroidFindBy(xpath="//*[@id='et_input_text']")
	private AndroidElement send;
	
	@AndroidFindBy(id="ib_sent")
	private AndroidElement back;
	
	@AndroidFindBy(id="container_profile")
	private AndroidElement profile;
	
	public MatchLeave(AppiumDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	public void leave() throws InterruptedException
	{
		Thread.sleep(5000);
		FindaJob.click();
		Thread.sleep(1000);
		matc.click();
		Thread.sleep(8000);
		fg.click();
		Thread.sleep(5000);
		LM.click();
		Thread.sleep(3000);
		input.click();
		Thread.sleep(8000);
		send.sendKeys("hi");
		Thread.sleep(2000);
		back.click();
		Thread.sleep(2000);
		profile.click();
		
	}

}
