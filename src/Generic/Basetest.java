package Generic;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Basetest implements Autoconstant
{

	public static WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty(ChromeKey, ChromeValue);
		driver=new ChromeDriver();
		driver.get("http://localhost/faveo-helpdesk-advance/public/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
    @AfterMethod(alwaysRun=true)
    public void aftermethod(ITestResult res) throws InterruptedException
    {
    	int status=res.getStatus();
    	String name=res.getMethod().getMethodName();
    	if(status==2)
		Screenshot.getphoto(driver,name);
    	//driver.quit();
    	driver.close();
    }

}


