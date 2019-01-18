package emailconfigurationscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import emailconfigurationpage.EmailConfigurationPage;

//This class is for editing the emails
public class EditEmailConfiguration extends Basetest {
	
/*	This method is for simple edit and give password and update */
	@Test(priority=1)
	public void editEmailConfig() throws InterruptedException
	{
	EmailConfigurationPage editEmail = new EmailConfigurationPage(driver);
	editEmail.BasicLogin();
	editEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	editEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	editEmail.ClickOnDefLogin();
	editEmail.ClickAdminPanel();
	editEmail.ClickOnEmail();
	editEmail.EditDefEmail();
	editEmail.EnterEPassword(input.getdata(excel, "email", 6, 1));
	editEmail.ClickOnUpdate();
	Thread.sleep(10000);
	}
	
	/*This method is for making email as default*/
	@Test(priority=2)
	public void makeDefEmailConfig() throws InterruptedException
	{
	EmailConfigurationPage makedefEmail = new EmailConfigurationPage(driver);
	makedefEmail.BasicLogin();
	makedefEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	makedefEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	makedefEmail.ClickOnDefLogin();
	makedefEmail.ClickAdminPanel();
	makedefEmail.ClickOnEmail();
	makedefEmail.EditMailForDef();
	makedefEmail.EnterEPassword(input.getdata(excel, "email", 6, 2));
	makedefEmail.DefCheckbox();
	makedefEmail.ClickOnUpdate();
	Thread.sleep(10000);
	}
	
	
	/*This method is for clicking the check box for delete mails from email after fetching*/
	@Test (priority=3)
	public void delFetchMail() throws InterruptedException
	{
	EmailConfigurationPage delFetEmail = new EmailConfigurationPage(driver);
	delFetEmail.BasicLogin();
	delFetEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	delFetEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	delFetEmail.ClickOnDefLogin();
	delFetEmail.ClickAdminPanel();
	delFetEmail.ClickOnEmail();
	delFetEmail.EditEmailForDelFetMails();
	delFetEmail.EnterEPassword(input.getdata(excel, "email", 6, 3));
	delFetEmail.SelDelFetchEmails();
	delFetEmail.ClickOnUpdate();
	Thread.sleep(10000);
	}
	
}
