package emailconfigurationscript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import emailconfigurationpage.EmailConfigurationPage;

public class DeleteEmailConfiguration extends Basetest {
	
	private static final WebElement DefDelEmail = null;

	/*	This method is for deleting the email */
	@SuppressWarnings("static-access")
	
	@Test(priority=1)
	public void deleteDefEmailConfig() throws InterruptedException
	{
	EmailConfigurationPage deldefEmail = new EmailConfigurationPage(driver);
	deldefEmail.BasicLogin();
	deldefEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	deldefEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	deldefEmail.ClickOnDefLogin();
	deldefEmail.ClickAdminPanel();
	deldefEmail.ClickOnEmail();
	deldefEmail.isClickable(DefDelEmail);
	
	//This is for checking able to delete default email or not
	boolean bst = DeleteEmailConfiguration.isClickable(DefDelEmail);
	if(bst==true){
		System.out.println("Able to delete default email");
		}
	else 
		{
		System.out.println("Unable to delete default email");
		}
	
	}
	
	/*This call is for deleting system email id*/
	@Test(priority=2)
	public void deleteEmailConfig() throws InterruptedException
	{
	EmailConfigurationPage delEmail = new EmailConfigurationPage(driver);
	delEmail.BasicLogin();
	delEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	delEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	delEmail.ClickOnDefLogin();
	delEmail.ClickAdminPanel();
	delEmail.ClickOnEmail();
	delEmail.DelEmail();
	delEmail.DelOnPopup();

	}
}
