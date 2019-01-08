package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.closeticketworkflow;

public class Closeticketworkflow extends Basetest 
{
@Test
public void Test16()
{
	closeticketworkflow flow=new closeticketworkflow(driver);
	flow.clicklogin();
	flow.username(input.getdata(excel, "sheet1", 0, 1));
	flow.passsword(input.getdata(excel, "sheet1", 1, 1));
	flow.clicklogin1();
	flow.clickAdminpanel();
	flow.closeticketworkflows();
}
}
