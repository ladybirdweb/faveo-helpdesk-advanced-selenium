package loginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage1;

public class authLogin extends Basepage1 
{
   @FindBy(xpath="//input[@placeholder='Email/Username']")
   private WebElement authusername;
   @FindBy(xpath="//input[@placeholder='Password']")
   private WebElement  authpassword;
   @FindBy(xpath="//button[@class=\"login-button btn btn-primary btn-block btn-flat\"]")
   private WebElement authloginbuttion;
   @FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div")
   private WebElement unverifiedtextbox;
   @FindBy(xpath="//a[text()='Admin Panel']")
   private WebElement adminpanel;
   @FindBy(xpath="//div[@class='alert alert-danger']")
   private WebElement BAN;
   @FindBy(xpath="//a[@onclick='clickDashboard(event);']")
   private WebElement agent;
   @FindBy(xpath="//span[text()='Submit a ticket']")
   private WebElement userverified;
   @FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div")
   private WebElement userunverified;
   @FindBy(xpath="//div[@class='alert alert-danger']")
   private WebElement BANUSER;
    public authLogin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
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
   public void clcikauthloginbuttion() throws InterruptedException
   {
	   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   this.authloginbuttion.click();
	}
}
