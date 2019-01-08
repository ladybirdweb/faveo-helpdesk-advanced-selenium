package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.users;

public class Users extends Basetest
{
@Test
public void Test14()
{
	users user=new users(driver);
	user.clicklogin11();
	user.username11(input.getdata(excel, "sheet1", 0, 1));
	user.passsword11(input.getdata(excel, "sheet1", 1, 1));
	user.clicklogin21();
	user.clickusers();
	user.clickdirectory();
}
}
