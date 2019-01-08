package Page;

import java.util.concurrent.TimeUnit;

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
}
	
	
	
	
	
	
	
	
	
	
	
	

