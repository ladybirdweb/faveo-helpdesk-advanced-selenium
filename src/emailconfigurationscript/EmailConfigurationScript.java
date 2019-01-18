package emailconfigurationscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import emailconfigurationpage.EmailConfigurationPage;

/*This class contains the email configuration with different testdata*/
public class EmailConfigurationScript extends Basetest{
	
	/*	It is for configuring email for the first time after installation
	via email link provided*/

	@Test(priority=1)
	public void emailConfigViaLinktest() throws InterruptedException
	{
	EmailConfigurationPage ecpLink = new EmailConfigurationPage(driver);
	ecpLink.BasicLogin();
	ecpLink.EnterUsername(input.getdata(excel, "email", 0, 1));
	ecpLink.EnterPassword(input.getdata(excel, "email", 1, 1));
	ecpLink.ClickOnDefLogin();
	ecpLink.ClickOnEmailLinkAftInstallation();
	ecpLink.EnterEmail(input.getdata(excel, "email", 4, 1));
	ecpLink.EnterEName(input.getdata(excel, "email", 5, 1));
	ecpLink.EnterEPassword(input.getdata(excel, "email", 6, 1));
	ecpLink.SelectImap();
	ecpLink.EnterIncHostName(input.getdata(excel, "email", 7, 1));
	ecpLink.EnterIncPort();
	ecpLink.FetchingEncr();
	ecpLink.SelectSmtp();
	ecpLink.EnterOutHostName(input.getdata(excel, "email", 8, 1));
	ecpLink.EnterOutPortSSL();
	ecpLink.SendingEncr();
	ecpLink.ClickOnSave();
	Thread.sleep(10000);
	}
		
	

    /*It is for configuring email from adminpanel	*/	
	
	@Test(priority=2)
	public void emailConfigViaAdminPanel() throws InterruptedException
	{
	EmailConfigurationPage ecpAdmin = new EmailConfigurationPage(driver);
	ecpAdmin.BasicLogin();
	ecpAdmin.EnterUsername(input.getdata(excel, "email", 0, 1));
	ecpAdmin.EnterPassword(input.getdata(excel, "email", 1, 1));
	ecpAdmin.ClickOnDefLogin();
	ecpAdmin.ClickAdminPanel();
	ecpAdmin.ClickOnEmail();
	ecpAdmin.ClickOnCreateEmail();
	ecpAdmin.EnterEmail(input.getdata(excel, "email", 4, 2));
	ecpAdmin.EnterEName(input.getdata(excel, "email", 5, 2));
	ecpAdmin.EnterEPassword(input.getdata(excel, "email", 6, 2));
	ecpAdmin.SelectImap();
	ecpAdmin.EnterIncHostName(input.getdata(excel, "email", 7, 2));
	ecpAdmin.EnterIncPort();
	ecpAdmin.FetchingEncr();
	ecpAdmin.SelectSmtp();
	ecpAdmin.EnterOutHostName(input.getdata(excel, "email", 8, 2));
	ecpAdmin.EnterOutPortTLS();
	ecpAdmin.SendingEncrTLS();
	ecpAdmin.ClickOnSave();
	Thread.sleep(10000);
	}
	
	/*It is for configuring only Incoming Email and outgoing is Disabled*/

	@Test(priority=3)
	public void incomingEmailConfigViaAdminPanel() throws InterruptedException
	{
	EmailConfigurationPage incomingEmail = new EmailConfigurationPage(driver);
	incomingEmail.BasicLogin();
	incomingEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	incomingEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	incomingEmail.ClickOnDefLogin();
	incomingEmail.ClickAdminPanel();
	incomingEmail.ClickOnEmail();
	incomingEmail.ClickOnCreateEmail();
	incomingEmail.EnterEmail(input.getdata(excel, "email", 4, 3));
	incomingEmail.EnterEName(input.getdata(excel, "email", 5, 3));
	incomingEmail.EnterEPassword(input.getdata(excel, "email", 6, 3));
	incomingEmail.SelectImap();
	incomingEmail.EnterIncHostName(input.getdata(excel, "email", 7, 3));
	incomingEmail.EnterIncPort();
	incomingEmail.FetchingEncr();
	incomingEmail.DisablingOutgoing();
	incomingEmail.ClickOnSave();
	Thread.sleep(10000);
	
	}

	/*It is for configuring only Outgoing  Email and Incoming is Disabled*/
	@Test(priority=4)
	public void outgoingEmailConfigViaAdminPanel() throws InterruptedException
	{
	EmailConfigurationPage outgoingEmail = new EmailConfigurationPage(driver);
	outgoingEmail.BasicLogin();
	outgoingEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	outgoingEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	outgoingEmail.ClickOnDefLogin();
	outgoingEmail.ClickAdminPanel();
	outgoingEmail.ClickOnEmail();
	outgoingEmail.ClickOnCreateEmail();
	outgoingEmail.EnterEmail(input.getdata(excel, "email", 4, 4));
	outgoingEmail.EnterEName(input.getdata(excel, "email", 5, 4));
	outgoingEmail.EnterEPassword(input.getdata(excel, "email", 6, 4));
	outgoingEmail.SelectImap();
	outgoingEmail.DisablingIncoming();
	outgoingEmail.SelectSmtp();
	outgoingEmail.EnterOutHostName(input.getdata(excel, "email", 8, 4));
	outgoingEmail.EnterOutPortSSL();
	outgoingEmail.SendingEncr();
	outgoingEmail.ClickOnSave();
	Thread.sleep(10000);
	}


	/*It is for configuring email by selecting department,helptopic 
	 * as well as priority*/
	
	@Test(priority=5)
	public void depEmailConfig() throws InterruptedException, AWTException
	{
	EmailConfigurationPage depEmail = new EmailConfigurationPage(driver);
	depEmail.BasicLogin();
	depEmail.EnterUsername(input.getdata(excel, "email", 0, 1));
	depEmail.EnterPassword(input.getdata(excel, "email", 1, 1));
	depEmail.ClickOnDefLogin();
	depEmail.ClickAdminPanel();
	depEmail.ClickOnEmail();
	depEmail.ClickOnCreateEmail();
	depEmail.EnterEmail(input.getdata(excel, "email", 4, 5));
	depEmail.EnterEName(input.getdata(excel, "email", 5, 5));
	depEmail.EnterEPassword(input.getdata(excel, "email", 6, 5));
	
	//Giving email department,helptopic,priority,if not means default it will take
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	//Selecting department
	robot.keyPress(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_L);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
			
			
			
	//Selecting helptopic
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_L);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
					

	//Selecting priority
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_H);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyPress(KeyEvent.VK_G);
	robot.keyPress(KeyEvent.VK_H);
	robot.keyPress(KeyEvent.VK_ENTER);
	

	depEmail.SelectImap();
	depEmail.EnterIncHostName(input.getdata(excel, "email", 7, 5));
	depEmail.EnterIncPort();
	depEmail.FetchingEncr();
	depEmail.SelectSmtp();
	depEmail.EnterOutHostName(input.getdata(excel, "email", 8, 5));
	depEmail.EnterOutPortSSL();
	depEmail.SendingEncr();
	depEmail.ClickOnSave();
	Thread.sleep(10000);
	}
}


