package emailconfigurationscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import emailconfigurationpage.EmailConfigurationPage;

public class EmailConfigurationScript extends Basetest{
	private static final String email = null;

	@Test
	public void emailConfigViaLinktest() throws InterruptedException
	{
	EmailConfigurationPage ecp = new EmailConfigurationPage(driver);
	ecp.BasicLogin();
	ecp.EnterUsername(input.getdata(excel, "email", 0, 1));
	ecp.EnterPassword(input.getdata(excel, "email", 1, 1));
	ecp.ClickOnDefLogin();
	ecp.ClickOnEmailLinkAftInstallation();
	ecp.EnterEmail(email);
	
	}	

}
