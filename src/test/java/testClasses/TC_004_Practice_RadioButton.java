package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.RadioButtonPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_004_Practice_RadioButton extends BaseClass
{
	@Test
	public void TC_004_RadioButton() throws InterruptedException
	{
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.clickElementLeftNav();
		Thread.sleep(2000);
		rpo.clickRadioButonLnkLeftNav();
		Thread.sleep(2000);
		RadioButtonPageObjects rbo=new RadioButtonPageObjects(driver);
		
		String strYes=rbo.click_YesBtn();
		System.out.println("the message on clicking yes radio button:"+strYes);
		Thread.sleep(2000);
		
		String strImpressive=rbo.click_ImpressiveBtn();
		System.out.println("the message on clicking Impressive radio button:"+strImpressive);
		Thread.sleep(2000);
		
		boolean res1=rbo.checkDisabledRadioBtn();
		if(res1)
		{
			System.out.println("The button is not disabled");
		}
		else
		{
			System.out.println("The button is  disabled");
		}
	}
}
