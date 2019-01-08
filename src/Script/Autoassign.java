package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.autoassign;

public class Autoassign extends Basetest 
{
@Test
public void Test19()
{
	autoassign assign=new autoassign(driver);
	assign.clicklogin();
	assign.username(input.getdata(excel, "sheet1", 0, 1));
	assign.passsword(input.getdata(excel, "sheet1", 1, 1));
	assign.clicklogin1();
	assign.clickAdminpanel();
	assign.clickautoassign();
}
}
