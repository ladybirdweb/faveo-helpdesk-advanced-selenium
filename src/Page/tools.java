package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage1;

public class tools extends Basepage1 
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
@FindBy(xpath="//a[text()='Canned response']")
private WebElement cannedresponse;
public tools(WebDriver driver) {
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
public void clickcannedresponse()
{
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	this.cannedresponse.click();
	if(driver.getPageSource().contains("List of canned response")){
		System.out.println(" text is present");
		}else{
		System.out.println("Text is absent");
		}
}











}
