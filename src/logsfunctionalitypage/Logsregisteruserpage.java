package logsfunctionalitypage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class Logsregisteruserpage extends Basepage 
{

	//click on register	
	@FindBy(xpath="//a[@style='background-image: url(\"https://cdn.faveohelpdesk.com/themes/default/client/images/register.png\");']")
	private WebElement clickregister;

	//enter the firstname
	@FindBy(xpath="//input[@name='textfield0']")
	private WebElement firstname;

	//enter the lastname
	@FindBy(xpath="//input[@name='textfield1']")
	private WebElement lastname;

	//enter the email
	@FindBy(xpath="//input[@name='mail4']")
	private WebElement email;

	//clcik on register button
	@FindBy(xpath="//button[text()='Register']")
	private WebElement clickregisterbutton;
	
	//click on home button
	@FindBy(xpath="//nav[@class='navbar navbar-default site-navigation']//a[@class='active ']")
    private WebElement clickhomebutton;
	
	public Logsregisteruserpage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	//method to click register button
	public void clickregisterbutton() throws InterruptedException
	{
	Thread.sleep(3000);
	this.clickregister.click();
	}

	//method to enter the firstname
	public void enterfirstname()
	{
	Random r=new Random();
	String fname="fname"+r.nextInt();
	firstname.sendKeys(fname);
	}

	//method to enter the lastname
	public void enterlname()
	{
	Random r=new Random();
	String lname="lname"+r.nextInt();
	lastname.sendKeys(lname);
	}

	//method to enter the email
	public void enteremail()
	{
	Random r=new Random();
	String email="mail"+r.nextInt()+"@gmail.com";
	this.email.sendKeys(email);
	}

	//method to click register button
	public void hitregister()
	{
	this.clickregisterbutton.click();
	}
	
	//click on home button
	public void clickhomebutton()
	{
		this.clickhomebutton.click();
	}
}
