package Generic;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Basetest implements Autoconstant
{

	public static WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void beforemethod(String browser)
	{
		if(browser.equals("chrome")){
			System.setProperty(ChromeKey,ChromeValue);
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty(GeckoKey,GeckoValue);
			driver=new FirefoxDriver();
		}
		/*System.setProperty(ChromeKey, ChromeValue);
		driver=new ChromeDriver();*/
		driver.get(URL);
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

    public static  boolean isClickable(WebElement webe)      
	{
	try
	{
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	   wait.until(ExpectedConditions.elementToBeClickable(webe));
	   return true;
	}
	catch (Exception e)
	{
	  return false;
	}
	}
}




