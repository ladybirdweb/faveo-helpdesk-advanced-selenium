package loginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage1;

public class loginViaRegister extends Basepage1 
{
	@FindBy(xpath="//span[text()='Register']")
	private WebElement registerclick;
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginclick;
	@FindBy(xpath="//input[@placeholder='Email/Username']")
	private WebElement authusername;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement  authpassword;
	@FindBy(xpath="//button[@class=\"login-button btn btn-primary btn-block btn-flat\"]")
	private WebElement authloginbuttion;
	@FindBy(xpath="//a[text()='Admin Panel']")
	private WebElement adminpanel;
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement BANN;
	 @FindBy(xpath="//a[@onclick='clickDashboard(event);']")
	 private WebElement agent;
	 @FindBy(xpath="//div[@id='alert-message']")
	 private WebElement agentunverified;
	 @FindBy(xpath="//span[@id='message']")
	   private WebElement userunverified;
	 @FindBy(xpath="//div[@class='alert alert-danger']")
	   private WebElement BAN;
	public loginViaRegister(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
    public void clickregister()
    {
    	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	this.registerclick.click();
    }
    public void clicklogin()
    {
    	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	this.loginclick.click();
    }
    public void authusername(String username)
    {
    	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	this.authusername.sendKeys(username);
    }
    public void authpassword(String pwd)
    {
    	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	 this.authpassword.sendKeys(pwd);
    }
    public void clickauthloginbuttion()
    {
    	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	this.authloginbuttion.click();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
