package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects 
{
	public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']") WebElement Email;
	@FindBy(xpath="//input[@id='password']") WebElement pwd;
	@FindBy(xpath="//input[@value='Login']") WebElement Login_Btn;
	@FindBy(xpath="//a[normalize-space()='New User']") WebElement NewUser_Btn;
	@FindBy(xpath="//h1[normalize-space()='Welcome, Login In']") WebElement LoginHeaderTxt;
	
	public void enterDetails()
	{
		Email.sendKeys("johndoe007@mailinator.com");
		pwd.sendKeys("Test@123");
		
	}
	
	public void clickLogin()
	{
		Login_Btn.click();
	}
	
	public boolean checkHeader()
	{
		return LoginHeaderTxt.getText().equals("Welcome, Login In");
	}
	
	
}
