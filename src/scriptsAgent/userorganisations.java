package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.userorganisation;

public class userorganisations extends Basetest 
{
	@Test
	public void Test15()
	{
		userorganisation organisation=new userorganisation(driver);
		organisation.clicklogin11();
		organisation.username11(input.getdata(excel, "sheet1", 0, 1));
		organisation.passsword11(input.getdata(excel, "sheet1", 1, 1));
		organisation.clicklogin21();
		organisation.clickusers();
		organisation.userorganisations();
	}

}
