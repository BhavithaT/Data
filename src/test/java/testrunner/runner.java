package testrunner;

import org.testng.annotations.Test;

import PageObjects.Loginnn;
import PageObjects.MatchLeave;
import PageObjects.MatchProfile;
import PageObjects.MatchingPost;
import PageObjects.MyProfile;
import PageObjects.PostMore;
import PageObjects.FindMore;
//import PageObjects.MatchingPost;
import baseClass.AppiumC;

public class runner extends AppiumC{

	@Test
	public void logii1() throws InterruptedException
	{
		Thread.sleep(3000);
		Loginnn ln=new Loginnn(driver);
		ln.data();
		
		
		/*
		 * Thread.sleep(2000); MatchingPost MP=new MatchingPost(driver); 
		 * MP.Data1();
		 */
		 
		/*
		 * Thread.sleep(1000); 
		 * FindMore PM=new FindMore(driver); 
		 * PM.more("Constructor");
		 */
		/*
		 * Thread.sleep(1000); 
		 * PostMore Pm=new PostMore(driver);
		 *  Pm.post("Plumb");
		 */
		
		/*
		 * MyProfile prof=new MyProfile(driver);
		 *  prof.profile();
		 */
		/*
		 * Thread.sleep(1000); 
		 * MatchLeave ML=new MatchLeave(driver); 
		 * ML.leave();
		 */
		
		/*
		 * MatchProfile prof=new MatchProfile(driver); 
		 * prof.pro();
		 */
		
	}
}
