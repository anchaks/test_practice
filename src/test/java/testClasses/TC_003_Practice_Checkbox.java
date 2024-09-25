package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.CheckboxPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_003_Practice_Checkbox extends BaseClass
{
	@Test
	public void TC_003_CheckboxTests() throws InterruptedException
	{
		RegisterPageObjects hpo=new RegisterPageObjects(driver);
		hpo.clickElementLeftNav();
		Thread.sleep(2000);
		hpo.clickCheckboxLeftNav();
		Thread.sleep(1000);
		
		CheckboxPageObjects cbo=new CheckboxPageObjects(driver);
		cbo.click_L1PlusSign();
		Thread.sleep(2000);
		
		cbo.clickSL1Plussign();
		Thread.sleep(2000);
		
		cbo.click_SL1L1Checkbox();
		cbo.click_SL1L2Checkbox();
		cbo.click_SL1L3Checkbox();
		cbo.click_SL1L4Checkbox();
		
		boolean checkedResult=cbo.checkSL1CheckboxSelected();
		
		if(checkedResult)
			System.out.println("TEST CASE PASSED");
		else
			Assert.fail("TEST CASE FAILED");
				
				
	}
}
