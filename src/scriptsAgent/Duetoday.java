package scriptsAgent;

import Generic.Basetest;
import Generic.input;
import Page.duetoday;

import org.testng.annotations.Test;

public class Duetoday extends Basetest 
{
@Test
public void Test()
{
	duetoday today=new duetoday(driver);
	today.clicklogin11();
	today.username11(input.getdata(excel, "sheet1", 0, 1));
	today.passsword11(input.getdata(excel, "sheet1", 1, 1));
	today.clicklogin21();
	today.clickdashboard();
	today.clickduetoday();
}
}
