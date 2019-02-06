package Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Basetest implements Autoconstant
{

	public static WebDriver driver;
	static 
	{
		System.setProperty(ChromeKey, ChromeValue);
		System.setProperty(GeckoKey, GeckoValue);
		System.setProperty(IEkey, IEvalue);
	}
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void beforemethod(String browser)
	{
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
			else if(browser.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else
				driver=new InternetExplorerDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/faveo-helpdesk-advance/public/");
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
	Thread.sleep(3500);
	driver.close();
}


}

