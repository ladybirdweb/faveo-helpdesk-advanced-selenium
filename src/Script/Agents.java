package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveoagentpage;

public class Agents extends Basetest 
{
	@Test
	public void test2()
	{
		faveoagentpage Agent=new faveoagentpage(driver);
		Agent.clicklogin();
		Agent.username(input.getdata(excel, "sheet1", 0, 1));
		Agent.passsword(input.getdata(excel, "sheet1", 1, 1));
		Agent.clicklogin1();
		Agent.clickAdminpanel();
		Agent.clickAgents();
		
	}
}
