package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.tools1;

public class toolsknowledgebase extends Basetest 
{
	@Test
	public void Test14()
	{
		tools1 tool=new tools1(driver);
		tool.clicklogin11();
		tool.username11(input.getdata(excel, "sheet1", 0, 1));
		tool.passsword11(input.getdata(excel, "sheet1", 1, 1));
		tool.clicklogin21();
		tool.clicktoolspage();
		tool.clickknowledgebase();
	}

}
