package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
