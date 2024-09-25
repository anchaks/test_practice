package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogPageObjects
{
	public WebDriver driver;
	
	public ModalDialogPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[normalize-space()='Small Modal']") WebElement SmallModalBtn;
	@FindBy(xpath="//button[normalize-space()='Large Modal']") WebElement LargeModalBtn;
	@FindBy(xpath="//div[@class='modal-dialog modal-sm']//div[@class='modal-content']") WebElement SmallModalPopup;
	@FindBy(xpath="//div[@class='modal-dialog modal-sm']//button[@class='btn btn-primary'][normalize-space()='Close']") WebElement SmallModalPopupCloseBtn;
	
	
	public void clickSmallModalBtn()
	{
		SmallModalBtn.click();
	}
	
	public String getSmallModalText()
	{
		String str=SmallModalPopup.getText();
		return str;
	}
	
	public void clickSmallModalCloseBtn()
	{
		SmallModalPopupCloseBtn.click();
	}
}
