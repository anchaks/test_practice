package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPageObjects 
{
	public WebDriver driver;
	
	public RadioButtonPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='igottwo']") WebElement YesBtn;
	@FindBy(xpath="//input[@value='igotthree']") WebElement ImpressiveBtn;
	@FindBy(xpath="//input[@name='inlineRadioOptions']") WebElement DisabledRadioBtn;
	
	@FindBy(xpath="//div[@id='check']") WebElement YesBtnMessage;
	@FindBy(xpath="//div[@id='check1']") WebElement ImpressiveBtnMessage;
	
	
	public boolean checkDisabledRadioBtn()
	{
		return DisabledRadioBtn.isSelected();
	}
	
	public String click_YesBtn()
	{
		YesBtn.click();
		String str1=YesBtnMessage.getText();
		return str1;
		
	}
	
	public String click_ImpressiveBtn()
	{
		ImpressiveBtn.click();
		String str2=ImpressiveBtnMessage.getText();
		return str2;
		
	}
}
