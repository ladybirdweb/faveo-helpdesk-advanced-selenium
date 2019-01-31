package pageAgent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class users extends Basepage 
{
	//click on login button
	@FindBy(xpath=".//*[@id='hid']/li/a/i")
	private WebElement login;
	
	//enter the username
	@FindBy(id="user_name")
	private WebElement un;
	
	//enter the password
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pw;
	
	//click on login button
	@FindBy(xpath="//button[@class='login-button btn btn-primary btn-block btn-flat']")
	private WebElement login1;
	
	//click on users
	@FindBy(xpath="/html/body/div/header/nav/div/ul[1]/li[2]/a")
	private WebElement users;
	
	//click on user directory
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
	
	
	public users(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//method for clicking on login button
	public void clicklogin11()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.login.click();
	}
	
	//enter the username
	public void username11(String username)
	{
		this.un.sendKeys(username);
	}
	
	//enter the password
	public void passsword11(String pwd)
	{
		this.pw.sendKeys(pwd);
	}
	
	//click on login
	public void clicklogin21()
	{
		this.login1.click();
	}
	
	//click on users
	public void clickusers()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.users.click();
	}
	
	
	public void clickdirectory()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.directory.click();
		if(driver.getPageSource().contains("List of users")){
			System.out.println(" List of users present");
			}else{
			System.out.println("Text is absent");
			}
	}
	
	//click on user directory
	public void clickuserdirectory()
	{
		this.directory.click();
	}
	
	//click on create user
	public void clickoncreateuser()
	{
		this.createuser.click();
	}
	
	//enter the fname of the user
	public void enterfirstname(String fname)
	{
		this.enterfirstnameuser.sendKeys(fname);
	}
	
	//enter the lname of the user
	public void enterlname(String lname)
	{
		this.enterlastnameuser.sendKeys(lname);
	}
	
	//enter the email
	public void enteremail(String email)
	{
		this.enteremailuser.click();
	}
	
	//click on submit button
	public void clicksubmit()
	{
		this.clickonsubmituser.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
