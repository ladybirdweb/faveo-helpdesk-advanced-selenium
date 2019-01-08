package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Basepage1
{
	public WebDriver driver;
	public Basepage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void elementvisiblity(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("the admin is verified",true);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			Reporter.log("The admin is unverified", true);
			Assert.fail();
		}
	}
	public void elementvisiblity1(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("the admin is verified",true);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			Reporter.log("The admin is unverified", true);
			Assert.fail();
		}
	}
	public void elementvisiblityban(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("the admin is BAN!! or DEACTIVATED!!!",true);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			Reporter.log("The admin is not BAN or DEACTIVATED", true);
			Assert.fail();
		}
	}
	public void elementvisiblityagent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("the agent is verified",true);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			Reporter.log("The agent is unverified", true);
			Assert.fail();
		}
	}
	public void elementvisiblityagentban(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("the agent  is BAN!! or DEACTIVATED!!!",true);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			Reporter.log("The agent is not BAN or DEACTIVATED", true);
			Assert.fail();
		}
	}
	public void elementvisiblityuserverified(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("the user is unverified",true);
			Thread.sleep(2000);
		}
		catch(Exception e)	
		{    
			Reporter.log("The user  verified", true);
			Assert.fail();
		}
		
	}
 public void userbann(WebElement element) 
 {
	 WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("the user is ban or deactivated",true);
			Thread.sleep(2000);
		}
		catch(Exception e)	
		{    
			Reporter.log("The user is not ban or deactivated", true);
			Assert.fail();
		}
		
	}
	 
 }






















