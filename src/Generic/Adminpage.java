package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.Reporter;

public class Adminpage 
{
	public WebDriver driver;
	public Adminpage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void elementvisiblity(WebElement element)
	{
		//Timeouts wait=driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[contains(text(),'Admin Panel')]")).click();
	try
	{
		
		Reporter.log("element is displayed",true);

	}
	catch(Exception e)
	{
		Reporter.log("element not displayed", true);
		Assert.fail();
	}

}

}
