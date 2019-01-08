package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Basetest implements Autoconstant
{
public  WebDriver driver;
static
{
	System.setProperty(ChromeKey, ChromeValue);
	System.setProperty(GeckoKey, GeckoValue);	
}
@Parameters("browser")
@BeforeMethod(alwaysRun=true)
public void beforemethod(String browser)
{
	if(browser.equals("chrome"))
		driver=new ChromeDriver();
		else
			driver=new FirefoxDriver();
		driver.get("http://lbws.ml/master48/");
}
@AfterMethod(alwaysRun=true)
public void aftermethod(ITestResult res) throws InterruptedException
{
	int status=res.getStatus();
	String name=res.getMethod().getMethodName();
	if(status==2)
		Screenshot.getphoto(driver,name);
	Thread.sleep(2000);
	driver.close();
}






}

