package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPageObjects 
{
	public WebDriver driver;
	Alert alertwindow;
	
	public AlertPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='Alert']") WebElement AlertBtn;
	@FindBy(xpath="//button[@onclick='myMessage()']") WebElement DelayedAlertBtn;//alert will come after 5 mins
	@FindBy(xpath="//button[@onclick='myDesk()']") WebElement ConfirmAlertBtn;//confirmbox will appear and a message will be dispalyed on click on OK
	@FindBy(xpath="//div[@id='desk']") WebElement ConfirmMsg;//message will come You pressed OK!
	@FindBy(xpath="//button[@onclick='myPromp()']") WebElement PromptAlertBtn;//you will give a prompt and wither choose cancel or ok
	
	
	public void switchToAlert()
	{
		alertwindow=driver.switchTo().alert();
	}
	
	public void acceptAlert()
	{
		alertwindow.accept();
	}
	
	public void dismissAlert()
	{
		alertwindow.dismiss();
	}
	
	public String  getAlertText()
	{
		String str=alertwindow.getText();
		return str;
	}
	
	
	//click first alert button
	public void clickAlertBtn()
	{
		AlertBtn.click();
	}
	
	//clickDelayedAlertbtn
	public void clickDelayedAlertBtn()
	{
		DelayedAlertBtn.click();
	}
	
	//click on alert button which has both accept and cancel
	public void clickConfirmBoxAlertBtn()
	{
		ConfirmAlertBtn.click();
	}
	//get confirmation message on running above method
	public String getAlertConfirmMessage()
	{
		String str=ConfirmMsg.getText();
		return str;
	}
	//click button which will open alert where we will enter prompt
	public void clickPromptAlertBtn()
	{
		PromptAlertBtn.click();
	}
	
	//send prompt in the alert by calling the above method
	public void enterPromptinAlert()
	{
		alertwindow.sendKeys("This is test message");
	}
	
	
	

}
