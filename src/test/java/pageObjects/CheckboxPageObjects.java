package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPageObjects 
{
	public WebDriver driver;
	
	public CheckboxPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Main Level
	@FindBy(xpath="//body/main/div[@class='container']/div[@class='row d-flex justify-content-center logindiv bg-white rounded']/div[@class='col-md-8 col-lg-8 col-xl-8']/div[@class='tree_main']/ul[@id='bs_main']/li[@id='bs_1']/span[1]") WebElement L1PlusSign;
	@FindBy(xpath="//input[@id='c_bs_1']") WebElement L1_Chekbox;
	
	//Sub-Level 1
	@FindBy(xpath="//li[@id='bs_1']//li[@id='bf_1']//span[contains(@class,'plus')]") WebElement SL1Plussign;
	@FindBy(xpath="//input[@id='c_bf_1']") WebElement SL1_Checkbox;
	@FindBy(xpath="//input[@id='c_io_1']") WebElement SL1L1_Checkbox;
	@FindBy(xpath="//input[@id='c_io_2']") WebElement SL1L2_Checkbox;
	@FindBy(xpath="//input[@id='c_io_3']") WebElement SL1L3_Checkbox;
	@FindBy(xpath="//input[@id='c_io_4']") WebElement SL1L4_Checkbox;
	
	//Sub-Level 2
	@FindBy(xpath="//li[@id='bf_2']//span[@class='plus minus']") WebElement SL2Plussign;
	@FindBy(xpath="//input[@id='c_bf_2']") WebElement SL2_Checkbox;
	@FindBy(xpath="//input[@id='c_io_5']") WebElement SL2L5_Checkbox;
	@FindBy(xpath="//input[@id='c_io_6']") WebElement SL2L6_Checkbox;
	@FindBy(xpath="//input[@id='c_io_7']") WebElement SL2L7_Checkbox;
	@FindBy(xpath="//input[@id='c_io_8']") WebElement SL2L8_Checkbox;
	
	//level 1 actions start
	public void click_L1PlusSign()
	{
		L1PlusSign.click();
	}
	
	public void click_L1Checkbox()
	{
		L1_Chekbox.click();
	}
	
	public boolean checkL1CheckboxisClicked()
	{
		return L1_Chekbox.isSelected();
	}
	//#level 1 actions end
	
	//Sub Level 1 action starts
	
	public void clickSL1Plussign()
	{
		SL1Plussign.click();
	}
	
	public void click_SL1L1Checkbox()
	{
		SL1L1_Checkbox.click();
	}
	
	public void click_SL1L2Checkbox()
	{
		SL1L2_Checkbox.click();
	}
	
	public void click_SL1L3Checkbox()
	{
		SL1L3_Checkbox.click();
	}
	
	public void click_SL1L4Checkbox()
	{
		SL1L4_Checkbox.click();
	}

	public boolean checkSL1CheckboxSelected()
	{
		return SL1_Checkbox.isSelected();
	}
	
//sub level 1 action ends
}
