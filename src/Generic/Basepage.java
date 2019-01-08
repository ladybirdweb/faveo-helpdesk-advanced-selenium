package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Basepage
{
	public WebDriver driver;
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void elementvisiblity(WebElement element)
	{
		//WebDriverWait wait=new WebDriverWait(driver,100);
		 Timeouts wait=driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
