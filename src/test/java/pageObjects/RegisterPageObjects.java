package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObjects
{
	
	public WebDriver driver;
	
	public RegisterPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='firstname']") WebElement First_name;
	@FindBy(xpath="//input[@id='lastname']") WebElement Last_name;
	@FindBy(xpath="//input[@id='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement Password;
	@FindBy(xpath="//input[@value='Register']") WebElement Register_Btn;
	@FindBy(xpath="//a[normalize-space()='Back to Login']") WebElement BacktoLogin_Btn;
	
	@FindBy(xpath="//button[normalize-space()='Forms']") WebElement FormLeftNav_Btn;
	@FindBy(xpath="//a[normalize-space()='Login']")	WebElement Login_Lnk;
	@FindBy(xpath="//button[normalize-space()='Elements']") WebElement Element_LeftNav;
	@FindBy(xpath="//a[normalize-space()='Check Box']") WebElement Checkbox_LeftNav_Lnk;
	@FindBy(xpath="//a[normalize-space()='Radio Button']") WebElement RadioBtn_LeftNav_Lnk;
	@FindBy(xpath="//button[normalize-space()='Alerts, Frames & Windows']") WebElement AlertFrameWindowBtnLeftNav;
	@FindBy(xpath="//a[normalize-space()='Alerts']") WebElement AlertLeftNav_Lnk;
	@FindBy(xpath="//a[normalize-space()='Modal Dialogs']") WebElement ModalDialog_Lnk;
	@FindBy(xpath="//a[normalize-space()='Browser Windows']") WebElement BrowserWindow_Lnk;
	
	public void enterDetails()
	{
		First_name.sendKeys("John");
		Last_name.sendKeys("Doe");
		username.sendKeys("johndoe007@mailinator.com");
		Password.sendKeys("Test123");
	}
	
	public void clickRegisterBtn()
	{
		Register_Btn.click();
	}
	
	public void clickBackToLoginBtn()
	{	
		BacktoLogin_Btn.click();
		
	}
	
	public boolean checkFieldValue()
	{
		return First_name.getAttribute("value").isEmpty() && Last_name.getAttribute("value").isEmpty();
	}
	
	public void clickFormButtonLeftNav()
	{
		FormLeftNav_Btn.click();
	}
	
	public void GotoLoginPage()
	{
		BacktoLogin_Btn.click();
	}
	
	public void clickElementLeftNav()
	{
		Element_LeftNav.click();
	}
	
	public void clickCheckboxLeftNav()
	{
		Checkbox_LeftNav_Lnk.click();
	}
	
	public void clickRadioButonLnkLeftNav()
	{
		RadioBtn_LeftNav_Lnk.click();
	}
	
	public void clickAlertFrameWindowBtnLeftNav()
	{
		AlertFrameWindowBtnLeftNav.click();
	}
	
	public  void clickAlertLeftNavLnk()
	{
		AlertLeftNav_Lnk.click();
	}
	
	public void clickModalDialogLnk()
	{
		ModalDialog_Lnk.click();
	}
	
	public void clickBrowserWindowLnk()
	{
		BrowserWindow_Lnk.click();
	}
	
	

}
