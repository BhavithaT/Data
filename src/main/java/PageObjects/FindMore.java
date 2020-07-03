package PageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FindMore extends Constructor{
	
	//WebElement driver;

	@AndroidFindBy(xpath="//*[text()='Find a Job']")
	private WebElement FindaJob;
	
	
	  @AndroidFindBy(id="iv_settings")
	  private WebElement set;
	 
	
	/*
	 * @AndroidFindBy(xpath="//*[text()='Disable Notifications']") 
	 * private WebElement DN;
	 */
	
	/*
	 * @AndroidFindBy(id="iv_settings") 
	 * private WebElement set;
	 */
	
	 @AndroidFindBy(xpath="//*[text()='Edit Search']") 
	 private WebElement ED;
	 
	 @AndroidFindBy(xpath="//*[@class='android.widget.ImageButton']") 
	 private WebElement button;
	 
	 
	 /*
	 * @AndroidFindBy(id="et_keywords") private WebElement tit;
	 * 
	 * @AndroidFindBy(id="action_find") private WebElement find;
	 */
	  
	/*
	 * @AndroidFindBy(xpath="//*[text()='Pause Search']") private WebElement PS;
	 */
	  
	/*
	 * @AndroidFindBy(xpath="//*[text()='Delete Search']") private WebElement DS;
	 */
   
	/*
	 * @AndroidFindBy(xpath="//*[text()='DELETE']") private WebElement delete;
	 */
   
	/*
	 * @AndroidFindBy(xpath="//*[text()='CANCEL']") private WebElement cancel;
	 */
	 
	 
	
	
	
	
	public FindMore(AppiumDriver<MobileElement> driver)
	{
		 super(driver);
	}
	
	public void more(String Tit) throws InterruptedException
	{
		Thread.sleep(6000);
		FindaJob.click();
		set.click();
		//DN.click();
		Thread.sleep(6000);
		//set.click();
		//Thread.sleep(1000);
		ED.click();
		Thread.sleep(1000);
		button.click();
		//tit.sendKeys(Tit); 
		//find.click();
		Thread.sleep(1000);
	    //PS.click();
	    Thread.sleep(5000);
	    //DS.click();
	    Thread.sleep(3000);
	    //delete.click();
	    //cancel.click();
		
		
	}
}
