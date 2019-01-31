package Page;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class users extends Basepage 
{
	@FindBy(xpath=".//*[@id='hid']/li/a/i")
	private WebElement login;
	@FindBy(id="user_name")
	private WebElement un;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pw;
	@FindBy(xpath="//button[@class='login-button btn btn-primary btn-block btn-flat']")
	private WebElement login1;
	@FindBy(xpath="/html/body/div/header/nav/div/ul[1]/li[2]/a")
	private WebElement users;
	@FindBy(xpath="//a[text()='User directory']")
	private WebElement directory;
	
	//click on create user
		@FindBy(xpath="//span[@class='glyphicon glyphicon-plus']")
		private WebElement createuser;
		
		//enter name of the user
		@FindBy(xpath="//input[@name='textfield0']")
		private WebElement enterfirstnameuser;

		//enter lname of user
		@FindBy(xpath="//input[@name='textfield1']")
		private WebElement enterlastnameuser;
		
		//enter email of the user
		@FindBy(xpath="//input[@name='mail4']")
		private WebElement enteremailuser;
		
		//click on submit
		@FindBy(xpath="//button[@ng-disabled='faveoForm.$invalid']")
		private WebElement clickonsubmituser;
		
		//click on agent for logout
		@FindBy(xpath="//span[@class='hidden-xs']")
		private WebElement clickagent;
		
		//click on logout
		@FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
		private WebElement clicklogout;
		
		
		
	public users(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clicklogin11()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.login.click();
	}
	public void username11(String username)
	{
		this.un.sendKeys(username);
	}
	public void passsword11(String pwd)
	{
		this.pw.sendKeys(pwd);
	}
	public void clicklogin21()
	{
		this.login1.click();
	}
	public void clickusers() throws InterruptedException
	{
		Thread.sleep(3000);
		this.users.click();
	}
	
	//click on user directory
		public void clickuserdirectory() throws InterruptedException
		{
			Thread.sleep(3000);
			this.directory.click();
		}
		
		//click on create user
		public void clickoncreateuser() throws InterruptedException
		{
			Thread.sleep(3000);
			this.createuser.click();
		}
		
		//enter the fname of the user
		public void enterfirstname()
		{
			//this.enterfirstnameuser.sendKeys(fname);
			Random r=new Random();
			String fname="fname"+r.nextInt();	
			enterfirstnameuser.sendKeys(fname);	
		}
		
		//enter the lname of the user
		public void enterlname()
		{
			Random r=new Random();
			String lname="lname"+r.nextInt();		
			enterlastnameuser.sendKeys(lname);
		}
		
		//enter the email
		public void enteremail()
		{
			Random r=new Random();
			String email="email"+r.nextInt()+"@gmail.com";
			this.enteremailuser.sendKeys(email);
		}
		
		//click on submit button
		public void clicksubmituser() throws InterruptedException
		{
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,1900)");
			this.clickonsubmituser.click();
			
		
		
		}
		
		//click on agent panel
		public void clickagent() throws InterruptedException
		{
            Thread.sleep(3000);
			
			this.clickagent.click();
		}
		
		//click on logout
		public void clicklogout() throws InterruptedException
		{
			
			Thread.sleep(3000);
			
			this.clicklogout.click();
		}
		
}
	
	
	
	
	
	
	
	
	
	
	
	

