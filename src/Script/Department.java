package Script;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.faveodepartment;

public class Department extends Basetest
{
	@Test
	public void test3()
	{
		faveodepartment dept=new faveodepartment(driver);
		dept.clicklogin();
		dept.username(input.getdata(excel, "sheet1", 0, 1));
		dept.passsword(input.getdata(excel, "sheet1", 1, 1));
		dept.clicklogin1();
		dept.clickDepartments();
	}
	

}
