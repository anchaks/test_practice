package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.BrowserWindowPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_010_Practice_NewTabHandles extends BaseClass
{
	@Test
	public void TC_010_TabHandles() throws InterruptedException
	{
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.clickAlertFrameWindowBtnLeftNav();
		Thread.sleep(2000);
		rpo.clickBrowserWindowLnk();
		
		BrowserWindowPageObjects bpo=new BrowserWindowPageObjects(driver);
		bpo.clickNewTabBtn();
	}

}
