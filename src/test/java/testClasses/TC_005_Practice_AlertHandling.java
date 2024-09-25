package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.AlertPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_005_Practice_AlertHandling extends BaseClass
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
		
		apo.clickAlertBtn();
		apo.switchToAlert();
		Thread.sleep(2000);
		String str1=apo.getAlertText();
		System.out.println("the alert text on clicking first alert button:"+str1);
		apo.acceptAlert();
		Thread.sleep(2000);		
	}

}
