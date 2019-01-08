package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.priority;

public class priorty extends Basetest 
{
@Test
public void Test13()
{
	priority ptty=new priority(driver);
	ptty.clicklogin();
	ptty.username(input.getdata(excel, "sheet1", 0, 1));
	ptty.passsword(input.getdata(excel, "sheet1", 1, 1));
	ptty.clicklogin1();
	ptty.clickAdminpanel();
	ptty.Priority();
}
}
