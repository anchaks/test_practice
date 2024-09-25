package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.LoginPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_002_Practice_Login_Test extends BaseClass
{
	@Test
	public void TC_002_login() throws InterruptedException
	{
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.GotoLoginPage();
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.enterDetails();
		Thread.sleep(2000);
		lpo.clickLogin();
		Thread.sleep(2000);
		
		boolean headerResult=lpo.checkHeader();
		
		if(headerResult)
			System.out.println("TEST CASE PASSED");
		else
			Assert.fail("TEST CASE FAILED");
			
		
	}

}
