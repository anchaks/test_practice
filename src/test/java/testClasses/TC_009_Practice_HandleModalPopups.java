package testClasses;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.ModalDialogPageObjects;
import pageObjects.RegisterPageObjects;

public class TC_009_Practice_HandleModalPopups extends BaseClass
{
	@Test
	public void TC_009_HandleModalPopups() throws InterruptedException
	{
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.clickAlertFrameWindowBtnLeftNav();
		Thread.sleep(2000);
		rpo.clickModalDialogLnk();
		
		ModalDialogPageObjects mdpo=new ModalDialogPageObjects(driver);
		mdpo.clickSmallModalBtn();
		Thread.sleep(2000);
		String smallModalTxt=mdpo.getSmallModalText();
		System.out.println("The Small modal text is:"+smallModalTxt);
		Thread.sleep(2000);
		mdpo.clickSmallModalCloseBtn();
		Thread.sleep(2000);
		
	}

}
