package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.unassignedoverdue;

public class overdue extends Basetest 
{
@Test
public void Test()
{
	unassignedoverdue due=new unassignedoverdue(driver);
	due.clicklogin11();
	due.username11(input.getdata(excel, "sheet1", 0, 1));
	due.passsword11(input.getdata(excel, "sheet1", 1, 1));
	due.clicklogin21();
	due.clickdashboard();
	due.clickunassignedoverdue();
}
}
