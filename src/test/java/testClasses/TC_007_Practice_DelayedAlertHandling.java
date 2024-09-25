package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.AlertPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_007_Practice_DelayedAlertHandling extends BaseClass
{
	@Test
	public void TC_005_AlertHAndling() throws InterruptedException
	{
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.clickAlertFrameWindowBtnLeftNav();
		Thread.sleep(2000);
		rpo.clickAlertLeftNavLnk();
		Thread.sleep(2000);
		
		
		AlertPageObjects apo=new AlertPageObjects(driver);
		
		apo.clickDelayedAlertBtn();
		Thread.sleep(10000);
		apo.switchToAlert();
		String str2=apo.getAlertText();
		System.out.println("the alert text on clicking delayed alert button:"+str2);
		apo.acceptAlert();
	}

}
