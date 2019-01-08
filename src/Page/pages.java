package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class pages extends Basepage 
{
	@FindBy(xpath=".//*[@id='hid']/li/a/i")
	private WebElement login;
	@FindBy(id="user_name")
	private WebElement un;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pw;
	@FindBy(xpath="//button[@class='login-button btn btn-primary btn-block btn-flat']")
	private WebElement login1;
	@FindBy(xpath="//a[@data-target='#tabD']")
	private WebElement toolspage;
	@FindBy(xpath="//a[text()='Knowledge base']")
	private WebElement knowledgebase;
	@FindBy(xpath="//i[@class='fa fa-edit']")
	private WebElement article;
	@FindBy(xpath="//i[@class='fa fa-file-text']")
    private WebElement pages;	
	@FindBy(xpath="//a[text()=' Add pages']")
	private WebElement addpages;
	@FindBy(xpath="//a[text()=' All pages']")
	private WebElement allpages;
	public pages(WebDriver driver) {
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
	public void clicktoolspage()
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		this.toolspage.click();
	}
	public void clickknowledgebase()
	{
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
	    this.knowledgebase.click();
	}
	public void clickpages()
	{
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		this.pages.click();
	}
	public void clickaddpages()
	{
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		this.addpages.click();
	}
	public void clickallpages()
	{
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		this.allpages.click();
	}
}
