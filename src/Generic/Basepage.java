package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
	public void systemlogselementvisiblity(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,100);
		try
		{
			
			Reporter.log(" system logs element is displayed",true);
	
		}
		catch(Exception e)
		{
			Reporter.log("system logs element not displayed", true);
			Assert.fail();
		}
		
}
	public void exceptionlogselementvisiblity( WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,100);
		 //Timeouts wait=driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try
		{
			
			Reporter.log(" exception logs element is displayed",true);
	
		}
		catch(Exception e)
		{
			Reporter.log("exception logs element not displayed", true);
			Assert.fail();
		}
	
}
	public void cronelementvisiblity(WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,100);

			try
			{
				
				Reporter.log(" cronlogs  element is displayed",true);
		
			}
			catch(Exception e)
			{
				Reporter.log("cronlogs element is not displayed", true);
				Assert.fail();
			}
		
	}
	public void email_logs_elementvisiblity(WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,100);

			try
			{
				
				Reporter.log(" email logs  element is displayed",true);
		
			}
			catch(Exception e)
			{
				Reporter.log("email logs element is not displayed", true);
				Assert.fail();
			}
		
	}
	
	public void check_systemLogs_breadcrumb(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,100);

		try
		{
			
			Reporter.log(" its system logs page",true);
	
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("its not systemlogs page", true);
			Assert.fail();
		}
		
	}
	
	public void homebuttonvisiblity(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,100);

		try
		{
			
			Reporter.log(" we are in home page",true);
	
		}
		catch(Exception e)
		{
			Reporter.log("we are not in homepage", true);
			Assert.fail();
		}
	}
	
	public void checksystemlogs(WebElement element) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,150);

		try
		{
			
			Reporter.log(" system logs is visible",true);
	
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("system logs is not visible", true);
			Assert.fail();
		}

	}
	
	public void checkmailnomatchingrecords(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,150);

		try
		{
			
			Reporter.log("there are no matching records",true);
	
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("there are matching records", true);
			Assert.fail();
		}
	}
	
	
	
	
	
	
	
}
