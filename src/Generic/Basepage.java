package Generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		catch(Exception e)
		{
			Reporter.log("its not systemlogs page", true);
			Assert.fail();
		}
		
	}
	

}

