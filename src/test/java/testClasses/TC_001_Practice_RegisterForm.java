package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.RegisterPageObjects;

public class TC_001_Practice_RegisterForm extends BaseClass
{
	@Test
	public void TC_001_RegisterUser() throws InterruptedException
	{
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.enterDetails();
		Thread.sleep(2000);
		rpo.clickRegisterBtn();
		Thread.sleep(2000);
		
		boolean result=rpo.checkFieldValue();
		
		if(result)
		{
			System.out.println("TEST CASE PASSED");
		}
		else
		{
			Assert.fail("TEST CASE FAILED");
		}
	}
}
