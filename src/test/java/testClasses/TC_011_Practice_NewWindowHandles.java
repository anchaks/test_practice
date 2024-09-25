package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.BrowserWindowPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_011_Practice_NewWindowHandles extends BaseClass
{
	@Test
	public void TC_010_TabHandles() throws InterruptedException
	{
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.clickAlertFrameWindowBtnLeftNav();
		Thread.sleep(2000);
		rpo.clickBrowserWindowLnk();
		
		BrowserWindowPageObjects bpo=new BrowserWindowPageObjects(driver);
		bpo.clickNewWindowBtn();
	}

}
