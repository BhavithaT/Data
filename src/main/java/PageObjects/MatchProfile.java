package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MatchProfile extends Constructor
{
	 @AndroidFindBy(xpath="//*[text()='Find a Job']")
	 private AndroidElement FindaJob;
		
	 @AndroidFindBy(id="btn_action1")
	 private AndroidElement matc;
	 
	 @AndroidFindBy(xpath="//*[@id='iv_profile_pic' and (./preceding-sibling::* | ./following-sibling::*)[@text='ddd']]")
     private AndroidElement prof;	
	 
	 @AndroidFindBy(xpath="//*[text()='Leave a Message']")
	 private AndroidElement LM;
	 
	 @AndroidFindBy(id="container_profile")
	 private AndroidElement cont;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']")
	 private AndroidElement more;
	 
	 @AndroidFindBy(xpath="//*[@text='Add User to Favorites']")
	 private AndroidElement adfav;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']")
	 private AndroidElement more1;
	 
	 @AndroidFindBy(xpath="//*[@text='Unfavorite User']")
	 private AndroidElement unfav;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']")
	 private AndroidElement more2;
	 
	 @AndroidFindBy(xpath="//*[@text='Block User']")
	 private AndroidElement block;
	 
	 @AndroidFindBy(id="tv_cancel_action")
	 private AndroidElement cancel;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']") 
	 private AndroidElement more3;
	 
	 @AndroidFindBy(xpath="//*[@text='Block User']")
	 private AndroidElement block1;
	  
	 @AndroidFindBy(xpath="//*[@text='BLOCK']") 
	 private AndroidElement BLOCK;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']") 
	 private AndroidElement more4;
	 
	 @AndroidFindBy(xpath="//*[@text='Unblock User']") 
	 private AndroidElement unblock;
	 
	 @AndroidFindBy(id="tv_cancel_action")
	 private AndroidElement cancel1;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']") 
	 private AndroidElement more6;
	 
	 @AndroidFindBy(xpath="//*[@text='Unblock User']") 
	 private AndroidElement UB;
	 
	 @AndroidFindBy(xpath="//*[@text='UNBLOCK']") 
	 private AndroidElement UNBLOCK;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']") 
	 private AndroidElement more7;
	 
	 @AndroidFindBy(xpath="//*[@text='Report User']") 
	 private AndroidElement report;
	 
	 @AndroidFindBy(xpath="//*[@text='Just Report User']") 
	 private AndroidElement JRU;
	 
	 @AndroidFindBy(xpath="//*[@text='DONE']") 
	 private AndroidElement DONE;
	 
	 @AndroidFindBy(xpath="//*[@id='ic_menu_icon']") 
	 private AndroidElement more8;
	 
	 @AndroidFindBy(xpath="//*[@text='Report User']") 
	 private AndroidElement reuser;
	 
	 @AndroidFindBy(xpath="//*[@text='Submit Feedback']") 
	 private AndroidElement submit;
	 
	 @AndroidFindBy(xpath="//*[@id='et_input_text']") 
	 private AndroidElement sent;
	 
	 @AndroidFindBy(xpath="//*[text()='REPORT']") 
	 private AndroidElement REPORT;

	 
    public MatchProfile(AppiumDriver<MobileElement> driver)
	 {
		super(driver);
	 }

	public void pro() throws InterruptedException
	 {
		 Thread.sleep(7000);
		 FindaJob.click();
		 Thread.sleep(2000);
		 matc.click();
		 Thread.sleep(6000);
		 prof.click();
		 Thread.sleep(1000);
		 LM.click();
		 Thread.sleep(1000);
		 cont.click();
		 Thread.sleep(6000);
		 more.click();
		 Thread.sleep(1000);
		 adfav.click();
		 Thread.sleep(1000);
		 more1.click();
		 Thread.sleep(2000);
		 unfav.click();
		 Thread.sleep(1000);
		 more2.click();
		 Thread.sleep(2000);
		 block.click();
		 cancel.click();
		 more3.click(); 
		 Thread.sleep(1000); 
		 block1.click();
		 BLOCK.click();
		 Thread.sleep(5000);
		 more4.click();
		 unblock.click();
		 cancel1.click();
		 Thread.sleep(3000);
		 Thread.sleep(2000);
		 more6.click();
		 Thread.sleep(1000);
		 UB.click();
		 UNBLOCK.click();
		 Thread.sleep(1000);
		 more7.click();
		 report.click();
		 JRU.click();
		 Thread.sleep(2000);
		 DONE.click();
		 more8.click();
		 reuser.click();
		 submit.click();
		 Thread.sleep(2000);
		 sent.sendKeys("hi");
		 REPORT.click();
		 
	 }

}
