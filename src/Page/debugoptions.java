package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class debugoptions extends Basepage 
{
	@FindBy(xpath=".//*[@id='hid']/li/a/i")
	private WebElement login;
	@FindBy(id="user_name")
	private WebElement un;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pw;
	@FindBy(xpath="//button[@class='login-button btn btn-primary btn-block btn-flat']")
	private WebElement login1;
	@FindBy(xpath="//a[contains(text(),'Admin Panel')]")
	private WebElement Adminpanel;
	@FindBy(xpath="//i[@class='fa fa-bug fa-stack-1x']")
	private WebElement debugoptions;
	public debugoptions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clicklogin()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.login.click();
	}
	public void username(String username)
	{
		this.un.sendKeys(username);
	}
	public void passsword(String pwd)
	{
		this.pw.sendKeys(pwd);
	}
	public void clicklogin1()
	{
		this.login1.click();
	}
	public void clickAdminpanel()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.Adminpanel.click();
	}
	public void clickdebugoptions()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1990)");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 this.debugoptions.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
