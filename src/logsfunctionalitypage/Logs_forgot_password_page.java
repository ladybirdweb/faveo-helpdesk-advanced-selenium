package logsfunctionalitypage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class Logs_forgot_password_page extends Basepage
{
      //click on forgot password
	  @FindBy(xpath="//a[@id='default-forgot-password']")
	  private WebElement clickforgotpassword;
	  
	  //enter the email
	  @FindBy(xpath="//input[@id='text-field']")
	  private WebElement entertheemail;
	  
	  //click on send
	  @FindBy(xpath="//div[@class='login-box']//button[@class='btn btn-primary btn-block btn-flat']")
	  private WebElement clicksend;
	  
	  //click on home button
	  @FindBy(xpath="//nav[@class='navbar navbar-default site-navigation']//a[text()='Home']")
      private WebElement clickhomebtn;	
	
	  public Logs_forgot_password_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	  }
	  
	  //method  for clickforgot password
	  public void clickforgotpassword()
	  {
		  this.clickforgotpassword.click();
	  }
	  
	  //method for entering the email
	  public void enter_the_email()
	  {
		  this.entertheemail.sendKeys("aamirkhan@gmail.com");
	  }
	  
	  //click on send button
	  public void clicksend() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  this.clicksend.click();
	  }
	  
	  //click on home button
	  public void clickhomebutton()
	  {
		  this.clickhomebtn.click();
	  }
	  
}
