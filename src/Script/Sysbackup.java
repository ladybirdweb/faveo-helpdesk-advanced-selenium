package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.systembackup;

public class Sysbackup extends Basetest 
{
	@Test
	public void Test29()
	{
		systembackup backup=new systembackup(driver);
		backup.clicklogin();
		backup.username(input.getdata(excel, "sheet1", 0, 1));
		backup.passsword(input.getdata(excel, "sheet1", 1, 1));
		backup.clicklogin1();
		backup.clickAdminpanel();
		backup.sysbackup();
	}

	
	
}
