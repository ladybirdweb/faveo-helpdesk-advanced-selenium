package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.departmentperformance;

public class DepartmentPerformance extends Basetest 
{
@Test
public void Test5()
{
	departmentperformance performance=new departmentperformance(driver);
	performance.clicklogin11();
	performance.username11(input.getdata(excel, "sheet1", 0, 1));
	performance.passsword11(input.getdata(excel, "sheet1", 1, 1));
	performance.clicklogin21();
	performance.clickreportpage();
	performance.clickdepartmentperformance();
}
}
