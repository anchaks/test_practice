package pageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserWindowPageObjects 
{
	public WebDriver driver;
	
	public BrowserWindowPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='New Tab']") WebElement NewTabbtn;
	@FindBy(xpath="//button[normalize-space()='New Window']") WebElement NewWindowBtn;
	@FindBy(xpath="//button[normalize-space()='New Window']") WebElement NewWindowMsgBtn;
	@FindBy(xpath="//h1[normalize-space()='New Window Message']") WebElement NewWindowMsg;
	
	// Clicks the 'New Tab' button and switches to the new tab
	 public void clickNewTabBtn()
	 {
		 NewTabbtn.click();
		 handleNewWindowOrTab();
	 }
	// Clicks the 'New Window' button and switches to the new window
	 public void clickNewWindowBtn()
	 {
		 NewWindowBtn.click();
		 handleNewWindowOrTab();
	 }
	// Clicks the 'New Window Message' button, switches to the new window, and prints the message
	 public void clickNewWindowMsgBtn()
	 {
		 NewWindowMsgBtn.click();
		 String newWindowHandle=handleNewWindowOrTab();
		 driver.switchTo().window(newWindowHandle);//switch to new window
		 String message=NewWindowMsg.getText();
		 System.out.println("The new window message is :"+message);
		 
	 }
	 
	 public String handleNewWindowOrTab()
	 {
		 //get current window handle
		 String currentWindow=driver.getWindowHandle();
		 
		 //get all window handles
		 Set<String> windowHandles=driver.getWindowHandles();
		 
		 //Lopp through all handles and find the new one
		 for(String windowHandle:windowHandles)
		 {
			 if(!windowHandle.equals(currentWindow))
			 {
				 //switch to new tab/window
				 driver.switchTo().window(windowHandle);
				 return windowHandle;
			 }
		 }
		 return null;
	 }
	 
	
	

}
