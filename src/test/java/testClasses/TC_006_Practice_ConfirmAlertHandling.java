package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.AlertPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_006_Practice_ConfirmAlertHandling extends BaseClass
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
		
		apo.clickConfirmBoxAlertBtn();;
		apo.switchToAlert();
		Thread.sleep(2000);
		//apo.acceptAlert();
		apo.dismissAlert();
		String alertMsg=apo.getAlertConfirmMessage();
		System.out.println("the alert text on confirm alert button:"+alertMsg);
		Thread.sleep(2000);
	}

}
