package PageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyProfile extends Constructor
{
   @AndroidFindBy(xpath="//*[@contentDescription='Open navigation drawer']")
   private WebElement menu;
   
   @AndroidFindBy(xpath="//*[@text='Account']")
   private WebElement acc;
   
   @AndroidFindBy(xpath="//*[@text='Profile']")
   private WebElement prof;
   
   @AndroidFindBy(id="iv_poster_profile")
   private WebElement pic;
   
   @AndroidFindBy(id="action_edit")
   private WebElement edit;
   
   @AndroidFindBy(xpath="//*[text()='Choose Photo']")
   private WebElement photo;
   
   @AndroidFindBy(xpath="//*[text()='Twitter']")
   private WebElement twi;
   
   @AndroidFindBy(xpath="(//*[@id='recyclerviews']/*/*[@id='iv_photo'])[2]")
   private WebElement YUP;
   
   @AndroidFindBy(xpath="//*[text()='Attach']")
   private WebElement attach;

   public MyProfile(AppiumDriver<MobileElement> driver) 
   {
	  super(driver);
   }
   
   public void profile() throws InterruptedException
   {
	   Thread.sleep(7000);
	   menu.click();
	   Thread.sleep(2000);
	   acc.click();
	   Thread.sleep(1000);
	   prof.click();
	   Thread.sleep(2000);
	   pic.click();
	   Thread.sleep(1000);
	   edit.click();
	   Thread.sleep(1000);
	   photo.click();
	   Thread.sleep(1000);
	   twi.click();
	   Thread.sleep(5000);
	   YUP.click();
	   Thread.sleep(1000);
	   attach.click();
   }
}
